

public class Mobile {
    private static int countMobi = 1;
    private int mobiCode;
    private String brand;
    private String color;
    private int width;
    private int height;
    private int thickness;
    private int energy;

    public Mobile() {
        this.mobiCode = codeGeneration();
        this.brand = "nokia";
        this.color = "blueberry";
        this.width = 30;
        this.height = 60;
        this.thickness = 1;
        this.energy = 50;
    }

    public Mobile(String brand) {
        this();
        this.brand = brand;
    }
    public Mobile(String brand,String color) {
        this(brand);
        this.color = color;
    }

    public Mobile(String brand, String color, byte width, byte height, byte thickness, int energy) {
        this(brand,color);
        this.width = width;
        this.height = height;
        this.thickness = thickness;
        this.energy = energy;
    }

    private static int codeGeneration() {
        return (100 + Mobile.countMobi++);
    }

    public int getMobiCode() {
        return mobiCode;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getThickness() {
        return thickness;
    }

    public int getEnergy() {
        return energy;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public void setEnergy(int energy) {
        if (energy >= 0 && energy <= 100) {
            this.energy = energy;
        }
    }

    public void showMobile() {
        System.out.println(
                this.getMobiCode() + "\n" +
                this.getBrand() + "\n" +
                this.getColor() + "\n" +
                this.getWidth() + "\n" +
                this.getHeight() + "\n" +
                this.getThickness() + "\n" +
                this.getEnergy() + "\n"
        );
    }
}
