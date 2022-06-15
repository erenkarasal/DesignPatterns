public class TestStarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Expresso();
        System.out.println( "Cost = "+beverage.cost()+ " Description = " + beverage.getDescription()) ;
        Beverage beverage1= new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);
        System.out.println("Description =" +beverage1.getDescription()+"Cost = "+ beverage1.cost());
    }
}
