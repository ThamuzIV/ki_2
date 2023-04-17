package block1.day5.src.more;

public class Bulb {
    boolean status;

    public void turnOn() {
        this.status = true;
    }

    public void turnOff() {
        this.status = false;
    }

    public boolean isOn() {
        return this.status;
    }


}
