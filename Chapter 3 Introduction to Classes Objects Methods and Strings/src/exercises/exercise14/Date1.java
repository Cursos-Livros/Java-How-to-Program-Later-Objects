package exercises.exercise14;

public class Date1 {
    Integer month;
    Integer day;
    Integer year;

    public Date1(Integer month, Integer day, Integer year) {
        this.month = month;
        this.day = day;
        this.year = year;
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

    public String displayDate(){
        return month + "/" + day + "/" + year;
    }
}
