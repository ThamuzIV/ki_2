package block1.day5.src.practise;

public class Rectangle {
   double width, height;
    public void Rectangle(double width, double height) {
       this.height = width;
       this.width = height;
    }

    public double getArea() {
       return this.width * this.height;
    }

    public double getPerimeter() {
       return (this.width + this.height)*2;
    }

    public String display() {
       return "practise.rectangle{" + "width= " + width + ", height= " + height + "}";
    }


}



