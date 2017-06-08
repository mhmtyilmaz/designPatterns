package creationalpatterns.singleton;

/**
 * Created by MEHMET on 2.6.2017.
 */
public class Singleton {
    private static Singleton instance = null;

    private Singleton() {

    }


    public static Singleton getInstance() {
        if (instance == null) {
            //Thread-safe
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
