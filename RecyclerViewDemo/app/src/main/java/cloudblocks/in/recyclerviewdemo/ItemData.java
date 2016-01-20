package cloudblocks.in.recyclerviewdemo;

/**
 * Created by blackadmin on 20/1/16.
 */
public class ItemData {
    private String title;
    private int imageUrl;

    public ItemData(String title,int imageUrl){
        this.title = title;
        this.imageUrl = imageUrl;
    }
    //getters & setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }
}
