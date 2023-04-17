package block1.day5.src.more;

public class Flash {
    boolean glowing;
    Battery battery;

    public Flash(Battery battery) {
        glowing = false;
        this.battery = battery;
        System.out.println(this.battery);
    }

    public boolean isOn() {
        return this.glowing;
    }
    public void turnOn() {
        if (this.battery.energy > 0) {
            this.glowing = true;
            this.battery.energy --;
        }
    }

    public void turnOff() {
        this.glowing = false;
    }

}
