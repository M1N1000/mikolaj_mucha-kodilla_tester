package com.kodilla.parametrized_tests.homework;

public class Person {
    private double heightMeters;
    private double weightKilogram;

    public Person(double heightMeters, double weightKilogram) {
        this.heightMeters = heightMeters;
        this.weightKilogram = weightKilogram;
    }

    public String getBMI() {
        double bmi = weightKilogram / (heightMeters * heightMeters);

        if (bmi < 15) {
            return "Very small underweight";
        } else if (bmi < 16) {
            return "Severely underweight";
        } else if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal(Healthy weight)";
        } else if (bmi < 30) {
            return "Overweight";
        } else if (bmi < 35) {
            return "Obese class I(Moderate obese)";
        } else if (bmi < 40) {
            return "Obese class II(Severely obese)";
        } else if (bmi < 45) {
            return "Obese class III( Very Severely obese)";
        } else if (bmi < 50) {
            return "Obese class IV(Very severely obese)";
        } else if (bmi < 60) {
            return "Obese class V(Super obese)";
        }

        return "Obese Class VI (Hyper Obese)";
    }
}
