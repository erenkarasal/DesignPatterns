public class Whip extends CondimentDecorator{


    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double cost() {
        return super.cost()+0.10;
    }
}
