package com.company;

import java.util.HashMap;
import java.util.Map;

public class CardActions {
    public static Map<Integer, Card> activeCards = new HashMap<>();

    public int createSimpleCard (Card.CardType type, SimpleCard.CardTypeDay cardTypeDay, int days){
        if (days > 0){
            int id = activeCards.size()+1;
            Card card = new SimpleCard(id, type, cardTypeDay, days);
            activeCards.put(id, card);
            return id;
        }
        else{
            return -1;
        }
    }

    public static int createTripsCard (Card.CardType type, int nTrips){
        if (nTrips > 0){
            int id = activeCards.size() + 1;
            Card card = new NumberOfTripsCard(id, type, nTrips);
            activeCards.put(id, card);
            return id;
        }
        else return -1;
    }

    public void deactivate (int id){
        Card card = activeCards.get(id);
        if (card != null){
            card.deactivation();
        }
    }
    public void activate (int id){
        Card card = activeCards.get(id);
        if (card != null){
            card.activation();
        }
    }

    public void printInfo (int id){
        System.out.println(activeCards.get(id).toString());
    }
}
