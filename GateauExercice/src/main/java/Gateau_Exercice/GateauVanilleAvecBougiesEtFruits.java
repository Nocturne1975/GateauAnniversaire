package Gateau_Exercice;

public class GateauVanilleAvecBougiesEtFruits extends Gateau {
    @Override
    public String getDescription() {
        return "Gâteau vanille + Bougies + Fruits";
    }

    @Override
    public double getPrix() {
        return 15.0 + 2.0 + 4.0;
    }
}