package creationalpatterns.factory;

/**
 * Created by MEHMET on 4.6.2017.
 */
public class WebsiteFactory {

    public static Website getWebsite(WebsiteType siteType){

        switch (siteType){
            case BLOG : {
                return new Blog();
            }
            case SHOP : {
                return new Shop();
            }
            default:{
                return null;
            }
        }
    }
}
