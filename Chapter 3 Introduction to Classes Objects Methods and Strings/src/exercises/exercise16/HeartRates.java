package exercises.exercise16;

public class HeartRates {
    private String name;
    private String lastName;
    private Integer month;
    private Integer day;
    private Integer year;

    public HeartRates(String name, String lastName, Integer month, Integer day, Integer year) {
        this.name = name;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.year = year;
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

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer personAge(int currentYear) {
        return currentYear - year;
    }


    public Integer maximumHeartRate(int currentYear) {
        return 220 - personAge(currentYear);
    }

    public Integer targetMinimumHeartRate(int currentYear) {
        return (int) (maximumHeartRate(currentYear) * 0.5);
    }

    public Integer targetMaximumHeartRate(int currentYear) {
        return (int) (maximumHeartRate(currentYear) * 0.8) ;
    }
}
