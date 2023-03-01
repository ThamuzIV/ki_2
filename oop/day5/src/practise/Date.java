package practise;

public class Date {
    byte day,month,year;

    public  Date(byte day, byte month, byte year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public byte getDay() {
        return day;
    }

    public byte getMonth() {
        return month;
    }

    public byte getYear() {
        return year;
    }

    public void setDay(byte day) {
        this.day = day;
    }

    public void setMonth(byte month) {
        this.month = month;
    }

    public void setYear(byte year) {
        this.year = year;
    }
}
