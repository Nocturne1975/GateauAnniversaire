package Gateau_Exercice;

public class FruitsDecorator extends CakeDecorator {
    public FruitsDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " + fruits";
    }

    @Override
    public double getPrice() {
        return cake.getPrice() + 3.0;
    }
}