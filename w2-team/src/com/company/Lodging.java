package com.company;

public class Lodging implements Expense{
    Destination _dest;
    int _numNights;

    public Lodging(Destination dest, int nights){
        _dest = dest;
        _numNights = nights;

    }

    @Override
    public float getCost() {
        switch (_dest) {
            case Mexico:
                return 100.00f * _numNights;
            case Europe:
                return (float) ((200.00f * _numNights) * 1.1);
            case Japan:
                return (float) ((300.00f * _numNights) * 1.3);
            default:
                return 0f;
        }
    }
}
