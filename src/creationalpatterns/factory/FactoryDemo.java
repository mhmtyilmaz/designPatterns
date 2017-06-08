package creationalpatterns.factory;

/**
 * Created by MEHMET on 4.6.2017.
 */
public class FactoryDemo {

    public static void main(String arg []){

        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(site.getPages());

    }
}
