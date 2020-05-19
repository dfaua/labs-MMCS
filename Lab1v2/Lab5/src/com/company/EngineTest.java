package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class EngineTest {

    @Test
    public void sorting_Writing() {
        ArrayList<String> beforeSort = new ArrayList<>();
        beforeSort.add("afadfsdfs");
        beforeSort.add("asdasd");
        beforeSort.add("asdasdasdasdaasd");
        ArrayList<String> afterSort = new ArrayList<>();
        afterSort.add("asdasd");
        afterSort.add("afadfsdfs");
        afterSort.add("asdasdasdasdaasd");
        Engine.sorting_Writing(beforeSort, "hz.onoTutNeNado");
        Assert.assertEquals(Engine.sorting_Writing(beforeSort, "hz.onoTutNeNado"), afterSort);
    }
}