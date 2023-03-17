public class AppMobile {
    public static void main(String[] args) {
        Mobile objMobile1 = new Mobile();
        objMobile1.setBrand("samsung");
        objMobile1.setColor("yellow");
        objMobile1.setHeight(15);
        objMobile1.showMobile();

        Mobile objMobile2 = new Mobile("apple");
        objMobile2.setHeight(12);
        objMobile2.setWidth(20);
        objMobile2.setEnergy(100);
        objMobile2.showMobile();
    }
}
