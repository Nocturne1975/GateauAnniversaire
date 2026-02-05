# Exercice — 🎂 Le gâteau d’anniversaire maudit (Java)

## Contexte
Vous avez un projet Java qui modélise un gâteau vanille (15 $) et des décorations :
- **Bougies** : +2 $
- **Glaçage** : +3 $
- **Fruits** : +4 $
- **Chocolat** : +5 $

Le code actuel est basé sur l’héritage et crée une classe pour chaque combinaison (`GateauVanilleAvecBougiesEt...`).

Votre mission : **refactorer avec le patron Decorator** pour pouvoir composer librement les décorations.

## Partie A — Observer le problème (avant)
Dossier : `GateauExercice/src/main/java/Gateau_Exercice/`

1) Ouvrez `Main.java` et constatez qu’il instancie beaucoup de classes différentes.
2) Regardez quelques classes comme :
   - `GateauVanilleAvecBougies`
   - `GateauVanilleAvecGlacageEtFruits`
   - `GateauVanilleAvecBougiesEtGlacageEtFruitsEtChocolat`
3) Expliquez en 2–3 phrases pourquoi cette approche ne scale pas (explosion combinatoire).

✅ À remettre (Partie A)
- Une explication claire du problème.

## Partie B — Refactorer avec Decorator (après)
Dans le même package `Gateau_Exercice`, vous devez créer :

1) Une interface `Gateau`
   - `String getDescription()`
   - `double getPrix()`
2) `GateauVanille` (gâteau de base) qui implémente `Gateau`
3) `GateauDecorator` (classe abstraite) qui implémente `Gateau` et enveloppe un `Gateau`
4) Les décorateurs concrets : `Bougies`, `Glacage`, `Fruits`, `Chocolat`
5) Modifier `Main.java` pour composer librement, par exemple :

```java
Gateau g = new Fruits(new Bougies(new Glacage(new GateauVanille())));
System.out.println(g.getDescription() + " : " + g.getPrix() + " $");
```

✅ Résultat attendu (exemple)
- Description : Gâteau vanille + Glaçage + Bougies + Fruits
- Coût total : 24 $

✅ À remettre (Partie B)
- Vos nouvelles classes décorateurs.
- `Main.java` mis à jour avec au moins 2 compositions différentes.

## Questions (3–5 lignes chacune)
1) Pourquoi l’héritage devient-il un problème ici ?
2) En quoi Decorator respecte mieux Open/Closed ?
3) Héritage vs composition dans cet exemple ?

## Exécution (sans Maven)
Depuis la racine du dépôt :

```bash
cd GateauExercice
mkdir -p target/classes
javac -d target/classes src/main/java/Gateau_Exercice/*.java
java -cp target/classes Gateau_Exercice.Main
```
