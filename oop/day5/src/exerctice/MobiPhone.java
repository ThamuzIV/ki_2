package day5.src.exerctice;

public class MobiPhone {
    public byte battery = 100;
    private byte iSent = 1, iBox = 1;
    public String sent = "";
    public String inbox = "";
    public String writing;
    public boolean onOff = false,seen = true;
    public boolean getOnOff() {
        return onOff;
    }


    public void powerButton() {
        if (onOff == true) {
            this.onOff = false;
        } else {
            this.onOff = true;
        }
    }

    public byte getBattery() {return battery;}

    public void setBattery() {
        this.battery = 100;
    }

    public void setWriting(String mess) {
        this.writing = mess;
    }

    public void setSent() {
        this.sent += " " + this.iSent + ": " + writing;
        System.out.println( this.sent );
    }

    public void setInbox(String mess) {
        this.inbox += " " + this.inbox + ": " + mess;
    }

    public String getInbox() {
        return inbox;
    }

    public String getSent() {
        return sent;
    }
}
