package Gateau_Exercice;

public class GateauVanilleAvecFruitsEtChocolat extends Gateau {
    @Override
    public String getDescription() {
        return "Gâteau vanille + Fruits + Chocolat";
    }

    @Override
    public double getPrix() {
        return 15.0 + 4.0 + 5.0;
    }
}