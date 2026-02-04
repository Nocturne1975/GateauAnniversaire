class Gateau {
  getDescription() {
    return "Gâteau";
  }

  getPrix() {
    return 0;
  }
}

class GateauVanille extends Gateau {
  getDescription() {
    return "Gâteau vanille";
  }

  getPrix() {
    return 15;
  }
}

class DecorateurGateau extends Gateau {
  constructor(gateau) {
    super();
    this.gateau = gateau;
  }

  getDescription() {
    return this.gateau.getDescription();
  }

  getPrix() {
    return this.gateau.getPrix();
  }
}

class Bougies extends DecorateurGateau {
  getDescription() {
    return super.getDescription() + ", bougies";
  }

  getPrix() {
    return super.getPrix() + 2;
  }
}

class Glacage extends DecorateurGateau {
  getDescription() {
    return super.getDescription() + ", glaçage";
  }

  getPrix() {
    return super.getPrix() + 3;
  }
}

class Fruits extends DecorateurGateau {
  getDescription() {
    return super.getDescription() + ", fruits";
  }

  getPrix() {
    return super.getPrix() + 4;
  }
}

class Chocolat extends DecorateurGateau {
  getDescription() {
    return super.getDescription() + ", chocolat";
  }

  getPrix() {
    return super.getPrix() + 5;
  }
}

// TODO (exercice) : ajouter un décorateur concret Paillettes (+1$)
// Indice : il doit étendre DecorateurGateau et déléguer via super.
class Paillettes extends DecorateurGateau {
  getDescription() {
    throw new Error(
      "TODO: Implémenter Paillettes.getDescription() (ajouter ', paillettes')"
    );
  }

  getPrix() {
    throw new Error("TODO: Implémenter Paillettes.getPrix() (ajouter +1)");
  }
}

function afficher(gateau) {
  console.log(gateau.getDescription());
  console.log("Prix total :", gateau.getPrix(), "$");
  console.log("---");
}

console.log("=== Exercice — Decorator (après) ===");

// Vérification minimale (doit fonctionner tout de suite)
afficher(new GateauVanille());

// TODO (exercice) : crée au moins 2 gâteaux par composition et affiche-les.
// - Vanille + Glaçage + Fruits
// - Vanille + Paillettes + Bougies + Chocolat
//
// Exemple de structure (à compléter) :
// let gateau1 = ...
// let gateau2 = ...
// afficher(gateau1);
// afficher(gateau2);

