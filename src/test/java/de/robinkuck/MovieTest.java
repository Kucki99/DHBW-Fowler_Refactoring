package de.robinkuck;

import org.junit.Assert;
import org.junit.Test;

public class MovieTest {

    @Test
    public void testGetPriceCode() {
        Movie movie = new Movie("Test movie", Movie.REGULAR);
        Assert.assertEquals(Movie.REGULAR, movie.getPriceCode());
    }

    @Test
    public void testSetPriceCode() {
        Movie movie = new Movie("Test movie", Movie.REGULAR);
        movie.setPriceCode(Movie.NEW_RELEASE);
        Assert.assertEquals(Movie.NEW_RELEASE, movie.getPriceCode());
    }

    @Test
    public void testGetTitle() {
        Movie movie = new Movie("Test movie", Movie.REGULAR);
        Assert.assertEquals("Test movie", movie.getTitle());
    }

}
