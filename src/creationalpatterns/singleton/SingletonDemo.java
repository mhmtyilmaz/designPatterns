package creationalpatterns.singleton;

/**
 * Created by MEHMET on 2.6.2017.
 */
public class SingletonDemo {
    public static void main(String org []){
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
    }
}
