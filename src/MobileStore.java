import java.util.Scanner;

public class MobileStore {
    private  Mobile[] store;
    private int numMobi;

    public MobileStore() {
        this.store = new Mobile[100];
        this.numMobi = 0;
    }

    public MobileStore(int length) {
        this();
        this.store = new Mobile[length];
    }

    public boolean importMobi(Mobile mobile) {
        if (this.numMobi < store.length) {
            this.store[numMobi++] = mobile;
            return true;
        } else {
            System.out.println();
            return false;
        }
    }

    public boolean sellPhone(int codePhone) {
        for (int i = 0; i < this.numMobi; i++) {
            if (this.store[i].getMobiCode() == codePhone) {
                this.store[i] = null;
                for (int j = i; j < this.numMobi;) {
                    this.store[j] = this.store[++j];
                }
                this.numMobi--;
                return true;
            }
        }
        return false;
    }

    public void showStore() {
        for (int i = 0; i < this.numMobi; i++) {
            this.store[i].showMobile();
        }
    }

    public void updateMobi(int codePhone,String brand,String color,int width,int height,int thickness,int energy) {
        for (int i = 0; i < this.numMobi; i++) {
            if (this.store[i].getMobiCode() == codePhone) {
                this.store[i].setBrand(brand);
                this.store[i].setColor(color);
                this.store[i].setWidth(width);
                this.store[i].setHeight(height);
                this.store[i].setThickness(thickness);
                this.store[i].setEnergy(energy);
            }
        }
    }

    public int getNumMobi() {
        return numMobi;
    }

    public void setNumMobi(int numMobi) {
        this.numMobi = numMobi;
    }
}