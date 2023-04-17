package block1.NetGame;

public class AppComputer {
    public static void main(String[] args) {
        Computer objMT1 = new Computer();
        objMT1.setNameCp("Dell");
        objMT1.setPrice(2000000);
        objMT1.showComputer();
        Computer objMT2 = new Computer("MT0002","Macbook",1.4);
        objMT2.setRam(16);
        objMT2.showComputer();
    }
}
