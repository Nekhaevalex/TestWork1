package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Rabbit> rabbits;
    private static int[] last = new int[2];
    private static int countPopulationAmount() {
        if ((last[0]==0) && (last[1]==0)) {
            last[0]=last[1];
            last[1] = 1;
            return 1;
        } else {
        int toReturn=last[0]+last[1];
        last[0]=last[1];
        last[1] = toReturn;
        return toReturn;
        }
    }
    private static void initialize() {
        last[0]=0;
        last[1]=0;
        rabbits = new ArrayList<Rabbit>();
    }
    public static void main(String[] args) {
        initialize();
        TimeManager timer = new TimeManager();
        int breedingCycles = 6; //Amount of years to calculate. Up to six cycles!!!
        for (int i = 1; i<= breedingCycles; i++) {
            int rabbitsRequired = countPopulationAmount();
            for (int j = 1; j<=rabbitsRequired; j++) {
                Rabbit newRabbit = new Rabbit();
                rabbits.add(newRabbit);
            }
            timer.newYear();
        }
        System.out.println("Rabbits family:");
        for (Rabbit s: rabbits) {
            System.out.println(s.toString());
        }
    }
}
