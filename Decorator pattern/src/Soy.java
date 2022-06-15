public class Soy extends CondimentDecorator{
    Beverage _beverage;
    public Soy(Beverage beverage){
        this._beverage = beverage;
    }
    @Override
    public String getDescription() {
        return _beverage.getDescription()+"Soy";
    }

    @Override
    public double cost() {
        return _beverage.cost()+0.15;
    }
}
