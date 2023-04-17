package block1.NetGame;

public class CyberGame {
    private String cyberGameId;
    private String nameCBG;
    private String addRed;
    private Computer[] computersList;
    private int noComputer;
    private int revenue;

    public CyberGame() {
        this.cyberGameId = "CBG0001";
        this.nameCBG = "default";
        this.addRed = "Hà Nội";
        this.noComputer = 0;
        this.computersList = new Computer[200];
        this.revenue = 20000000;
    }

    public CyberGame(int length) {
        this();
        this.computersList = new Computer[length];
    }

    public int getRevenue() {
        return revenue;
    }

    public int getNoComputer() {
        return noComputer;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public String getNameCBG() {
        return nameCBG;
    }

    public String getCyberGameId() {
        return cyberGameId;
    }

    public String getAddRed() {
        return addRed;
    }

    private void setNoComputer() {
        this.noComputer++;
    }

    public void setNameCBG(String nameCBG) {
        this.nameCBG = nameCBG;
    }

    public void setCyberGameId(String cyberGameId) {
        this.cyberGameId = cyberGameId;
    }

    public void setAddRed(String addRed) {
        this.addRed = addRed;
    }

    public Computer getComputersList(int noComputer) {
        return this.computersList[noComputer];
    }

    public boolean addCom(Computer computer) {
        if (this.noComputer <= this.computersList.length) {
            this.computersList[noComputer] = computer;
            this.setNoComputer();
            return true;
        }
        return false;
    }

    public void receivePayment(int timePlayMinute,String computerId) {
        for (Computer i : this.computersList) {
            if (i.getComputerId().equals(computerId)) {
                switch (configuration(i)) {
                    case 1: this.setRevenue(5000*timePlayMinute);break;
                    case 2: this.setRevenue(8000*timePlayMinute);break;
                    case 3: this.setRevenue(10000*timePlayMinute);break;
                    case 4: this.setRevenue(15000*timePlayMinute);break;
                    case 5: this.setRevenue(20000*timePlayMinute);break;
                }

            }
        }
    }

    private int configuration(Computer cp) {

        switch (cp.getRam()) {
            case 8:
                if (cp.getHardDrive() == 128 && cp.getCpu().equals("i3")) {
                    return 1;
                } else if (cp.getHardDrive() == 256 && cp.getCpu().equals("i5")) {
                    return 2;
                }
                break;
            case 16:
                if (cp.getHardDrive() == 156 && cp.getCpu().equals("i5")) {
                    return 3;
                } else if (cp.getHardDrive() == 512 && cp.getCpu().equals("i7")) {
                    return 4;
                }
                break;
            default:
                if (cp.getHardDrive() == 1024 && cp.getCpu().equals("i9")) {
                    return 5;
                }
                break;
        }
        return 5;
    }

    public void show() {
        for (int i = 0; i < this.noComputer; i++) {
            this.getComputersList(i).showComputer();
        }
    }
}
