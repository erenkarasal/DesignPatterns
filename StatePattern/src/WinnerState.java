public class WinnerState implements State{
    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we have already giving yopu a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("sorry already crunk ");
    }

    @Override
    public void turnCrunk() {
        System.out.println("Turning twice dont take you two gumball");
    }

    @Override
    public void dispense() {
        if(count == 0){
            System.out.println("Oops,out of gumball");
            state = Sold_Out;
        }
        else {
            state = No_Quarter;
        }
    }
}
