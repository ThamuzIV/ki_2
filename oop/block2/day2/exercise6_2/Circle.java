package block2.day2.exercise6_2;

public class Circle implements GeometricObject {
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String toStringg() {
        return "radius : " + this.radius;
    }

    @Override
    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }
}
