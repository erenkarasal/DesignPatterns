import java.util.ArrayList;

public abstract class Pizza {
String name ;
String dough;
String sauce;
ArrayList topping = new ArrayList();
    public void prepare(){
        System.out.println("preparing .. "+ name);
        System.out.println("tossing dough");
        System.out.println("Adding sauce");
        System.out.println("Adding toppings");
        for (int i = 0;i<topping.size();i++){
            System.out.println(""+ topping.get(i));

        }
    }
    public void bake(){
        System.out.println("Bake for 25 minutes");
    }
    public void cut(){
        System.out.println("cutting pizza ");
    }
    public void box(){
        System.out.println("Boxingf");
    }
    public String getName(){
    return name;
    }
}
