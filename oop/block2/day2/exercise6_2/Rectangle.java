package block2.day2.exercise6_2;

public class Rectangle implements GeometricObject{
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    private double width;
    private double length;

    public Rectangle(double width,double length) {
        this.width = width;
        this.length = length;
    }

    public String toStringg() {
        return " " + this.width + this.length;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }
}