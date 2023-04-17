package block1.day5.src.exerctice;

import java.io.InputStream;
import java.util.Scanner;

public class Use {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner input = new Scanner(in);
        System.out.println(
                "        menu \n" +
                "1: rectangle\n" +
                "2: temperature\n" +
                "3: mobi phone\n" +
                "4: equations\n" +
                "5: time\n" +
                "6: fan");
        int choose = input.nextInt();
        switch (choose) {
            case 1: useRectangleExe();
            break;
            case 2: useTemperature();
            break;
            case 3: useMobiPhone();
            break;
            case 4: useEquations();
            break;
//            case 5: useTime();
//            break;
            case 6: useFan();
            break;
        }
    }

    public static void useRectangleExe() {
        InputStream in = System.in;
        Scanner input = new Scanner(in);

        System.out.println("Enter width + height");
        int width = input.nextInt();
        int height = input.nextInt();

        RectangleExe rectangle = new RectangleExe();
        rectangle.creat(width,height);
        System.out.println(rectangle.getPerimeter());

        useTemperature();
        rectangle.getArea();
        rectangle.draw();
    }

    public static void useTemperature() {
        InputStream in = System.in;
        Scanner input = new Scanner(in);

        System.out.println("Enter you temperature and unit you want convert:");
        int c = input.nextInt();
        String unit = input.next();
        Temperature temperature = new Temperature();
        System.out.println(temperature.convert(c,unit));
    }

    public static void useMobiPhone() {
        InputStream in = System.in;
        Scanner input = new Scanner(in);
        MobiPhone nokia = new MobiPhone();
        MobiPhone iphone = new MobiPhone();
        String device,operation;

        System.out.println(
                "User manual \n" +
                "you enter (nokia or iphone) + (space) + (choose )" +
                "on? : check device on or off \n" +
                "turn : turn on or turn off \n" +
                "write : write mess\n" +
                "sent : sent mess\n" +
                "open : open inbox\n" +
                "charge : use when your phone low battery");
        String user = "live";
        do {
            System.out.println("do: ");
            device = input.next();
            operation = input.next();
            switch (device) {
                case "nokia":
                    handleEventUser(operation, nokia, iphone);
                    System.out.print("battery nokia: " + nokia.getBattery() + "%");
                break;

                case "iphone":
                    handleEventUser(operation, iphone,nokia);
                    System.out.print("battery iphone: " + iphone.getBattery() + "%");
                break;
            }

        } while (user.equals("live"));
    }

    public static void handleEventUser(String operation, MobiPhone using, MobiPhone waiting){
        InputStream in = System.in;
        Scanner input = new Scanner(in);
        String mess = "";

        if (using.onOff) {
            switch (operation) {
                case "on?":
                    System.out.println(using.getOnOff());
                    break;
                case "write":
                    System.out.println("Enter mess");
                    mess = input.nextLine();
                    using.setWriting(mess);
                    using.battery -= 1;
                    break;
                case "sent":
                    using.setSent();
                    waiting.setInbox(mess);
                    System.out.println("successfully");
                    using.battery -= 1;
                    break;
                case "openInbox":
                    System.out.println(using.getInbox());
                    using.battery -= 1;
                    break;
                case "openSent":
                    System.out.println(using.getSent());
                case "charge":
                    using.setBattery();
            }
        } else if (operation.equals("turn")){
            using.powerButton();
        } else {
            System.out.println(using + " is not turn on");
        }

    }

    public static void useEquations() {
        InputStream in = System.in;
        Scanner input = new Scanner(in);

        System.out.println("Enter equations (a,b,c)");
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();

        QuadraticEquation quadratic = new QuadraticEquation(a,b,c);
        quadratic.getDiscriminant();
        quadratic.findRoot();
    }

    public static void useFan() {
        
    }


}
