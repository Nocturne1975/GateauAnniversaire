package Gateau_Exercice;

public class GateauVanilleAvecBougiesEtChocolat extends Gateau {
    @Override
    public String getDescription() {
        return "Gâteau vanille + Bougies + Chocolat";
    }

    @Override
    public double getPrix() {
        return 15.0 + 2.0 + 5.0;
    }
}