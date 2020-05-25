package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TourniquetTest {

    @Test
    public void validate() {
        CardActions.createTripsCard(Card.CardType.STANDART, 5);
        boolean expected = Tourniquet.validate(CardActions.activeCards.get(1));
        Assert.assertEquals(true, expected);
    }
}