package com.swpuiot.textfive;

/**
 * Created by 羊荣毅_L on 2016/10/16.
 */
public class Collects {
    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getCount() {
        return count;
    }

    private int image;
    private String title;
    private String count;

    public Collects(int image, String title, String count) {
        this.image = image;
        this.title = title;
        this.count = count;
    }
}
