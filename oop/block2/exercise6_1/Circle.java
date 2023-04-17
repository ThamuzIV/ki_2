package block2.exercise6_1;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, Boolean filled) {
        super(color, filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(this.radius, 2) * 3.14;
    }

    @Override
    public double getPerimeter() {
        return this.radius * 2 * 3.14;
    }

    @Override
    public String show() {
        return "Circle: " + this.getColor() + ", " + this.isFilled() + ", " + this.getRadius();
    }
}
