package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.*;

public class BusTest {

    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Test
    public void addPassenger() {
        for (int i = 0; i < 19; i++){
            Bus.addPassenger(1, "David");
        }
        Assert.assertEquals("No free seats!", output.toString());

    }
}