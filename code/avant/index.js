class GateauVanille {
  getDescription() {
    return "Gâteau vanille";
  }

  getPrix() {
    return 15;
  }
}

// Ajouts séparés (1 ajout = 1 sous-classe)
class GateauVanilleBougies extends GateauVanille {
  getDescription() {
    return super.getDescription() + ", bougies";
  }

  getPrix() {
    return super.getPrix() + 2;
  }
}

class GateauVanilleGlacage extends GateauVanille {
  getDescription() {
    return super.getDescription() + ", glaçage";
  }

  getPrix() {
    return super.getPrix() + 3;
  }
}

// 😵 Combinaison obligatoire : une classe par combinaison
class GateauVanilleBougiesGlacage extends GateauVanille {
  getDescription() {
    return super.getDescription() + ", bougies, glaçage";
  }

  getPrix() {
    return super.getPrix() + 2 + 3;
  }
}

class GateauVanilleChocolatFruits extends GateauVanille {
  getDescription() {
    return super.getDescription() + ", chocolat, fruits";
  }

  getPrix() {
    return super.getPrix() + 5 + 4;
  }
}

function afficher(gateau) {
  console.log(gateau.getDescription());
  console.log("Prix total :", gateau.getPrix(), "$");
  console.log("---");
}

afficher(new GateauVanille());
afficher(new GateauVanilleBougies());
afficher(new GateauVanilleGlacage());
afficher(new GateauVanilleBougiesGlacage());
afficher(new GateauVanilleChocolatFruits());
