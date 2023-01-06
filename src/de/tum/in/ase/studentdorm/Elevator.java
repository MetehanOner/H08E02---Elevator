package de.tum.in.ase.studentdorm;

import java.util.List;

public class Elevator {

    private static final int DEFAULT_CAPACITY = 15;

    private List<Integer> sequence;

    private int capacity;

    private int maxFloor;

    private int currentFloor;

    public Elevator() {



    }

    public static int getDefaultCapacity() {
        return DEFAULT_CAPACITY;
    }
}
