package day5.src.more;

public class remote {
    public static void rightButton(String button) {
        if (television.change > 10 || television.change < 1) {
            switch (button) {
                case "up": television.change++;
                    break;
                case "down": television.change--;
                    break;
                default: System.out.print("");
                    break;
            }
        }
        television.setInformation();
    }
    public static void leftButton(String button) {
        if (television.vol > 100 || television.vol < 1) {
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
