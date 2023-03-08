package day5.src.exerctice;

import practise.Rectangle;

public class RectangleExe {
    int width,height;

    public void creat(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public String getArea() {
        return "Area rectangle: " + height*width;
    }

    public int getPerimeter() {
        return (height + width)*2;
    }

    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
