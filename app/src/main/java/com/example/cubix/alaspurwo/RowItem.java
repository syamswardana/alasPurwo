package com.example.cubix.alaspurwo;

/**
 * Created by cubix on 21/03/18.
 */

class RowItem {

    private String text;
    private int imageHutan;

    public RowItem(String text, int imageHutan) {
        this.text = text;
        this.imageHutan = imageHutan;
    }

    public int getImageHutan() {
        return imageHutan;
    }

    public void setImageHutan(int imageHutan) {
        this.imageHutan = imageHutan;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
