package edu.upc.eetac.dsa.appminimo2.Entity;

/**
 * Created by pauli on 01/06/2017.
 */

public class RowItem {

    private String imageId;
    private String title;

    public RowItem(String imageId, String title) {
        this.imageId = imageId;
        this.title = title;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
