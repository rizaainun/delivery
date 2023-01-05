package com.riza.delivery.Domain;

public class CategoryDomain {
    private String pic;
    private String title;

    public String getTitle() {
        return title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public CategoryDomain(String pic, String title) {
        this.pic = pic;
        this.title = title;
    }
}
