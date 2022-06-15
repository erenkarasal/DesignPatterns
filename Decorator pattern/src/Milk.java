public class Milk extends CondimentDecorator{


    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double cost() {
        return super.cost()+ 0.1;
    }
}
