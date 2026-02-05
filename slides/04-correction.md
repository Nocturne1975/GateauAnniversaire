# Correction + barème — Exercice Decorator (Java)

## Partie A — Avant (héritage)

### Correction attendue (idées)
- Identifier l’explosion de classes : une classe par combinaison (`GateauVanilleAvecBougiesEt...`).
- Expliquer que pour $n$ décorations, il existe jusqu’à $2^n$ combinaisons → code dur à maintenir/étendre.

### Barème (5 pts)
- 2 pts : observation correcte (exemples de classes et rôle de `Main.java`)
- 2 pts : explication claire du problème (duplication, rigidité)
- 1 pt : mention de l’explosion combinatoire ($2^n$)

## Partie B — Après (Decorator)

### Correction attendue (structure)
1) `Gateau` (interface)
2) `GateauVanille` (implémente `Gateau`)
3) `GateauDecorator` (abstraite, enveloppe un `Gateau`)
4) Décorateurs concrets : `Bougies`, `Glacage`, `Fruits`, `Chocolat`

### Exemple de solution (extraits)

```java
public interface Gateau {
	String getDescription();
	double getPrix();
}
```

```java
public abstract class GateauDecorator implements Gateau {
	protected final Gateau gateau;
	protected GateauDecorator(Gateau gateau) {
		this.gateau = gateau;
	}
	@Override public String getDescription() { return gateau.getDescription(); }
	@Override public double getPrix() { return gateau.getPrix(); }
}
```

```java
Gateau g = new Fruits(new Bougies(new Glacage(new GateauVanille())));
System.out.println(g.getDescription() + " : " + g.getPrix() + " $");
// Prix attendu : 15 + 3 + 2 + 4 = 24
```

Exemple de décorateur concret (même pattern pour `Glacage`, `Fruits`, `Chocolat`) :

```java
public class Glacage extends GateauDecorator {
	public Glacage(Gateau gateau) {
		super(gateau);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + " + Glaçage";
	}

	@Override
	public double getPrix() {
		return super.getPrix() + 3.0;
	}
}
```

### Barème (7 pts)
- 3 pts : `GateauDecorator` correct (délégation + encapsulation)
- 2 pts : décorateurs concrets corrects (description + prix)
- 2 pts : `Main.java` compose au moins 2 gâteaux et affiche des résultats cohérents

## Questions (8 pts)

### Q1 — Pourquoi l’héritage devient un problème ? (0–3 pts)
Attendu : multiplication des classes, duplication, maintenance difficile.

### Q2 — Open/Closed et Decorator ? (0–3 pts)
Attendu : ajouter une décoration = ajouter une nouvelle classe décorateur, sans modifier les classes existantes.

### Q3 — Héritage vs composition ici ? (0–2 pts)
Attendu : héritage = variantes statiques; composition = comportement ajouté dynamiquement via enveloppement.

## Total : 20 points

Tolérance : accepter les solutions équivalentes si l’architecture Decorator est respectée et que les sorties sont cohérentes.
