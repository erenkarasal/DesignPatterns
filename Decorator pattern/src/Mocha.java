public class Mocha extends CondimentDecorator{
Beverage _beverage;
public Mocha(Beverage beverage){
    this._beverage= beverage;
}
@Override
    public String getDescription() {
        return _beverage.getDescription() + "Mocha";
    }
    @Override
    public double cost() {
        return _beverage.cost()+0.2;
    }
}
