package com.company;

import java.time.LocalTime;
import java.util.Scanner;

public class SimpleCard extends Card{
    enum CardTypeDay{
        DAY,
        EVENING,
        NIGHT
    }

    public CardTypeDay cType;
    public int nDays;

    public SimpleCard(int id, CardType type, CardTypeDay cType, int nDays) {
        super(id, type);
        this.cType = cType;
        this.nDays = nDays;
    }

    public Status validate(){
        int time = LocalTime.now().getHour();
        if (time >= 9 && time < 14 && cType == CardTypeDay.DAY){
            if(validateLeftDays()){
                if (cardType == CardType.PREFERENTIAL){
                    return Status.ACTIVE_PREFERENTIAL;
                }
                return Status.ACTIVE;
            }
        }
        if (time >= 14 && time < 19 && cType == CardTypeDay.EVENING){
            if(validateLeftDays()){
                if (cardType == CardType.PREFERENTIAL){
                    return Status.ACTIVE_PREFERENTIAL;
                }
                return Status.ACTIVE;
            }
        }
        if (time >= 19 && cType == CardTypeDay.NIGHT){
            if(validateLeftDays()){
                if (cardType == CardType.PREFERENTIAL){
                    return Status.ACTIVE_PREFERENTIAL;
                }
                return Status.ACTIVE;
            }
        }
        return Status.NOT_ACTIVE;
    }

    private boolean validateLeftDays(){
        if (nDays > 0){
            nDays--;
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        String info = "Card id: " + id +"\nCard type: Time card \nDays left: " + nDays + "\nStatus: " + isActive;
        return info;
    }
}
