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

## Exercice -🎂 LE GATEAU D'ANNIVERSAIRE MAUDIT

C'est l'anniversaire de votre ami...
Encore.
Et comme chaque année, il veut un "gâteau simple".
Sauf que pour lui, "SIMPLE" veut dire: 
    "Un gâteau vanille, mais avec du glaçage... et des bougies... et des fruits... et du chocolat... et peut-être des petits confettis comestibles si tu as le temps."

Résultat: 
Vous vous retrouvez avec 14 classes Java juste pour gérer un gâteau.
Vous pleurez.
Votre IDE pleure.
Votre prof pleure.
Il est temps d’arrêter le carnage.

🍰 Le gâteau de base
• 	GateauVanille : 15 $
Simple. Pur. Innocent.
Pas encore traumatisé par vos décorations.

✨ Les décorations (a.k.a. les ennuis)
Chaque décoration ajoute un coût :
# Décoration      # Prix    # Commentaire
- Bougies          + 2 $     Obligatoires si bous aimez le feu
- Glaçage          + 3 $     Pour cacher les fissures émotionnelles du gâteau
- Fruits           + 4 $     Pour donner l'illusion que c'est santé
- Chocolat         + 5 $     Pour les vrais gourmands

## 🧨 Le problème actuel
# Votre code ressemble à ça :
• 	GateauVanilleAvecBougies
• 	GateauVanilleAvecGlacage
• 	GateauVanilleAvecBougiesEtGlacage
• 	GateauVanilleAvecFruits
• 	GateauVanilleAvecChocolat
• 	GateauVanilleAvecBougiesEtChocolat
• 	GateauVanilleAvecGlacageEtFruits
• 	GateauVanilleAvecBougiesEtGlacageEtFruitsEtChocolatEtUneCriseDeNerfs
Bref :
Vous avez inventé le patron “ExplosionDeClasses”.

## 🛠️ Votre mission (si vous l’acceptez)
Refactorer tout ça avec le patron Decorator, pour enfin retrouver une vie normale.
Vous devez :
1. 	Créer une interface Gateau
2. 	Implémenter GateauVanille
3. 	Créer GateauDecorator, la classe abstraite qui enveloppe les gâteaux
4. 	Créer les décorateurs :
• 	Bougies
• 	Glacage
• 	Fruits
• 	Chocolat
1. 	Composer librement les décorations, comme un burrito de sucre :
    # Java:
     Gateau g = new Fruits(new Bougies(new Glacage(new GateauVanille())));

🧾 Résultat attendu
Description : Gâteau vanille + Glaçage + Bougies + Fruits
Coût total : 24 $


Si votre gâteau coûte 87 $, vous avez probablement décoré votre IDE aussi.

💡 Questions existentielles (optionnel)
- Pourquoi hériter quand on peut décorer ?
- Si j’ajoute les décorateurs dans un autre ordre, est-ce que le gâteau explose ?
- Comment ajouter “Paillettes” sans réécrire 12 classes ?
