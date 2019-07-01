package com.adefemikolawole.hashing;


import org.junit.Assert;
import org.junit.Test;




public class AppTest {

    private String INPUT = "11234562415446845848463464";

    @Test
    public void testLength() {
        Assert.assertEquals(64, App.sha256hex(INPUT).length());
    }

    @Test
    public void testHex() {
        String expected = "6c326fad389be7c836fcb21f91e2a081a3989e28a9789c9e7703f485b44d02bb";
        Assert.assertEquals(expected, App.sha256hex(INPUT));
    }

}