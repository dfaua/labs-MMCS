package com.company;

public class Card {

    enum Status {
        ACTIVE,
        NOT_ACTIVE,
        ACTIVE_PREFERENTIAL
    }

    enum CardType{
        STANDART,
        PREFERENTIAL,
        VIP
    }

    public int id;
    public CardType cardType;
    public boolean isActive = true;

    public Card(int id, CardType type) {
        this.id = id;
        this.cardType = type;
    }

    public Status check(){
        if(isActive){
            if(cardType == CardType.PREFERENTIAL){
                return Status.ACTIVE_PREFERENTIAL;
            }
            return Status.ACTIVE;
        }
        return Status.NOT_ACTIVE;
    }

    public void activation(){
        isActive = true;
    }
    public void deactivation(){
        isActive = false;
    }
}
