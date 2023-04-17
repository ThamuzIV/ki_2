package block1.more;

public class PenCase {
    private String name;
    private Pen[] penCase;
    private int numPen;

    public PenCase() {
        this.name = "PenCase";
        this.penCase = new Pen[5];
        this.numPen = 0;
    }

    public int getNumPen() {
        return numPen;
    }

    public void setNumPen(int numPen) {
        this.numPen = numPen;
    }

    public Pen[] getPenCase() {
        return penCase;
    }

    public void changeInfomation(int location,String name,int width,String color) {
        this.penCase[location].setName(name);
        this.penCase[location].setWidth(width);
        this.penCase[location].setColor(color);
    }

    public void addLast1(Pen pen) {
        Pen[] newPenCase = new Pen[this.penCase.length + 1];
        for (int i = 0; i < this.penCase.length; i++) {
            newPenCase[i] = this.penCase[i];
        }
        newPenCase[this.penCase.length] = pen;
        this.penCase = newPenCase;
        this.numPen++;
    }

    public void addLast2(Pen pen) {
        Pen[] newPenCase = new Pen[this.penCase.length + 1];
        System.arraycopy(this.penCase,0,newPenCase,0,this.penCase.length);
        newPenCase[this.penCase.length + 1] = pen;
        this.penCase = newPenCase;
        this.numPen++;
    }

    public void addLocation1(Pen pen,int location) {
        if (location < this.penCase.length && this.numPen <= this.penCase.length) {
            this.penCase[location] = pen;
            this.numPen++;
        }
    }
    public void addLocation2(Pen pen) {
        if (this.numPen < this.penCase.length && this.numPen <= this.penCase.length) {
            this.penCase[this.numPen] = pen;
            this.numPen++;
        }
    }

    public void takePen1(int location) {
        Pen[] newPenCase = new Pen[this.penCase.length - 1];
        for (int i = 0; i < this.penCase.length - 1; i++) {
            if (i < location) {
                newPenCase[i] = this.penCase[i];
            } else {
                newPenCase[i] = this.penCase[i+1];
            }
        }
        this.penCase = newPenCase;
        this.numPen--;
    }

    public void takePen2(int location) {
        Pen[] newPenCase = new Pen[this.penCase.length - 1];
        System.arraycopy(this.penCase,0,newPenCase,0,location);
        System.arraycopy(this.penCase,location + 1,newPenCase,location,this.penCase.length - location -1);
        this.penCase = newPenCase;
        this.numPen--;
    }

    public void takePen3(int location) {
        this.penCase[location].setName("");
        this.penCase[location].setWidth(0);
        this.penCase[location].setColor("");
        this.numPen--;
    }

    public void show() {
        for (int i = 0; i < this.penCase.length;i++) {
            this.penCase[i].show();
        }
    }
}
