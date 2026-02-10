package Gateau_Exercice;

public class GateauVanilleAvecGlacageEtFruits extends Gateau {
    @Override
    public String getDescription() {
        return "Gâteau vanille + Glaçage + Fruits";
    }

    @Override
    public double getPrix() {
        return 15.0 + 3.0 + 4.0;
    }
}