package com.company;

public class Cruise implements Expense{

    Destination _destination;

    public Cruise(Destination dest){
        _destination = dest;
    }

    @Override
    public float getCost() {
        switch (_destination) {
            case Mexico:
                return 1000.00f;
            case Europe:
                return 2000.00f;
            case Japan:
                return 3000.00f;
            default:
                return 0f;
        }
    }

}


