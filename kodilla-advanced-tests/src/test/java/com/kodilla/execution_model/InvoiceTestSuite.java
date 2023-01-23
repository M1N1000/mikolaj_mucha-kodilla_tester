package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class InvoiceTestSuite {
    Invoice invoice = new Invoice();
    Item chleb = new Item("chleb", 3.00);
    Item mleko = new Item("mleko", 2.50);
    Item ser = new Item("ser", 5.20);
    Item pomidor = new Item("pomidor", 11.56);
    Item maslo = new Item("Masło", 5.70);

    @Test public void ShouldAddItemsToInvoice() {

        int numberOfItems = invoice.getSize();
        assertEquals(5, numberOfItems);
    }

    @Test
    public void testPriceAndName() {

        Item result = invoice.getItem(4);
        assertEquals("ser", result.getName());
        assertEquals(5.20, result.getPrice(), 0.01);
    }

    @Test
    public void testNoExistItem() {

        Item result = invoice.getItem(-3);
        assertNull(result);
    }

    @Test
    public void shouldReturnNullWhenPassingOutOfRangeIndex() {

        Item result = invoice.getItem(7);
        assertNull(result);
    }

    @Test
    public void ShouldClear() {

        int numberOfItemsBeforeClean = invoice.getSize();
        invoice.clear();
        assertEquals(0, invoice.getSize());
        assertEquals(5, numberOfItemsBeforeClean);
    }

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(chleb);
        invoice.addItem(mleko);
        invoice.addItem(maslo);
        invoice.addItem(pomidor);
        invoice.addItem(ser);
    }
    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

}