package plus.compaly;

import plus.compaly.Cadres;

public class Engineer extends Cadres {
    private String specialized;

    public Engineer(String name, int age, String sex, String address, String specialized) {
        super(name, age, sex, address);
        this.specialized = specialized;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }
}
