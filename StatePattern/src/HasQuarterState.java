public class HasQuarterState implements State{
    GumballMachine _gumballMachine;
    public HasQuarterState(GumballMachine gumballMachine){
        this._gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("You can not insert another qurter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Qurter returnde");
        _gumballMachine.setState(_gumballMachine.getNoQurterState());
    //go to no qurter state
    }

    @Override
    public void turnCrunk() {
        System.out.println("you turned");
        _gumballMachine.setState(_gumballMachine.getSoldState());
       // gp tp sold state
    }

    @Override
    public void dispense() {
        System.out.println("no gumball dispenesd");
    }
}
