package block2.exercise6_1;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        super(side,side);
    }

    public Square(double side, String color, Boolean filled) {
        super(side,side,color,filled);
    }

    @Override
    public String show() {
        return "Square : " + this.getWidth() + ", " + this.getColor() + this.isFilled();
    }

}
