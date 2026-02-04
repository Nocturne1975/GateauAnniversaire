package Gateau_Exercice;

public class Main {
    public static void main(String[] args) {
        Gateau g1 = new GateauVanille();
        Gateau g2 = new GateauVanilleAvecBougies();
        Gateau g3 = new GateauVanilleAvecFruits();
        Gateau g4 = new GateauVanilleAvecChocolat();
        Gateau g5 = new GateauVanilleAvecGlacage();

        Gateau g6 = new GateauVanilleAvecBougiesEtFruits();
        Gateau g7 = new GateauVanilleAvecBougiesEtChocolat();
        Gateau g8 = new GateauVanilleAvecBougiesEtGlacage();
        Gateau g9 = new GateauVanilleAvecFruitsEtChocolat();
        Gateau g10 = new GateauVanilleAvecGlacageEtFruits();
        Gateau g11 = new GateauVanilleAvecGlacageEtChocolat();

        Gateau g12 = new GateauVanilleAvecBougiesEtGlacageEtFruitsEtChocolat();

        Gateau[] gateaux = { g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12 };

        for (Gateau g : gateaux) {
            System.out.println(g.getDescription() + " : " + g.getPrix() + " $");
        }
    }
}