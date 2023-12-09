package homework_lesson22;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Task 1
        Написать класс, содержащий метод, который проверяет есть ли данная машина в салоне.
В случае, если машина найдена, метод выводит на экран сообщение "Эта машина имеется в наличии"
Если нет, то сообщение "Такой машины нет, возьмите ( дальше следует перечисление всех машин в салоне )"
Результат работы метода вывести на экран в классе Main.
Список машин в салоне должен передаваться через конструктор при создании обьекта,
а название заказанной машины в качестве параметра метода.
Пример: String [] salon = {"Audi","BMW","Ford","Honda","Hyundai","Kia","Mazda"};

public void findCar(String carToFind)
         */

        Salon car1 = new Salon("Audi");
        Salon car2 = new Salon("BMW");
        Salon car3 = new Salon("Ford");
        Salon car4 = new Salon("Honda");
        Salon car5 = new Salon("Hyundai");
        Salon car6 = new Salon("Kia");
        Salon car7 = new Salon("Mazda");

        Scanner scanner = new Scanner (System.in);
        System.out.println("What car do you prefer? - ");
        String carScanner = scanner.nextLine();

        System.out.println(Salon.setCarScanner(carScanner));



    }
}
