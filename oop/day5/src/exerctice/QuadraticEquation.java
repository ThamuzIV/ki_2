package exerctice;

public class QuadraticEquation {
    private double a,b,c;
    private double discriminant;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void getDiscriminant() {
        discriminant = b*b - 4*a*c;
    }

    public double getRoot1() {
        return  (-this.b + Math.pow(discriminant,0.5))/(2*a);
    }

    public double getRoot2() {
        return  (-this.b - Math.pow(discriminant,0.5))/(2*a);
    };

    public void findRoot() {
        if (discriminant < 0) {
            System.out.println("The equation has no roots");
        } else {
            System.out.println("root1: " + getRoot1());
            System.out.println("root2: " + getRoot2());
        }
    }

}
