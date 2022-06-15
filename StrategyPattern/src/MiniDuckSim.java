public class MiniDuckSim {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
        model.display();
        System.out.println("----------------------------------------");
        Duck redHeadDuck = new RedheadDuck();
        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.setFlyBehaviour(new FlyNowWay());
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
        redHeadDuck.swim();
    }
}
