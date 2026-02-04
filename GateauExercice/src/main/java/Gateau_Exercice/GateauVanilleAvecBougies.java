package Gateau_Exercice;

public class GateauVanilleAvecBougies extends Gateau {
    @Override
    public String getDescription() {
        return "Gâteau vanille + Bougies";
    }

    @Override
    public double getPrix() {
        return 15.0 + 2.0;
    }
}