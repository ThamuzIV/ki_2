package day5.src.more;

public class television {
    static int vol = 50;
    static int change = 1;
    static boolean status = false;

    static String information = "VTV 1";


     static boolean isOn() {
        return status;
    }

     static String setInformation() {
        switch (change) {
            case 1: information = "VTV 1";
            break;
            case 2: information = "VTV 2";
            break;
            case 3: information = "VTV 3";
            break;
            case 4: information = "VTV 4";
            break;
            case 5: information = "VTV 5";
            break;
            case 6: information = "VTV 6";
            break;
            case 7: information = "TodayTV";
            break;
            case 8: information = "THVL";
            break;
            case 9: information = "iTV";
            break;
            case 10: information = "HBO";
            break;
        }
        return information;
    }
    public static String getInformation() {
        return information;
    }
    public static int getVol() {
        return vol;
    }

    public static String show() {
        if (status) {
            return  " " + isOn() + " in change " + getInformation() + " vol " + getVol();
        } else {
            return "" + isOn();
        }
    }
}
