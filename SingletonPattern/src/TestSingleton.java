public class TestSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance() ;
        System.out.println("Signleton object  => " + singleton);
        Singleton singleton2 = Singleton.getInstance() ;
        System.out.println("Signleton object 2  => " + singleton2);
    }
}
