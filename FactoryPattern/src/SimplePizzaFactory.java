public class SimplePizzaFactory {
    public static Pizza createPizza(String type){
        Pizza pizza = null;

        if(type.equals("Cheese")){
            pizza = new CheesePizza();
        }
        else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }
        else if(type.equals("clam")){
            pizza = new ClamPizza();
        }
        return pizza;


    }

}
