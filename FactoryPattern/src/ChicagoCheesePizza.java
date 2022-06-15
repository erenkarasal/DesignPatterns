public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza(){
        name="Chicago style Sauce and cheese pizza ";
        dough="Extra thick crust dough";
        sauce="Plum tomato suace";
        topping.add("Shredded Mozzarella Cheese");
    }
    public void cut(){
        System.out.println("cutting the pizza square slices");
    }
}
