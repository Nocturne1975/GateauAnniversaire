package Gateau_Exercice;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // pour le point décimal

        for (int mask = 0; mask < 16; mask++) {
            Cake cake = new VanillaCake();

            if ((mask & 1) != 0) cake = new CandlesDecorator(cake);
            if ((mask & 2) != 0) cake = new IcingDecorator(cake);
            if ((mask & 4) != 0) cake = new FruitsDecorator(cake);
            if ((mask & 8) != 0) cake = new ChocolateDecorator(cake);

            printCake(cake);
        }
    }

    private static void printCake(Cake cake) {
        String desc = String.format("%-50s", cake.getDescription());
        String price = String.format("%.2f $", cake.getPrice());
        System.out.println(desc + " : " + price);
    }
}