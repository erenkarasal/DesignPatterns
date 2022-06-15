public class NoQurterState implements State{
    GumballMachine _gumballMachine;
    public NoQurterState(GumballMachine gumballMachine){
        this._gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("You inserted a qurter");
        _gumballMachine.setState(_gumballMachine.hasQuarterState);

    }

    @Override
    public void ejectQuarter() {
        System.out.println("You have not inserted a qurter");

    }

    @Override
    public void turnCrunk() {
        System.out.println("You turned but there is no qurter");

    }

    @Override
    public void dispense() {
        System.out.println("you need to pay first");

    }
}
