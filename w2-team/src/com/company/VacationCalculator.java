package com.company;

import java.util.ArrayList;
import java.util.List;

public class VacationCalculator {

    public static void main(String[] args) {

        VacationCalculator vc = new VacationCalculator();

        // Calculate some vacation costs...
        float japanCost = vc.calculateVacationCost(Destination.Japan, 5);
        float mexicoCost = vc.calculateVacationCost(Destination.Mexico, 5);
        float europoeCost = vc.calculateVacationCost(Destination.Europe, 5);
        System.out.println(String.format("Total Cost for Japan is $%.2f%n", japanCost));
        System.out.println(String.format("Total Cost for Mexico is $%.2f%n", mexicoCost));
        System.out.println(String.format("Total Cost for Europe is $%.2f%n", europoeCost));
    }

    /**
     * Calculates the total cost for vacationing at a given location for
     * a specific number of nights.
     *
     * @param  dest the destination of the vacation
     * @return      the total cost of the vacation
     */
    public float calculateVacationCost(Destination dest, int numNights)
    {
        List<Expense> itenerary = new ArrayList<Expense>();
        itenerary.add(new Cruise(dest));
        itenerary.add(new Dining(dest, numNights));
        itenerary.add(new Lodging(dest, numNights));

        float totalCost = tallyExpenses(itenerary) ;
        return totalCost;

    }

    /**
     * An internal method used by VacationCalculator to loop through
     * a List of items that implement the Expense interface and
     * determine their cost
     *
     * @param  expenses A list of items that implement the Expense interface
     * @return          the total cost calculated by the items
     */
    float tallyExpenses(List<Expense> expenses)
    {
        float totalCost = 0;

        for(Expense e : expenses) {
            totalCost += e.getCost();
        }

        return totalCost;
    }
}
