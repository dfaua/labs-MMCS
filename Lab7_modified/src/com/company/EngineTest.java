package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EngineTest {

    @Test
    public void calculations() {
        Assert.assertEquals(3, Math.round(Engine.calculations(1)));
    }
}