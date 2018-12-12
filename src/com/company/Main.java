package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        tinkerTailor(5, 3);
    }

    public static int tinkerTailor(int nrOfChildren, int jumps) {
        ArrayList<Integer> kiddos = new ArrayList<>();
        for (int i = 1; i <= nrOfChildren; i++) {
            kiddos.add(i);
        }
        int startingNr = 0;
        while (kiddos.size() > 1) {
            int indexToGet = (startingNr + jumps - 1) % kiddos.size();
            kiddos.remove(indexToGet);
            startingNr = indexToGet;
        }
        return kiddos.get(0);
    }

}


