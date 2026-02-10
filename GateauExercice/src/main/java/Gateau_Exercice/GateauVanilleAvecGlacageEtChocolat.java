package Gateau_Exercice;

public class GateauVanilleAvecGlacageEtChocolat extends Gateau {
    @Override
    public String getDescription() {
        return "Gâteau vanille + Glaçage + Chocolat";
    }

    @Override
    public double getPrix() {
        return 15.0 + 3.0 + 5.0;
    }
}