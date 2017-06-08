package creationalpatterns.Factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MEHMET on 4.6.2017.
 */
public abstract class Website {


    protected List<Page> pages = new ArrayList<>();

    public List<Page> getPages() {
        return pages;
    }

    public Website(){
        this.createWebsite();
    }

    public abstract void createWebsite();
}
