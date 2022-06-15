public class Stereo {
    String room;
    public Stereo(String room){
    this.room = room;
    }
    public void on(){
        System.out.println(room+" Stereo is on");
    }
    public void off(){
        System.out.println(room+" Stereo is off");
    }
    public void setCd(){
        System.out.println(room+" setted CD");
    }
    public void setDVD(){
        System.out.println(room+" Setted DVD");
    }
    public void setRadio(){
        System.out.println(room+" Setted Radio");
    }
    public void setVolume(int volume){
        System.out.println("Setted Volume"+volume);
    }
}
