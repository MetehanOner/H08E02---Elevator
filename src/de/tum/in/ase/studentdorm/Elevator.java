package de.tum.in.ase.studentdorm;

import java.util.ArrayList;
import java.util.List;

public class Elevator {

    private static final int DEFAULT_CAPACITY = 15;

    private final List<Integer> sequence;

    private final int capacity;

    private int maxFloor;

    private int currentFloor;

    private Stops stops;

    private Direction direction;

    private final List<Person> passengers;

    public Elevator(int maxFloor, int capacity) {

        this.capacity = capacity;

        sequence = new ArrayList<>();
        passengers = new ArrayList<>();
    }

    public Elevator(int maxFloor) {

        this.capacity = DEFAULT_CAPACITY;

        sequence = new ArrayList<>();
        passengers = new ArrayList<>();
    }

    public void move() {

    }

    public boolean changeFloor() {
        return false;
    }

    public boolean openDoor(Person person) {
        return true;
    }

    public void closeDoor() {

    }

    public void printSequence() {

    }

    public static int getDefaultCapacity() {
        return DEFAULT_CAPACITY;
    }
}
