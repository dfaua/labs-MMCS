package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordsTest {

    @Test
    public void countAverage() {
        EnterPharses phrase1 = new EnterPharses("11 digitsss");
        EnterPharses phrase2 = new EnterPharses("9 digitss");
        EnterPharses phrase3 = new EnterPharses("20 digitssssssssssss");
        int expected = 10;
        int actual = Words.countAverage();
        Assert.assertEquals(expected, actual);
    }
}