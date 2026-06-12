public class WeightHelper {

    // Method to calculate BMI
    public double calculateBMI(double height, double weight) {
        double heightMeters = height / 100;

        return weight / (heightMeters * heightMeters);
    }

    // Method to return BMI category
    public String getBMICategory(double height, double weight){
        double bmi = calculateBMI(height, weight);

        if (bmi < 18.5) return "Underweight";
        if (bmi >= 18.5 && bmi < 25) return "Normal weight";
        if (bmi >= 25 && bmi < 30) return "Overweight";

        return "Obese";
    }
}