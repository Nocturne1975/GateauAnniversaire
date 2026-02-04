package Gateau_Exercice;

public class CandlesDecorator extends CakeDecorator {
    public CandlesDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " + candles";
    }

    @Override
    public double getPrice() {
        return cake.getPrice() + 1.5;
    }
}