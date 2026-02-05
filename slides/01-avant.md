# Avant — Explosion de classes (Java)

## Idée (héritage / variantes)
On part d’un gâteau de base, puis on crée des classes :
- 1 décoration : `GateauVanilleAvecBougies`, `GateauVanilleAvecGlacage`, etc.
- 2 décorations : `GateauVanilleAvecBougiesEtGlacage`, etc.
- 3 décorations : …

## Problème
Chaque combinaison devient une **nouvelle classe**.
Avec $n$ décorations possibles, on a jusqu’à $2^n$ combinaisons → le nombre de classes explose.

Dans ton projet, ça se voit directement dans `GateauExercice/src/main/java/Gateau_Exercice/` :
- `GateauVanilleAvecBougies`
- `GateauVanilleAvecGlacage`
- `GateauVanilleAvecBougiesEtGlacage`
- `GateauVanilleAvecBougiesEtGlacageEtFruitsEtChocolat`
- etc.

## Exemple (Java)

Un extrait typique “une classe par combinaison” :

```java
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
```

Et `Main.java` doit ensuite instancier plein de classes différentes :

```java
Gateau g2 = new GateauVanilleAvecBougies();
Gateau g6 = new GateauVanilleAvecBougiesEtFruits();
Gateau g12 = new GateauVanilleAvecBougiesEtGlacageEtFruitsEtChocolat();
```

➡️ Message clé : **on veut pouvoir combiner les décorations sans créer une classe par combinaison**.
