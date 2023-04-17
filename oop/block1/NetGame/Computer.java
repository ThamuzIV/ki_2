package block1.NetGame;

import org.w3c.dom.ls.LSOutput;

public class Computer {
    private String computerId;
    private String nameCp;
    private double weight;
    private  String cpu;
    private int ram;
    private String OS;
    private int hardDrive;
    private int price;

    public Computer() {
        this.computerId = "MT0001";
        this.nameCp = "default";
        this.weight = 2;
        this.ram = 8;
        this.hardDrive = 128;
        this.price = 1000000;
        this.cpu = "i3";
        this.OS = "window";
    }

    public Computer(String computerId) {
        this();
        this.computerId = computerId;
    }

    public Computer(String computerId, String nameCp) {
        this(computerId);
        this.nameCp = nameCp;
    }

    public Computer(String computerId, String nameCp, double weight) {
        this(computerId, nameCp);
        this.weight = weight;
    }

    public Computer(String computerId, String nameCp, double weight, int ram) {
        this(computerId, nameCp, weight);
        this.ram = ram;
    }
    public Computer(String computerId, String nameCp, double weight, int ram,int hardDrive) {
        this(computerId, nameCp, weight,ram);
        this.hardDrive = hardDrive;
    }
    public Computer(String computerId, String nameCp, double weight, int ram,int hardDrive,String cpu) {
        this(computerId, nameCp, weight,ram,hardDrive);
        this.cpu = cpu;
    }
    public Computer(String computerId, String nameCp, double weight, int ram,int hardDrive,String cpu,int price, String OS) {
        this(computerId, nameCp, weight,ram,hardDrive,cpu);
        this.price = price;
        this.OS = OS;
    }

    public String getComputerId() {
        return computerId;
    }

    public void setComputerId(String computerId) {
        this.computerId = computerId;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getNameCp() {
        return nameCp;
    }

    public void setNameCp(String nameCp) {
        this.nameCp = nameCp;
    }

    public void showComputer() {
        System.out.println(
        this.getComputerId() + "\n" +
        this.getNameCp() + "\n" +
        this.getWeight() + "\n" +
        this.getCpu() + "\n" +
        this.getOS() + "\n" +
        this.getHardDrive() + "\n" +
        this.getRam() + "\n"
        );
    }
}
