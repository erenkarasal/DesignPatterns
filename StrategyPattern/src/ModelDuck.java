public class ModelDuck extends Duck{
    @Override
    public void display() {
        System.out.println("I am a model duck");
    }
    public ModelDuck(){
        flyBehaviour=new FlyNowWay();
        quackBehaviour=new MuteQuack();
    }
}
