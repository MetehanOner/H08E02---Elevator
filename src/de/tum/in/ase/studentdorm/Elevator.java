package de.tum.in.ase.studentdorm;

import java.util.List;

public class Elevator {

    private static final int DEFAULT_CAPACITY = 15;

    private List<Integer> sequence;

    private int capacity;

    private int maxFloor;

    private int currentFloor;

    private Stops stops;

    private Direction direction;

    private List<Person> passengers;

    public Elevator(int maxFloor, int capacity) {

    }

    public Elevator(int maxFloor) {

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
