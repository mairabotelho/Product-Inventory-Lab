package services;

import models.Sneaker;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class SneakerServiceTest {

    SneakerService sneakerService;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void createTest(){

        // (1)
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennis";
        double expectedSize = 10.5;
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        // (2)
        sneakerService = new SneakerService();
        Sneaker testSneaker = SneakerService.create(expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty, expectedPrice);

        // (3)
        int actualId = testSneaker.getId();
        String actualName = testSneaker.getName();
        String actualBrand = testSneaker.getBrand();
        String actualSport = testSneaker.getSport();
        double actualSize = testSneaker.getSize();
        int actualQty = testSneaker.getQuantity();
        float actualPrice = testSneaker.getPrice();

        // (4)
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedSport, actualSport);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);

    }

    @Test
    public void sneakerMethodsTest(){

        sneakerService = new SneakerService();

        Sneaker sneaker1 = SneakerService.create("Zero", "Nike", "Running",
                9.5, 300, 90.00f);
        Sneaker sneaker2 = SneakerService.create("Air Jordan", "Nike", "Basketball",
                11, 200, 120.00f);
        Sneaker sneaker3 = SneakerService.create("Old Skool", "Vans", "Skate",
                8, 150, 70.00f);
        Sneaker sneaker4 = SneakerService.create("Authentic", "Vans", "Skate",
                10.5, 300, 86.00f);

        Sneaker expected1 = sneaker3;
        Sneaker actual1 = sneakerService.findSneaker(2);
        Assert.assertEquals(expected1, actual1);

        Assert.assertTrue(sneakerService.delete(0));

        Sneaker[] inventory = sneakerService.findAll();
        for (Sneaker sneaker : inventory)
            System.out.println(sneaker.getName()+ " - " + sneaker.getBrand());


    }
}