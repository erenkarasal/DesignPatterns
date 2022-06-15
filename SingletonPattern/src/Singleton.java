public class Singleton {
    private static Singleton initInstance;

    private Singleton(){

    }
    public static Singleton getInstance(){
    if (initInstance == null){
        initInstance = new Singleton();

    }

        return initInstance;
    }

}
