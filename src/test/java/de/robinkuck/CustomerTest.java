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
    public void testStatement() {
        Movie movie = new Movie("Test movie", new RegularPrice());
        Rental rental = new Rental(movie, 10);

        Customer customer = new Customer("Test customer");
        customer.addRental(rental);

        Assert.assertEquals("Rentals for Test customer\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\tTest movie\t\t10\t14.0\n" +
                "Amount owed is 14.0\n" +
                "You earned 1 frequent renter points", customer.statement());
    }

    @Test
    public void testHtmlStatement() {
        Movie movie = new Movie("Test movie", new RegularPrice());
        Rental rental = new Rental(movie, 10);

        Customer customer = new Customer("Test customer");
        customer.addRental(rental);

        Assert.assertEquals("<H1>Rentals for <EM>Test customer</EM></H1><P>\n" +
                "Test movie: 14.0<BR>\n" +
                "<P>You owe <EM>14.0</EM><P>\n" +
                "You earned <EM>1</EM> frequent renter points<P>", customer.htmlStatement());
    }

    @Test
    public void testStatementForAllPriceCodes() {
        Movie movie1 = new Movie("Test movie 1", new RegularPrice());
        Rental rental1 = new Rental(movie1, 10);

        Movie movie2 = new Movie("Test movie 2", new NewReleasePrice());
        Rental rental2 = new Rental(movie2, 11);

        Movie movie3 = new Movie("Test movie 3", new ChildrensPrice());
        Rental rental3 = new Rental(movie3, 12);

        Customer customer = new Customer("Test customer");
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        Assert.assertEquals("Rentals for Test customer\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\tTest movie 1\t\t10\t14.0\n" +
                "\tTest movie 2\t\t11\t33.0\n" +
                "\tTest movie 3\t\t12\t15.0\n" +
                "Amount owed is 62.0\n" +
                "You earned 4 frequent renter points", customer.statement());
    }

}
