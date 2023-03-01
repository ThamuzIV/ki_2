package practise;

public class Circle {
    double radius;
    String color;

    public void Circle(double radius,String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI*radius*radius ;
    }
}
