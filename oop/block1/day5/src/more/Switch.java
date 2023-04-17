package block1.day5.src.more;

public class Switch {
    boolean status;

    public void up() {
        this.status = true;
    }

    public void down() {
        this.status = false;
    }

    public void link(Bulb bulb) {
        if (status) {
            bulb.turnOn();
        } else {
            bulb.turnOff();
        }
    }
}
