public class CeilingFan {
    String room ;
    public static final int High = 3;
    public static final int Medium = 2;
    public static final int Low = 1;
    public static final int Off= 0;
    int speed;
    public CeilingFan(String room){
    this.room = room;
    speed = Off;
    }
    public void high(){
    speed=High;
    }
    public void medium(){
speed = Medium;
    }
    public void low(){
speed = Low;
    }

    public void on (){

        System.out.println(room+"Ceiling Fan is open");
    }
    public void off(){

        System.out.println(room+"ceiling Fan is closed");
    }
    public int getSpeed(){
        return speed;
    }

}
