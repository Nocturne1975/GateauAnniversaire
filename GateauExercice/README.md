# Présentation — Patron Decorator (Gâteau d'anniversaire)

**Pré-requis :** JDK installé.


## Message clé

Le Decorator permet d'ajouter des responsabilités dynamiquement (bougies, glaçage, fruits, chocolat, etc.) sans créer une classe différente pour chaque combinaison.

## Exercice - 🎂 LE GATEAU D'ANNIVERSAIRE MAUDIT

C'est l'anniversaire de votre ami...
Encore.
Et comme chaque année, il veut un "gâteau simple".
Sauf que pour lui, "SIMPLE" veut dire :
> "Un gâteau vanille, mais avec du glaçage... et des bougies... et des fruits... et du chocolat... et peut-être des petits confettis comestibles si tu as le temps."

Résultat :
Vous vous retrouvez avec 14 classes Java juste pour gérer un gâteau.
Vous pleurez.
Votre IDE pleure.
Votre prof pleure.
Il est temps d’arrêter le carnage.

### 🍰 Le gâteau de base
- **GateauVanille** : 15 $  
Simple. Pur. Innocent.  
Pas encore traumatisé par vos décorations.

### ✨ Les décorations (a.k.a. les ennuis)
Chaque décoration ajoute un coût :
- **Bougies** : + 2 $
- **Glaçage** : + 3 $
- **Fruits** : + 4 $
- **Chocolat** : + 5 $

## 🧨 Le problème actuel

Votre code ressemble à ça :
- GateauVanilleAvecBougies
- GateauVanilleAvecGlacage
- GateauVanilleAvecBougiesEtGlacage
- GateauVanilleAvecFruits
- GateauVanilleAvecChocolat
- GateauVanilleAvecBougiesEtChocolat
- GateauVanilleAvecGlacageEtFruits
- GateauVanilleAvecBougiesEtGlacageEtFruitsEtChocolatEtUneCriseDeNerfs
- ...

Bref :
Vous avez inventé le patron “ExplosionDeClasses”.

## 🛠️ Votre mission (si vous l’acceptez)

Refactorer tout ça avec le patron Decorator, pour enfin retrouver une vie normale.

Vous devez :
1. Créer une interface `Gateau`
2. Implémenter `GateauVanille`
3. Créer `GateauDecorator`, la classe abstraite qui enveloppe les gâteaux
4. Créer les décorateurs :
   - Bougies
   - Glacage
   - Fruits
   - Chocolat
5. Composer librement les décorations, comme un burrito de sucre :

```java
Gateau g = new Fruits(new Bougies(new Glacage(new GateauVanille())));
```

### 🧾 Résultat attendu
Description : Gâteau vanille + Glaçage + Bougies + Fruits  
Coût total : 24 $ Et votre ami sera tout content!!!

Si votre gâteau coûte 87 $, vous avez probablement décoré votre IDE aussi.

### 💡 Questions existentielles (optionnel)
- Pourquoi hériter quand on peut décorer ?
- Si j’ajoute les décorateurs dans un autre ordre, est-ce que le gâteau explose ?
- Comment ajouter “Paillettes” sans réécrire 12 classes ?


## Correction

La Solution sera disponible apres ce cours.
