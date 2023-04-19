package block2.day2.AnimalAndInterface;

import block2.day2.AnimalVsInterface.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public void howToEat() {
        System.out.println("gà rán");
    }

    @Override
    void makeSound() {
        System.out.println("cục cục cục.... cứcccc");
    }
}
