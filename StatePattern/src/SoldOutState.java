public class SoldOutState implements State{
    @Override
    public void insertQuarter() {
        System.out.println("Oops,out of gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You have not inserted qurter");
    }

    @Override
    public void turnCrunk() {
        System.out.println("There is no gumball");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
