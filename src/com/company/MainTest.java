package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void serializePerson() {
        String expected = "{\"id\":22,\"weight\":89,\"height\":190}";
        String actual = Main.serializePerson();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void deserializePerson() {
        Person expected = new Person(89, 44, 168);
        Person actual = Main.deserializePerson();
        Assert.assertEquals(expected, actual);
    }
}