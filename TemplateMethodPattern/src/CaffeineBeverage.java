public abstract class CaffeineBeverage {
    final void prepareRecipe(){
    boilWater();
    brew();
    pourInCup();
    if(customerWantsCondiments()){
        addCondiments();
    }

    }
    abstract void brew();
    abstract void addCondiments();
    public void boilWater(){
        System.out.println("Boiling water");
    }
    public void pourInCup(){
        System.out.println("Pouring in cup");
    }
    boolean customerWantsCondiments(){
        return true;
    }
}
