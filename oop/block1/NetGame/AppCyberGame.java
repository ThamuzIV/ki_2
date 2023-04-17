package block1.NetGame;

public class AppCyberGame {
    public static void main(String[] args) {
        CyberGame cyberGameKOW = new CyberGame();
        for (int i = 0; i < 100; i++) {
            if (i < 20) {
                cyberGameKOW.addCom(new Computer("MT0001","default",2,8,128,"i3"));
            } else if (i < 40) {
                cyberGameKOW.addCom(new Computer("MT0001","default",2,8,256,"i5"));

            } else if (i < 60) {
                cyberGameKOW.addCom(new Computer("MT0001","default",2,16,256,"i5"));

            } else if (i < 80) {
                cyberGameKOW.addCom(new Computer("MT0001", "default", 2, 16, 256, "i7"));
            } else {
                cyberGameKOW.addCom(new Computer("MT0001","default",2,32,1024,"i9"));
            }
        }
        cyberGameKOW.show();

    }
}
