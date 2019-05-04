package de.robinkuck;

import org.junit.Assert;
import org.junit.Test;

public class RentalTest {

    Movie movie = new Movie("Test movie", new RegularPrice());

    @Test
    public void testGetDaysRented() {
        Rental rental = new Rental(movie, 10);
        Assert.assertEquals(10, rental.getDaysRented());
    }

    @Test
    public void testGetMovie() {
        Rental rental = new Rental(movie, 10);
        Assert.assertEquals(movie, rental.getMovie());
    }

}
