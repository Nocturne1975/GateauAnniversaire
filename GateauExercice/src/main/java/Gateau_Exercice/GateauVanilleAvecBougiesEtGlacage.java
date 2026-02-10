package Gateau_Exercice;


public class GateauVanilleAvecBougiesEtGlacage extends Gateau {
    @Override
    public String getDescription() {
        return "Gâteau vanille + Bougies + Glaçage";
    }

    @Override
    public double getPrix() {
        return 15.0 + 2.0 + 3.0;
    }
}