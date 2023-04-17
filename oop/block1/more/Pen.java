package block1.more;

public class Pen {
    private String name;
    private int width;
    private String color;

    public Pen() {
        this.name = "pen1";
        this.width = 10;
        this.color = "black";
    }
    public Pen(String name,int width,String color) {
        this.name = name;
        this.width = width;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void show() {
        System.out.println(
                this.getName() + "\n" +
                this.getWidth() + "\n" +
                this.getColor()
        );
    }
}
