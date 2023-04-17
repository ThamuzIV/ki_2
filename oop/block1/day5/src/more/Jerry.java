package block1.day5.src.more;

public class Jerry {
    String name;
    double weight;
    double speed;
    boolean isLive;
    public Jerry() {
        this.name = "";
    }

    public Jerry(String name, double weight,double speed) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
        this.isLive = true;
    }
    void chirp() {
        System.out.println("chít chít");
    }

    public void setLive() {
        this.isLive = false;
    }

    boolean IsLive() {
        return this.isLive;
    }
}
