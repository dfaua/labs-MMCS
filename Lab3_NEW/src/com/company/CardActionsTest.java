package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardActionsTest {

    @Test
    public void createTripsCard() {
        Assert.assertEquals(-1, CardActions.createTripsCard(Card.CardType.STANDART, -2));
    }
}