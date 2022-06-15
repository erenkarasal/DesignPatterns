public class TestPizzaFactoryPattern {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NyStylePizzaStore();
        PizzaStore chicagoPizza = new ChicagoStylePizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("Cheese");
        System.out.println("Ethan =" + pizza.getName());
        pizza =chicagoPizza.orderPizza("Cheese");
        System.out.println("Joel = "+ pizza.getName());

    }
}
