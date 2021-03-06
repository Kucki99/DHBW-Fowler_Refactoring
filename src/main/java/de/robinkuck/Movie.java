package de.robinkuck;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private Price price;

    public Movie(String newtitle, Price newPrice) {
        title = newtitle;
        setPrice(newPrice);
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price newPrice) {
        this.price = newPrice;
    }

    public String getTitle() {
        return title;
    }
}