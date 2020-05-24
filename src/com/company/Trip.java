package com.company;

public class Trip <T1> {

    private T1 automobile;

    public Trip(T1 automobile) {

        this.automobile = automobile;
    }


    public T1 getAutomobile() {
        return automobile;
    }

    public void setAutomobile(T1 automobile) {
        this.automobile = automobile;
    }
}
