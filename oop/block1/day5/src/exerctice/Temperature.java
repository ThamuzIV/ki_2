package block1.day5.src.exerctice;

public class Temperature {
    double c;

    public void getC(double c) {
        if (c >= -273) {
            this.c = c;
        } else {
            System.out.print("Error (c >= -273)");
        }
    }

    public double convert(double temperature, String unit) {
        double result = temperature;
        switch (unit) {
            case "f": result = (c*1.8) + 32;
            break;
            case "k": result = c + 273;
            break;
        }

        return result;
    }
}
