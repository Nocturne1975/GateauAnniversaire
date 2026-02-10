package Gateau_Exercice;

public class ChocolateDecorator extends CakeDecorator {
    public ChocolateDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " + chocolate";
    }

    @Override
    public double getPrice() {
        return cake.getPrice() + 2.5;
    }
}
