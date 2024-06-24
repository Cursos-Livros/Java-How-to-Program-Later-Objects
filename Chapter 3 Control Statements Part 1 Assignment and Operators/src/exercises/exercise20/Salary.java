package exercises.exercise20;

public class Salary {
    private Integer numberWorkHours;
    private Double valueHourWorked;

    public Salary(Integer numberWorkHours, Double valueHourWorked) {
        this.numberWorkHours = numberWorkHours;
        this.valueHourWorked = valueHourWorked;
    }

    public Integer getNumberWorkHours() {
        return numberWorkHours;
    }

    public void setNumberWorkHours(Integer numberWorkHours) {
        this.numberWorkHours = numberWorkHours;
    }

    public Double getValueHourWorked() {
        return valueHourWorked;
    }

    public void setValueHourWorked(Double valueHourWorked) {
        this.valueHourWorked = valueHourWorked;
    }

    public Double straightTimeValue() {
        return (double) (numberWorkHours * valueHourWorked);
    }

    public Double straightTimeValue40() {
        return (double) (valueHourWorked * 40);
    }

    public Integer extraTime() {
        return -(40 - numberWorkHours);
    }

    public Double extraTimeValue() {
        double halfSalary = straightTimeValue() * 0.5;
        return valueHourWorked + halfSalary;
    }

    public Double grossSalary() {
        if (straightTimeValue() < 40) {
            return straightTimeValue();
        }
        return straightTimeValue40() + (extraTimeValue() * extraTime());
    }
}
