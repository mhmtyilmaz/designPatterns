package creationalpatterns.factory;

/**
 * Created by MEHMET on 4.6.2017.
 */
public class Blog extends Website {

    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
