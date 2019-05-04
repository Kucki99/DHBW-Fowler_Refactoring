package de.robinkuck;

import org.junit.Assert;
import org.junit.Test;

public class MovieTest {

    @Test
    public void testGetPriceCode() {
        Price price = new RegularPrice();
        Movie movie = new Movie("Test movie", price);
        Assert.assertEquals(price, movie.getPrice());
    }

    @Test
    public void testSetPriceCode() {
        Movie movie = new Movie("Test movie", new RegularPrice());
        Price price = new NewReleasePrice();
        movie.setPrice(price);
        Assert.assertEquals(price, movie.getPrice());
    }

    @Test
    public void testGetTitle() {
        Movie movie = new Movie("Test movie", new RegularPrice());
        Assert.assertEquals("Test movie", movie.getTitle());
    }

}
