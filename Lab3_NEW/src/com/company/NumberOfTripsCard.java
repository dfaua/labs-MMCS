package com.company;

public class NumberOfTripsCard extends Card{
    public int nTripsLeft;

    public NumberOfTripsCard(int id, CardType type, int nTripsLeft) {
        super(id, type);
        this.nTripsLeft = nTripsLeft;
    }

    public Status validate(){
        if (isActive && nTripsLeft != 0){
            nTripsLeft--;
            if (cardType == cardType.PREFERENTIAL){
                return Status.ACTIVE_PREFERENTIAL;
            }
            return Status.ACTIVE;
        }
        return Status.NOT_ACTIVE;
    }

    @Override
    public String toString() {
        String info = "Card id: " + id +"\nCard type: Trips card \nTrips left: " + nTripsLeft + "\nStatus: " + isActive;
        return info;
    }
}
