public class AppMobileStore {

    public static void main(String[] args) {
        Mobile objMobile1 = new Mobile();
        Mobile objMobile2 = new Mobile();
        Mobile objMobile3 = new Mobile();
        Mobile objMobile4 = new Mobile();
        Mobile objMobile5 = new Mobile();
        Mobile objMobile6 = new Mobile();
        Mobile objMobile7 = new Mobile();
        Mobile objMobile8 = new Mobile();
        Mobile objMobile9 = new Mobile();
        Mobile objMobile10 = new Mobile();

        MobileStore objMobileStore = new MobileStore();
        objMobileStore.importMobi(objMobile1);
        objMobileStore.importMobi(objMobile2);
        objMobileStore.importMobi(objMobile3);
        objMobileStore.importMobi(objMobile4);
        objMobileStore.importMobi(objMobile5);
        objMobileStore.importMobi(objMobile6);
        objMobileStore.importMobi(objMobile7);
        objMobileStore.importMobi(objMobile8);
        objMobileStore.importMobi(objMobile9);
        objMobileStore.importMobi(objMobile10);
        objMobileStore.sellPhone(105);

        Mobile objMobile11 = new Mobile();
        objMobileStore.importMobi(objMobile11);
        objMobileStore.sellPhone(110);
        objMobileStore.updateMobi(111,"samsung","blue",5,5,5,90);

        objMobileStore.showStoreOne(102);
    }
}
