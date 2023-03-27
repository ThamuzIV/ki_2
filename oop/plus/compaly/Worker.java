package plus.compaly;

import plus.compaly.Cadres;

public class Worker extends Cadres {
    private int leve;
    public Worker(String name,int age,String sex,String address,int leve) {
        super(name, age, sex, address);
        this.leve =leve;
    }

    public int getLeve() {
        return leve;
    }

    public void setLeve(int leve) {
        this.leve = leve;
    }
}
