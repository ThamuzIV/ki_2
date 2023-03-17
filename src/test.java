import java.util.Random;

public class test {
    public static void main(String[] args) {
        MobileStore store = new MobileStore();
        Mobile a = new Mobile();
        Mobile b = new Mobile();
        Mobile c = new Mobile();
        Mobile e = new Mobile();
        store.importMobi(a);
        store.importMobi(b);
        store.importMobi(c);
        store.importMobi(e);
        store.showStore();
        store.sellPhone(103);
        store.showStore();
        store.updateMobi(101,"toyota","blackPink",20,10,2,80);
        store.showStore();
    }
}
