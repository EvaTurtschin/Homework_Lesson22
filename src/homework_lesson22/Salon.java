package homework_lesson22;

import java.lang.reflect.Array;
import java.util.Arrays;
public class Salon {
    private String car;
    static int counter = -1;
    static String[] carsInSalon = new String[7];
    public Salon(String car) {
        this.car = car;
        counter++;
        carsInSalon[counter] = car;
    }
    public String getCar(String car) {
        return car;
    }
    public String toString() {
        return car;
    }
    public static String setCarScanner(String carScanner) {
        for (int i = 0; i < carsInSalon.length; i++) {
            if (carsInSalon[i].equals(carScanner)) {
                return "This car is available!";
            }
        }
        return "This car is not available. Please choose another one from the list: "
                + Arrays.toString(carsInSalon);
    }
}


