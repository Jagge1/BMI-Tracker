# BMI Tracker

This project contains a simple Java class that calculates BMI and returns a BMI category based on height and weight.

## Contents

- `src/WeightHelper.java` - the main class that contains the BMI logic.
- `src/TestWeightHelper.java` - manual unit tests using JUnit 5.
- `src/WeightHelper_ESTest.java` - automatically generated tests from EvoSuite.
- `src/WeightHelper_ESTest_scaffolding.java` - support class used by the EvoSuite tests.
- `Jenkinsfile` - an example pipeline for compiling and running tests.

## Features

`WeightHelper` contains two methods:

```java
calculateBMI(double height, double weight)
```

Calculates BMI using height in centimeters and weight in kilograms.

```java
getBMICategory(double height, double weight)
```

Returns a category based on the BMI value:

- `Underweight` - BMI below 18.5
- `Normal weight` - BMI from 18.5 to below 25
- `Overweight` - BMI from 25 to below 30
- `Obese` - BMI 30 or higher

## Example

```java
WeightHelper helper = new WeightHelper();

double bmi = helper.calculateBMI(170, 65);
String category = helper.getBMICategory(170, 65);

System.out.println(bmi);
System.out.println(category);
```

## Tests

The project includes both manual tests and EvoSuite-generated tests.

The manual tests check common BMI categories and boundary values between categories. The EvoSuite tests are automatically generated and cover additional edge cases.

## Compilation

Example command for compiling the main class and the EvoSuite scaffolding class:

```powershell
javac -cp ".;evosuite-standalone-runtime-1.0.6.jar;evosuite-1.0.6.jar" src\WeightHelper.java src\WeightHelper_ESTest_scaffolding.java
```

JUnit dependencies are required in the classpath to run all tests.

## Requirements

- Java JDK
- JUnit for unit tests
- EvoSuite runtime for the generated EvoSuite tests

## Purpose

This project was created as an assignment to demonstrate basic Java logic, unit testing, and test generation with EvoSuite.
