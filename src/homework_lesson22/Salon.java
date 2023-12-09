package homework_lesson22;

import java.util.Arrays;
public class Salon {
    static int counter = -1;
    static String[] carsInSalon = new String[7];
    public Salon(String car) {
        counter++;
        carsInSalon[counter] = car;
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


