package models;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SneakerTest {

    Sneaker testSneaker;

    @Test
    public void setUp() throws Exception {
    }

    @Test
    public void tearDown() throws Exception {
    }

    @Test
    public void setNameTest() {
        // given (1)
        String expected = "OZWEEGO";

        // when (2)
        testSneaker = new Sneaker();
        testSneaker.setName(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getName());
    }

    @Test
    public void setIdTest() {
        // given (1)
        Integer expected = 01;

        // when (2)
        testSneaker = new Sneaker();
        testSneaker.setId(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getId());
    }

    @Test
    public void setBrandTest() {
        // given (1)
        String expected = "Nike";

        // when (2)
        testSneaker = new Sneaker();
        testSneaker.setBrand(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getBrand());
    }

    @Test
    public void setSportTest() {
        // given (1)
        String expected = "Running";

        // when (2)
        testSneaker = new Sneaker();
        testSneaker.setSport(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getSport());
    }

    @Test
    public void setSizeTest() {
        // given (1)
        Double expected = 8.5;

        // when (2)
        testSneaker = new Sneaker();
        testSneaker.setSize(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getSize());
    }

    @Test
    public void setQuantityTest() {
        // given (1)
        Integer expected = 10000;

        // when (2)
        testSneaker = new Sneaker();
        testSneaker.setQuantity(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getQuantity());
    }

    @Test
    public void setPriceTest() {
        // given (1)
        float expected = 10.99f;

        // when (2)
        testSneaker = new Sneaker();
        testSneaker.setPrice(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getPrice());
    }

    @Test // (1)
    public void constructorTest(){

        // (2)
        int expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennnis";
        double expectedSize = 10.5f;
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        // (3)
        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty,expectedPrice);

        // (4)
        Assertions.assertEquals(expectedId, testSneaker.getId());
        Assertions.assertEquals(expectedName, testSneaker.getName());
        Assertions.assertEquals(expectedBrand, testSneaker.getBrand());
        Assertions.assertEquals(expectedSport, testSneaker.getSport());
        Assertions.assertEquals(expectedQty, testSneaker.getQuantity());
        Assertions.assertEquals(expectedPrice, testSneaker.getPrice());
    }
}
