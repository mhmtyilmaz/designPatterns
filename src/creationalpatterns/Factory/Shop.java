package creationalpatterns.Factory;

/**
 * Created by MEHMET on 4.6.2017.
 */
public class Shop extends Website {

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
