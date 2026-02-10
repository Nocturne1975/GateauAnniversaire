package Gateau_Exercice;

public abstract class CakeDecorator implements Cake {
    protected Cake cake;

    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }
}