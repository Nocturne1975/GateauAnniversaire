package Gateau_Exercice;

public class GateauVanilleAvecBougiesEtGlacageEtFruitsEtChocolat extends Gateau {
    @Override
    public String getDescription() {
        return "Gâteau vanille + Bougies + Glaçage + Fruits + Chocolat";
    }

    @Override
    public double getPrix() {
        return 15.0 + 2.0 + 3.0 + 4.0 + 5.0;
    }
}
