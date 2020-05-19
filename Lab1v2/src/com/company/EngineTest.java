package com.company;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class EngineTest {

    @Test
    public void getPhrases() {
        ArrayList<String> test = new ArrayList<>();
        test.add("abcdefgh");
        test.add("abcd");
        test.add("abcdnkl");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("abcd");
        expected.add("middle05887924651884313216797954305");
        expected.add("abcd");
        expected.add("abcdnkl");
        ArrayList<String> actual = Engine.getPhrases(test);
        assertEquals(expected, actual);

    }
}