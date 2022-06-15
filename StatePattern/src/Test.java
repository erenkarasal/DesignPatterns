public class Test {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrunk();

        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrunk();

        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrunk();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrunk();
        gumballMachine.ejectQuarter();

        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrunk();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrunk();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrunk();
        System.out.println(gumballMachine);
    }
}
