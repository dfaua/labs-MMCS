package com.company;

public class Tourniquet {
    public static boolean validate(Card card){
        if (card == null){
            return false;
        }
        Card.Status cardValidation = card.check();
        if(cardValidation == Card.Status.NOT_ACTIVE){
            return false;
        }
        return true;
    }
    public static boolean verifyLeftDays(SimpleCard card){
        if(card.nDays > 0){
            card.nDays--;
            return true;
        }
        return false;
    }


}
