package Gateau_Exercice;

public class GateauVanilleAvecFruits extends Gateau {
    @Override
    public String getDescription() {
        return "Gâteau vanille + Fruits";
    }

    @Override
    public double getPrix() {
        return 15.0 + 4.0;
    }
}
