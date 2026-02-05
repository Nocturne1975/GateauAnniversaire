# Exercice : Le Gâteau d’anniversaire Maudit - Decorator  
**Par :** Asma Ajourdi, Sonia Mhimdi, Marina Kamel, Sonia Corbin

C’est l’anniversaire de votre ami…  
Encore.  
Et comme chaque année, il veut un gâteau “simple”.  
Sauf que pour lui, “simple” veut dire :  
« Un gâteau vanille, mais avec du glaçage… et des bougies… et des fruits… et du chocolat… et peut-être des paillettes comestibles si t’as le temps. »

Résultat :  
Vous vous retrouvez avec 14 classes Java juste pour gérer un gâteau.  
Vous pleurez.  
Votre IDE pleure.  
Votre prof pleure.  
Il est temps d’arrêter le carnage.

---

## Objectifs
- Comprendre le fonctionnement du patron de conception **Decorator**
- Reconnaître les cas d’utilisation propices pour le patron **Decorator**

---

## Étapes préparatoires

1. Clonez le dépôt de l’exercice  
   ```bash
   git clone git@github.com:Nocturne1975/GateauAnniversaire.git
   ```
   ou  
   ```bash
   git clone https://github.com/Nocturne1975/GateauAnniversaire.git
   ```

2. Lancez le projet Java  
   ```bash
   mvn clean package
   java -jar target/patrons-agence-voyages-1.0-SNAPSHOT.jar
   ```
   ou directement à partir de votre IDE.

---

## Contexte

### 🍰 Le gâteau de base
**GateauVanille : 15 $**  
Simple. Pur. Innocent.  
Pas encore traumatisé par vos décorations.

### ✨ Les décorations (a.k.a. les ennuis)

Chaque décoration ajoute un coût :
________________________________________________________________________
| Décoration | Prix | Commentaire                                      |
|============|======|==================================================|
| Bougies    | +2 $ | Obligatoires si vous aimez le feu                |
| Glaçage    | +3 $ | Pour cacher les fissures émotionnelles du gâteau |
| Fruits     | +4 $ | Pour donner l’illusion que c’est santé           |
| Chocolat   | +5 $ | Pour les vrais gourmands                         |
________________________________________________________________________

---

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

Bref :  
Vous avez inventé le patron **“ExplosionDeClasses”**.

---

## 🛠️ Votre mission (si vous l’acceptez)

Refactorer tout ça avec le patron **Decorator**, pour enfin retrouver une vie normale.

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

---

## 🧾 Résultat attendu

**Description :** Gâteau vanille + Glaçage + Bougies + Fruits  
**Coût total :** 24 $

Si votre gâteau coûte 87 $, vous avez probablement décoré votre IDE aussi.
Et votre ami sera trrrès impressionné. Et heureux.
---

## 💡 Questions existentielles (optionnel)

- Pourquoi hériter quand on peut décorer ?
- Si j’ajoute les décorateurs dans un autre ordre, est-ce que le gâteau explose ?
- Comment ajouter “Paillettes” sans réécrire 12 classes ?

---

## 🎁 Bonus (facultatif)

Créer une interface console où l’utilisateur peut :
- Choisir un gâteau  
- Ajouter des décorations  
- Regretter ses choix  
- Voir le prix final  
- Et se demander pourquoi il n’a pas juste acheté un gâteau chez IGA