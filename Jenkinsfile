pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                sh 'javac -cp .:junit-4.13.2.jar src/*.java evosuite-tests/*.java'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'java -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar:evosuite-standalone-runtime-1.0.6.jar org.junit.runner.JUnitCore WeightHelper_ESTest'
            }
        }
    }
}