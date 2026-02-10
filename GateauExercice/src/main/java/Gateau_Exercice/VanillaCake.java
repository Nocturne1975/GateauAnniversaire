package Gateau_Exercice;

public class VanillaCake implements Cake {
    @Override
    public String getDescription() {
        return "Vanilla cake";
    }

    @Override
    public double getPrice() {
        return 15.0;
    }
}