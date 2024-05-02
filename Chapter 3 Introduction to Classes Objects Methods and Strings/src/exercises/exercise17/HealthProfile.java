package exercises.exercise17;

import java.lang.Math;


public class HealthProfile {
    String name;
    String lastName;
    String gender;
    Integer monthBirth;
    Integer dayBirth;
    Integer yearBirth;
    Double height;
    Double weight;

    public HealthProfile(String name, String lastName, String gender, Integer monthBirth, Integer dayBirth, Integer yearBirth,
                         Double height, Double weight) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.monthBirth = monthBirth;
        this.dayBirth = dayBirth;
        this.yearBirth = yearBirth;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getMonthBirth() {
        return monthBirth;
    }

    public void setMonthBirth(Integer monthBirth) {
        this.monthBirth = monthBirth;
    }

    public Integer getDayBirth() {
        return dayBirth;
    }

    public void setDayBirth(Integer dayBirth) {
        this.dayBirth = dayBirth;
    }

    public Integer getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(Integer yearBirth) {
        this.yearBirth = yearBirth;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer personAge(int currentYear) {
        return currentYear - yearBirth;
    }


    public Integer maximumHeartRate(int currentYear) {
        return 220 - personAge(currentYear);
    }

    public Integer targetMinimumHeartRate(int currentYear) {
        return (int) (maximumHeartRate(currentYear) * 0.5);
    }

    public Integer targetMaximumHeartRate(int currentYear) {
        return (int) (maximumHeartRate(currentYear) * 0.8);
    }

    public Double bmiCalculator() {
        return weight / Math.pow(height, 2);
    }

    public String toString() {
        String builder = String.valueOf(new StringBuilder().append("BMI VALUES\n").append("Your BMI: " + Math.round(bmiCalculator()))
                .append("Underweight: less than 18.5\n").append("Normal: between 18.5 and 24.9\n").append("Overweight: between 25 and 29.9\n")
                .append("Obese: 30 or greater"));
        return builder;
    }
}

