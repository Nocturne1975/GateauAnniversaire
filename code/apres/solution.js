// Corrigé professeur — Patron Decorator (Gâteau d'anniversaire)
// Exécution : node code/apres/solution.js

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

class Paillettes extends DecorateurGateau {
  getDescription() {
    return super.getDescription() + ", paillettes";
  }

  getPrix() {
    return super.getPrix() + 1;
  }
}

function afficher(gateau) {
  console.log(gateau.getDescription());
  console.log("Prix total :", gateau.getPrix(), "$");
  console.log("---");
}

console.log("=== Corrigé — Decorator (après) ===");

// Composition 1 : Vanille + Glaçage + Fruits
const gateau1 = new Fruits(new Glacage(new GateauVanille()));

// Composition 2 : Vanille + Paillettes + Bougies + Chocolat
const gateau2 = new Chocolat(new Bougies(new Paillettes(new GateauVanille())));

afficher(gateau1);
afficher(gateau2);
