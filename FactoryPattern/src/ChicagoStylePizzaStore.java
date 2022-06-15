public class ChicagoStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {

        if(type.equals("Cheese")){
            return new ChicagoCheesePizza();
        }
        else if(type.equals("pepperoni")){
            return new ChicagoPepperoniPizza();
        }
        else if(type.equals("clam")){
            return new ChicagoClamPizza();
        }
        else{
            return null;
        }

    }
}
