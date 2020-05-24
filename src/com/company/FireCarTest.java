package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.*;

public class FireCarTest {
    private ByteArrayOutputStream output = new ByteArrayOutputStream();
    @Test
    public void addPassenger() {
        FireCar.addPassenger(1, "Man");
        Assert.assertEquals("We cannot add this person to the trip!", output.toString());
    }
}