package Gateau_Exercice;

public class IcingDecorator extends CakeDecorator {
    public IcingDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " + icing";
    }

    @Override
    public double getPrice() {
        return cake.getPrice() + 2.0;
    }
}