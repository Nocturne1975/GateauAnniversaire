# Avant le Decorator — Héritage (problème)

## Idée
On crée une classe de base (ex. `GateauVanille`), puis on crée des sous-classes pour chaque ajout (`Bougies`, `Glacage`, etc.).

## Problème
Dès qu’on veut permettre plusieurs ajouts en même temps, on se retrouve à créer **une classe par combinaison** :
- `GateauVanilleBougiesGlacage`
- `GateauVanilleChocolatFruits`
- `GateauVanilleBougiesFruitsChocolat`
- etc.

Résultat : **explosion combinatoire** et code difficile à maintenir.

## Exemple (JS)

```js
class GateauVanille {
  getDescription() {
    return "Gâteau vanille";
  }

  getPrix() {
    return 15;
  }
}

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

// Combinaison obligatoire (une classe de plus…)
class GateauVanilleBougiesGlacage extends GateauVanille {
  getDescription() {
    return super.getDescription() + ", bougies, glaçage";
  }
  getPrix() {
    return super.getPrix() + 2 + 3;
  }
}
```
