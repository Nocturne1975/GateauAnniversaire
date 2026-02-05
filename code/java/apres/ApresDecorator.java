// Exercice — APRÈS (Decorator) : composition flexible
//
// Objectif étudiant :
// 1) Implémenter le décorateur Paillettes (+1$).
// 2) Créer au moins 2 compositions et les afficher.
//
// Exécution (depuis la racine du projet) :
//   javac code/java/apres/ApresDecorator.java
//   java -cp code/java/apres ApresDecorator

interface Gateau {
    String getDescription();

    int getPrix();
}

class GateauVanille implements Gateau {
    @Override
    public String getDescription() {
        return "Gâteau vanille";
    }

    @Override
    public int getPrix() {
        return 15;
    }
}

abstract class GateauDecorator implements Gateau {
    protected final Gateau gateau;

    protected GateauDecorator(Gateau gateau) {
        this.gateau = gateau;
    }

    @Override
    public String getDescription() {
        return gateau.getDescription();
    }

    @Override
    public int getPrix() {
        return gateau.getPrix();
    }
}

class Bougies extends GateauDecorator {
    Bougies(Gateau gateau) {
        super(gateau);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", bougies";
    }

    @Override
    public int getPrix() {
        return super.getPrix() + 2;
    }
}

class Glacage extends GateauDecorator {
    Glacage(Gateau gateau) {
        super(gateau);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", glaçage";
    }

    @Override
    public int getPrix() {
        return super.getPrix() + 3;
    }
}

class Fruits extends GateauDecorator {
    Fruits(Gateau gateau) {
        super(gateau);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", fruits";
    }

    @Override
    public int getPrix() {
        return super.getPrix() + 4;
    }
}

class Chocolat extends GateauDecorator {
    Chocolat(Gateau gateau) {
        super(gateau);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", chocolat";
    }

    @Override
    public int getPrix() {
        return super.getPrix() + 5;
    }
}

// TODO (exercice) : décorateur concret Paillettes (+1$)
class Paillettes extends GateauDecorator {
    Paillettes(Gateau gateau) {
        super(gateau);
    }

    @Override
    public String getDescription() {
        throw new UnsupportedOperationException(
                "TODO: Implémenter Paillettes.getDescription() (ajouter ', paillettes')");
    }

    @Override
    public int getPrix() {
        throw new UnsupportedOperationException("TODO: Implémenter Paillettes.getPrix() (ajouter +1)");
    }
}

public class ApresDecorator {
    private static void afficher(Gateau gateau) {
        System.out.println(gateau.getDescription());
        System.out.println("Prix total : " + gateau.getPrix() + " $");
        System.out.println("---");
    }

    public static void main(String[] args) {
        System.out.println("=== Exercice - APRES (Decorator) ===");

        // Vérification minimale (doit fonctionner tout de suite)
        afficher(new GateauVanille());

        // TODO (exercice) :
        // 1) Vanille + Glaçage + Fruits
        // Gateau gateau1 = ...
        // afficher(gateau1);
        //
        // 2) Vanille + Paillettes + Bougies + Chocolat
        // Gateau gateau2 = ...
        // afficher(gateau2);
    }
}
