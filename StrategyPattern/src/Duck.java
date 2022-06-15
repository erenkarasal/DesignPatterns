public abstract class Duck {
    public Duck(){

    }
    QuackBehaviour quackBehaviour;
    FlyBehaviour flyBehaviour;
    public void performQuack(){
        quackBehaviour.quack();
    }
    public void  performFly(){
        flyBehaviour.fly();
    }
    public abstract void  display();

    void swim(){
        System.out.println("All ducks float, even decoys!");
    }
    public void setFlyBehaviour(FlyBehaviour fb){
        flyBehaviour=fb;
    }
    public void setQuackBehaviour(QuackBehaviour qb){
        quackBehaviour=qb;
    }

}
