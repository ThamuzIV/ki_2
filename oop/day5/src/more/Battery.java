package day5.src.more;

import java.util.Random;

public class Battery {
    int energy;

    public Battery() {
        this.energy = (int)Math.floor(Math.random()*(50 + 1) + 50);
    }
}
