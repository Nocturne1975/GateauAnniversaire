# Après — Patron Decorator (solution)

## Idée
Au lieu de multiplier les sous-classes, on crée :
- un **composant** (`Gateau`)
- un **décorateur abstrait** (`DecorateurGateau`) qui enveloppe un `Gateau`
- des **décorateurs concrets** (`Bougies`, `Glacage`, `Fruits`, `Chocolat`)

Chaque décorateur :
- délègue au gâteau qu’il enveloppe
- ajoute sa propre description/prix

## Avantages
- on combine dynamiquement : `new Chocolat(new Fruits(new Glacage(new GateauVanille())))`
- pas d’explosion de classes
- respecte l’Open/Closed : on ajoute des décorateurs sans modifier les classes existantes

## Exemple (JS)

```js
class Gateau {
  getDescription() { return "Gâteau"; }
  getPrix() { return 0; }
}

class GateauVanille extends Gateau {
  getDescription() { return "Gâteau vanille"; }
  getPrix() { return 15; }
}

class DecorateurGateau extends Gateau {
  constructor(gateau) {
    super();
    this.gateau = gateau;
  }
  getDescription() { return this.gateau.getDescription(); }
  getPrix() { return this.gateau.getPrix(); }
}

class Glacage extends DecorateurGateau {
  getDescription() { return super.getDescription() + ", glaçage"; }
  getPrix() { return super.getPrix() + 3; }
}

class Fruits extends DecorateurGateau {
  getDescription() { return super.getDescription() + ", fruits"; }
  getPrix() { return super.getPrix() + 4; }
}

class Chocolat extends DecorateurGateau {
  getDescription() { return super.getDescription() + ", chocolat"; }
  getPrix() { return super.getPrix() + 5; }
}
```
