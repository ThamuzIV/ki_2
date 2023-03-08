package day5.src.more;

public class Human {
    String name;
    boolean male;
    double weight;
    Apple appleInHand;

    public Human(String name, boolean sex, double weight) {
        this.name = name;
        this.male = sex;
        this.weight = weight;
        this.appleInHand = Apple.non;
    }

    void saySomeThing() {
        switch (appleInHand.color) {
            case "greed":
                System.out.println("this apple is chua vãi lozz");
            break;
            case "red":
                System.out.println("this apple is ngon thế");
            break;
        }
    }

    void stealApple(Apple apple) {
        this.appleInHand = apple;
    }

    void eatApple() {
        if (appleInHand.weight > 0) {
            this.weight += appleInHand.weight / 10;
            appleInHand.weight -= appleInHand.weight / 10;
            saySomeThing();
        } else {
            System.out.println("are you stupid \n have cái deo gì đâu mà eat?");
        }
    }

    void juggle(Human receiver) {
        receiver.appleInHand = this.appleInHand;
        this.appleInHand = Apple.non;
    }

    void check(Human see) {
        System.out.println("name: " + see.name + " male: " + see.male + " weight: " + see.weight);
    }

    public Double measureApple() {
        return this.appleInHand.weight;
    }

}
