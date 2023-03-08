package day5.src.more;

import java.io.InputStream;
import java.util.Scanner;

public class use {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner input = new Scanner(in);
        System.out.println("            menu\n" +
                            "1: Tom and Jerry\n" +
                            "2: Television\n" +
                            "3: Bulb\n" +
                            "4: Flash\n" +
                            "5: Adam muda muda");
        int choose = input.nextInt();

        switch (choose) {
            case 1: useTomAndJerry();
            break;
            case 2: useTelevision();
            break;
            case 3: useSwitchAndBulb();
            break;
            case 4: useFlash();
            break;
            case 5: useHuman();
            break;
        }

    }

    static void useTomAndJerry() {
        InputStream in = System.in;
        Scanner input = new Scanner(in);
        System.out.println("Enter name cat,weight,speed");
        Jerry ghost = new Jerry();

        String nameCat = input.next();
        double weightCat = input.nextDouble();
        double speedCat = input.nextDouble();
        Tom tom1 = new Tom(nameCat,weightCat,speedCat,ghost);

        System.out.println("Enter name rat,weight,speed");
        String nameRat = input.next();
        double weightRat = input.nextDouble();
        double speedRat = input.nextDouble();
        Jerry jerry1 = new Jerry(nameRat,weightRat,speedRat);

        System.out.println(jerry1.IsLive() + " " + jerry1.name + " " + jerry1.weight + " " + jerry1.speed);
        System.out.println("tom: " + tom1.name + " " + tom1.weight + " " + tom1.speed);

        tom1.catchRat(jerry1);
        tom1.eat();
        System.out.println("tom: " + tom1.name + " " + tom1.weight + " " + tom1.speed);
    }

    static void useTelevision() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter button");
        String button = sc.next();
        remote.powerButton();
        System.out.println(television.show());
        remote.rightButton(button);
        remote.leftButton(button);
        int nbButton = sc.nextInt();
        remote.numberButton(nbButton);
        System.out.println(television.show());
        remote.powerButton();
        System.out.println(television.show());
    }

    static void useSwitchAndBulb() {
        Bulb bulb1 = new Bulb();
        Bulb bulb2 = new Bulb();
        Bulb bulb3 = new Bulb();
        Switch switchA = new Switch();
        switchA.up();
        switchA.link(bulb1);
        switchA.link(bulb2);
        System.out.println("bulb1: " + bulb1.isOn() + " bulb2: " + bulb2.isOn() + " bulb3: " + bulb3.isOn() );
        switchA.down();
        switchA.link(bulb2);
        System.out.println("bulb1: " + bulb1.isOn() + " bulb2: " + bulb2.isOn() + " bulb3: " + bulb3.isOn() );

    }

    static void useFlash() {
        Battery battery1 = new Battery();
        Flash flash1 = new Flash(battery1);
        flash1.turnOn();
        System.out.println(battery1.energy + "  " + flash1.battery.energy);
    }

    static void useHuman() {
        double weight = 60.5;
        boolean male = true;
        Human Adam = new Human("Adam",male,weight);
        weight = 48.7;
        male = false;
        Human Eva = new Human("Eva",male,weight);

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();

        Adam.stealApple(apple1);
        Adam.eatApple();
        System.out.println(Adam.measureApple());
        Eva.check(Adam);
        Adam.stealApple(apple2);
        Adam.eatApple();
        System.out.println(Adam.measureApple());
        Eva.check(Adam);
        Adam.juggle(Eva);
        Eva.eatApple();
        Adam.check(Eva);
        Eva.stealApple(apple3);
        System.out.println(Eva.measureApple());
        Eva.eatApple();
        System.out.println(Eva.measureApple());
        Adam.check(Eva);
    }
}
