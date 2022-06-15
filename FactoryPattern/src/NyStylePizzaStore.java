public class NyStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {

        if(type.equals("Cheese")){
           return new NYCheesePizza();
        }
        else if(type.equals("pepperoni")){
            return new NYPepperoniPizza();
        }
        else if(type.equals("clam")){
            return new NYClamPizza();
        }
        else
        {
            return null;
        }

    }
}
