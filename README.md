# Présentation — Patron Decorator (Gâteau d'anniversaire)

Ce dépôt contient deux versions du même problème :
- **Avant** : solution par héritage → explosion combinatoire des classes.
- **Après** : solution avec le **patron Decorator** → composition flexible.

## Contenu

- Documents “présentation” :
  - `slides/01-avant.md`
  - `slides/02-apres.md`
  - `slides/03-exercice.md`
  - `slides/04-correction.md`
- Code exécutable (JavaScript / Node) :
  - `code/avant/index.js`
  - `code/apres/index.js`

## Exécuter les exemples

Pré-requis : **Node.js**.

- Avant (héritage) :
  - `node code/avant/index.js`
- Après (decorator) :
  - `node code/apres/index.js`

## Message clé

Le Decorator permet d'ajouter des responsabilités dynamiquement (bougies, glaçage, fruits, chocolat, etc.) sans créer une classe différente pour chaque combinaison.
# GateauAnniversaire
