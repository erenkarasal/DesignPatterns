public class GumballMachine {
    State soldOutState;
    State noQurterState;
    State hasQuarterState;
    State soldState;
    State state = soldOutState;
    int count  =0;
    public GumballMachine(int numberGumballs){
        soldOutState = new SoldOutState(this);
        noQurterState = new NoQurterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.count = numberGumballs;
        if(numberGumballs>0){
            state = noQurterState;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }
    public void ejectQuarter(){
       state.ejectQuarter();
    }
    public void turnCrunk(){
      state.turnCrunk();
      state.dispense();
    }
    public void setState(State state){
        this.state = state;
    }
    void releaseBall(){
        System.out.println("A gumball comes rolling out of slot");
        if(count !=0){
            count = count-1;
        }
    }
}
