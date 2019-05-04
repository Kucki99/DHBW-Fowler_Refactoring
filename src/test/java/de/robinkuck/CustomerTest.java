package de.robinkuck;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

    @Test
    public void testGetName() {
        Customer customer = new Customer("Test customer");

        Assert.assertEquals("Test customer", customer.getName());
    }

    @Test
    public void testStatementOutput() {
        Movie movie = new Movie("Test movie", Movie.REGULAR);
        Rental rental = new Rental(movie, 10);

        Customer customer = new Customer("Test customer");
        customer.addRental(rental);

        Assert.assertEquals("Rental Record for Test customer\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\tTest movie\t\t10\t14.0\n" +
                "Amount owed is 14.0\n" +
                "You earned 1 frequent renter points", customer.statement());
    }

}
