package block1.day5.src.exerctice;

public class FanNasonic {

    public FanNasonic() {}
    public String speed;

    public int mode = 1;
    private boolean status = false;
    public final int radius = 5;

    public String color = "red";

    public boolean turnOn() {this.status = true;return true;}

    public boolean turnOff() {this.status = false;return false;}

    public void setMode() {
        this.mode += 1 ;
        if (this.mode > 3) {
            this.mode = 1;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String speed() {

        switch (this.mode) {
            case 1 : this.speed = "slow"; break;
            case 2 : this.speed = "medium"; break;
            case 3 : this.speed = "flash"; break;
        }

        return speed;
    }

    public String getFan() {
        if (status) {
            return this.speed() + " " + color + " " + radius + " fan is on";
        } else {
            return "fan is off";
        }


    }
}
