# Exercice — Patron Decorator (Gâteau d'anniversaire)

## Contexte
On veut modéliser un gâteau de base (vanille) auquel on peut ajouter des options :
- bougies (+2 $)
- glaçage (+3 $)
- fruits (+4 $)
- chocolat (+5 $)

Le système doit produire :
- une **description** (ex. "Gâteau vanille, glaçage, fruits")
- un **prix total** (ex. 15 + 3 + 4 = 22 $)

## Partie A — Sans Decorator (avant)
Fichier : `code/avant/index.js`

1) Lis le code existant (héritage).
2) Ajoute une nouvelle option : **Paillettes** (+1 $).
   - Fais-le “à l’ancienne” avec une sous-classe (ex. `GateauVanillePaillettes`).
3) Ajoute ensuite une combinaison : **Bougies + Glaçage + Paillettes**.
   - Question : combien de classes dois-tu créer si on veut toutes les combinaisons possibles ?

✅ À remettre (Partie A)
- Ta/tes nouvelles classes.
- Une courte phrase qui explique le problème (explosion combinatoire).

## Partie B — Avec Decorator (après)
Fichier : `code/apres/index.js`

1) Ajoute un décorateur concret **Paillettes** (+1 $) qui étend `DecorateurGateau`.
2) Crée au moins 2 gâteaux différents par composition, par exemple :
   - Vanille + Glaçage + Fruits
   - Vanille + Paillettes + Bougies + Chocolat
3) Affiche pour chacun :
   - `getDescription()`
   - `getPrix()`

Note : le fichier `code/apres/index.js` est un **starter** avec des `TODO`. Tant que `Paillettes` n'est pas implémenté, l'utiliser dans une composition va lever une erreur (c'est normal).

✅ À remettre (Partie B)
- Le décorateur `Paillettes`.
- 2 compositions différentes + sorties console.

## Questions (à répondre en 3–5 lignes chacune)
1) Pourquoi l’héritage devient-il un problème ici ?
2) En quoi Decorator respecte mieux le principe Open/Closed ?
3) Quelle est la différence entre **héritage** et **composition** dans cet exemple ?

## Exécution
Pré-requis : Node.js
- Avant : `node code/avant/index.js`
- Après : `node code/apres/index.js`
