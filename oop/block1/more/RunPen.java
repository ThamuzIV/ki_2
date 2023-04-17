package block1.more;

public class RunPen {
    public static void main(String[] args) {
        PenCase penCase = new PenCase();
        penCase.addLocation2(new Pen("pen1",10,"red"));
        penCase.addLocation2(new Pen("pen2",10,"red"));
        penCase.addLocation2(new Pen("pen3",10,"red"));
        penCase.addLocation2(new Pen("pen4",10,"red"));
        penCase.addLocation2(new Pen("pen5",10,"red"));

        penCase.takePen3(0);
        penCase.takePen1(2);

        penCase.addLocation1(new Pen("penNew",10,"red"),0);
        penCase.addLast1(new Pen("penLast",10,"red"));

        penCase.changeInfomation(1,"change",10,"pink");

        penCase.show();
    }
}
