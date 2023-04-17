package block1.compaly;

public class Staff extends Cadres {
    private String word;

    public Staff(String name, int age, String sex, String address, String word) {
        super(name, age, sex, address);
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
