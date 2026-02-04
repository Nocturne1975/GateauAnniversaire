// Exercice — AVANT (héritage) : explosion combinatoire
//
// Objectif étudiant :
// 1) Ajouter l'option Paillettes (+1$) en créant une sous-classe.
// 2) Ajouter la combinaison Bougies + Glaçage + Paillettes (=> une nouvelle classe!).
//
// Exécution (depuis la racine du projet) :
//   javac code/java/avant/AvantHeritage.java
//   java -cp code/java/avant AvantHeritage

class GateauVanille {
    String getDescription() {
        return "Gâteau vanille";
    }

    int getPrix() {
        return 15;
    }
}

// Ajouts séparés (1 ajout = 1 sous-classe)
class GateauVanilleBougies extends GateauVanille {
    @Override
    String getDescription() {
        return super.getDescription() + ", bougies";
    }

    @Override
    int getPrix() {
        return super.getPrix() + 2;
    }
}

class GateauVanilleGlacage extends GateauVanille {
    @Override
    String getDescription() {
        return super.getDescription() + ", glaçage";
    }

    @Override
    int getPrix() {
        return super.getPrix() + 3;
    }
}

class GateauVanilleFruits extends GateauVanille {
    @Override
    String getDescription() {
        return super.getDescription() + ", fruits";
    }

    @Override
    int getPrix() {
        return super.getPrix() + 4;
    }
}

class GateauVanilleChocolat extends GateauVanille {
    @Override
    String getDescription() {
        return super.getDescription() + ", chocolat";
    }

    @Override
    int getPrix() {
        return super.getPrix() + 5;
    }
}

// 😵 Combinaison obligatoire : une classe par combinaison
class GateauVanilleBougiesGlacage extends GateauVanille {
    @Override
    String getDescription() {
        return super.getDescription() + ", bougies, glaçage";
    }

    @Override
    int getPrix() {
        return super.getPrix() + 2 + 3;
    }
}

public class AvantHeritage {
    private static void afficher(GateauVanille gateau) {
        System.out.println(gateau.getDescription());
        System.out.println("Prix total : " + gateau.getPrix() + " $");
        System.out.println("---");
    }

    public static void main(String[] args) {
        System.out.println("=== Exercice - AVANT (heritage) ===");

        afficher(new GateauVanille());
        afficher(new GateauVanilleBougies());
        afficher(new GateauVanilleGlacage());
        afficher(new GateauVanilleBougiesGlacage());

        // TODO (exercice) :
        // 1) Crée une classe GateauVanillePaillettes (+1$).
        // afficher(new GateauVanillePaillettes());
        //
        // 2) Crée la combinaison GateauVanilleBougiesGlacagePaillettes.
        // afficher(new GateauVanilleBougiesGlacagePaillettes());
    }
}
