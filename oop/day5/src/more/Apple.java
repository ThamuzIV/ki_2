package day5.src.more;

public class Apple {
    double weight;
    String color;
    static Apple non;

    public Apple() {
        this.weight = Math.random()*(0.5) + 0.5;
        ripeFruit();
    }

    private void ripeFruit() {
        if (Math.floor(Math.random() * (2)) == 0) {
            this.color = "greed";
        } else {
            this.color = "red";
        }
    }
}
