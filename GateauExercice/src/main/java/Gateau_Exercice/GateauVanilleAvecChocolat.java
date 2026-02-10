package Gateau_Exercice;

public class GateauVanilleAvecChocolat extends Gateau {
    @Override
    public String getDescription() {
        return "Gâteau vanille + Chocolat";
    }

    @Override
    public double getPrix() {
        return 15.0 + 5.0;
    }
}