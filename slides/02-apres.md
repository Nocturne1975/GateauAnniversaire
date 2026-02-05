# Après — Patron Decorator (Java)

## Idée
Au lieu d’avoir une classe par combinaison, on crée :
- un **composant** : `Gateau`
- un **composant concret** : `GateauVanille`
- un **décorateur abstrait** : `GateauDecorator` qui *enveloppe* un `Gateau`
- des **décorateurs concrets** : `Bougies`, `Glacage`, `Fruits`, `Chocolat`

Chaque décorateur :
- délègue à l’objet “enveloppé”
- ajoute *sa* partie de description et *son* coût

## Avantages
- Composition dynamique : on combine à l’exécution
- Plus d’explosion combinatoire
- Open/Closed : ajouter `Paillettes` = créer une nouvelle classe décorateur, sans modifier le reste

## Exemple (Java)

### 1) Composant (interface)
```java
package Gateau_Exercice;

public interface Gateau {
    String getDescription();
    double getPrix();
}
```

### 2) Décorateur abstrait
```java
package Gateau_Exercice;

public abstract class GateauDecorator implements Gateau {
    protected final Gateau gateau;

    protected GateauDecorator(Gateau gateau) {
        this.gateau = gateau;
    }

    @Override
    public String getDescription() {
        return gateau.getDescription();
    }

    @Override
    public double getPrix() {
        return gateau.getPrix();
    }
}
```

### 3) Décorateur concret (ex. Bougies)
```java
package Gateau_Exercice;

public class Bougies extends GateauDecorator {
    public Bougies(Gateau gateau) {
        super(gateau);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Bougies";
    }

    @Override
    public double getPrix() {
        return super.getPrix() + 2.0;
    }
}
```

### 4) Composition
```java
Gateau g = new Fruits(new Bougies(new Glacage(new GateauVanille())));
System.out.println(g.getDescription() + " : " + g.getPrix() + " $");
```

Note : le **prix** ne dépend pas de l’ordre, mais la **description** suit l’ordre d’enveloppement.
