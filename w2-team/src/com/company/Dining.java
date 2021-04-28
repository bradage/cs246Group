package com.company;

public class Dining implements Expense{

    Destination _dest;
    int _numNights;

    public Dining(Destination dest, int nights){
        _dest = dest;
        _numNights = nights;

    }

    @Override
    public float getCost() {
        switch (_dest) {
            case Mexico:
                return 10.00f * _numNights;
            case Europe:
                return 20.00f * _numNights;
            case Japan:
                return 30.00f * _numNights;
            default:
                return 0f;
        }
    }
}
