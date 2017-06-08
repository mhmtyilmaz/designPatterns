package creationalpatterns.builder;

/**
 * Created by MEHMET on 2.6.2017.
 */
public class BuilderDemo {

    public static void main(String arg []){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("This is an example ");
        stringBuilder.append("of the builder pattern.");
        System.out.println(stringBuilder);

        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");

        LunchOrder lunchOrder = builder.build();
        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
