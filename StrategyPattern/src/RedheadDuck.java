public class RedheadDuck extends Duck{
    @Override
    public void display() {
        System.out.println("ı am readhead duck");
    }
    public RedheadDuck(){
        quackBehaviour= new MuteQuack();
        flyBehaviour = new FlyWithWings();
    }
}
