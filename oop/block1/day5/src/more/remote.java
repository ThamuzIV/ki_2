package block1.day5.src.more;

public class remote {
    public static void rightButton(String button) {
        if (television.change <= 10 && television.change > 0) {
            switch (button) {
                case "up": television.change += 1;
                    break;
                case "down": television.change -=1;
                    break;
                default: System.out.print("");
                    break;
            }
        }
        System.out.println(television.change);
        television.setInformation();
        System.out.println(1);
    }
    public static void leftButton(String button) {
        if (television.vol <= 100 && television.vol >= 1) {

            switch (button) {
                case "up": television.vol++;
                    break;
                case "down": television.vol--;
                    break;
                default: System.out.print("");
                    break;
            }
        }
    }
    public static void numberButton(int button) {
        if (0 < button && button < 11) {
            television.change = button;
            television.setInformation();
        }
    }
    public static void powerButton() {
        if (television.status) {
            television.status = false;
        } else {
            television.status = true;
        }

    }
}
