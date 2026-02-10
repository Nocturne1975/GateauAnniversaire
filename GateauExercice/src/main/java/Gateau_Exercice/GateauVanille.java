package Gateau_Exercice;

public class GateauVanille extends Gateau {
    @Override
    public String getDescription() {
        return "Gâteau vanille";
    }

    @Override
    public double getPrix() {
        return 15.0;
    }
}