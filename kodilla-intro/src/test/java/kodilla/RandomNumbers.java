package kodilla;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        int end = 5000;
        Random numbers = new Random();
//        int los = numbers.nextInt(31);
//        Jesli losowanie jest tutaj liczba sie nie zmienia

        int suma = 0;
        for (int i = 0; i <= end; i++) {
            if (suma < end) {
                int los = numbers.nextInt(31);
                //losowanie jest tutaj zeby z kazdym nowym obrotem była nowa liczba
                suma = suma + los;
                System.out.println(suma);

                }
            }
        }
    }








