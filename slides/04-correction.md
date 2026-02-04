# Correction + barème — Exercice Decorator

## Partie A — Sans Decorator (avant)

### Correction attendue (idées)
- Une nouvelle sous-classe (ex. `GateauVanillePaillettes`) qui ajoute `", paillettes"` et `+1`.
- Une classe de combinaison (ex. `GateauVanilleBougiesGlacagePaillettes`) **si** on reste dans l’approche héritage.
- Conclusion explicite : pour $n$ options, le nombre de combinaisons possibles est $2^n$ (donc potentiellement autant de classes à créer si on veut couvrir toutes les variantes).

### Barème (5 pts)
- 2 pts : ajout `Paillettes` fonctionne (description + prix)
- 2 pts : combinaison demandée fonctionne
- 1 pt : explication claire de l’explosion combinatoire

## Partie B — Avec Decorator (après)

### Correction attendue (code)
Décorateur `Paillettes` :
- étend `DecorateurGateau`
- surcharge `getDescription()` et `getPrix()`
- utilise `super.getDescription()` / `super.getPrix()`

Exemple de composition (il y en a plusieurs valides) :
- `new Chocolat(new Bougies(new Paillettes(new GateauVanille())))`

### Barème (7 pts)
- 3 pts : décorateur `Paillettes` correct (délégation + ajout)
- 2 pts : 2 compositions différentes (au moins 2 décorateurs dans une des deux)
- 2 pts : sorties console cohérentes (description + prix)

## Questions (8 pts)

### Q1 — Pourquoi l’héritage devient un problème ? (0–3 pts)
Attendu : multiplication des classes pour chaque combinaison, duplication, rigidité, maintenance difficile.

### Q2 — Open/Closed et Decorator ? (0–3 pts)
Attendu : on ajoute une nouvelle option en créant un nouveau décorateur, sans modifier `GateauVanille` ni les autres décorateurs.

### Q3 — Héritage vs composition ici ? (0–2 pts)
Attendu : héritage = statique à la compilation et multiplie les variantes; composition = on “enveloppe” dynamiquement des objets.

## Total : 20 points

Suggestion (tolérance) : accepter les solutions équivalentes si le comportement est bon, même si les noms de classes diffèrent.
