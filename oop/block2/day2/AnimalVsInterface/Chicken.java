package block2.day2.AnimalVsInterface;

public class Chicken extends Animal implements Edible{
    @Override
    public void howToEat() {
        System.out.println("gà rán");
    }

    @Override
    void makeSound() {
        System.out.println("cục cục cục.... cứcccc");
    }
}
