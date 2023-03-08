package day5.src.more;

public class Tom {
    String name;
    double weight;
    double speed;
    Jerry ratInHand;

    public Tom(String name, double weight, double speed,Jerry rat) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
        this.ratInHand = rat;
    }

    void chirp() {
        System.out.println("ngao naof");
    }

    void catchRat(Jerry rat){
        if (this.speed > rat.speed &&ratInHand.name.equals("")) {
            ratInHand = rat;
        }
    }

    void eat() {
        if (!ratInHand.name.equals("")) {
            this.weight += ratInHand.weight;
            ratInHand.name = "";
        }
    }
}
