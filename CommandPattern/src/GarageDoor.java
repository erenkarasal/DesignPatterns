public class GarageDoor {
    String garage;
    public GarageDoor(String garage){
        this.garage=garage;
    }
    public void up(){
        System.out.println(garage+"Garage door is up");
    }
    public void down(){
        System.out.println(garage+"Garage door is down");
    }
}
