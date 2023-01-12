package de.tum.in.ase.studentdorm;

import java.util.ArrayList;
import java.util.List;

public class Elevator {

    private static final int DEFAULT_CAPACITY = 15;

    private final List<Integer> sequence;

    private final int capacity;

    private final int maxFloor;

    private int currentFloor;

    private Stops stops;

    private Direction direction;

    private final List<Person> passengers;

    public Elevator(int maxFloor, int capacity) {

        if (capacity <= 0) {
          throw new IllegalArgumentException();
        } else {
            this.capacity = capacity;
        }

        this.maxFloor = maxFloor;
        this.stops = new Stops();

        sequence = new ArrayList<>();
        passengers = new ArrayList<>();

        this.direction = Direction.IDLE;
    }

    public Elevator(int maxFloor) {

        this.capacity = DEFAULT_CAPACITY;
        this.maxFloor = maxFloor;
        this.stops = new Stops();

        sequence = new ArrayList<>();
        passengers = new ArrayList<>();

        this.direction = Direction.IDLE;
    }

    public void move() {

        if(changeFloor()){

        }

    }

    public boolean changeFloor() {

        if (direction == Direction.UP) {

            return true;
        } else if (direction == Direction.DOWN) {

            return true;
        }

        return true;
    }

    public boolean openDoor(Person person) {
        return true;
    }

    public void closeDoor() {

    }

    public void printSequence() {
        for (Integer integer : sequence) {
            System.out.print(integer + "\n");
        }
    }

    public static int getDefaultCapacity() {
        return DEFAULT_CAPACITY;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getMaxFloor() {
        return maxFloor;
    }

    public List<Integer> getSequence() {
        return sequence;
    }

    public List<Person> getPassengers() {
        return passengers;
    }

    public Stops getStops() {
        return stops;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setStops(Stops stops) {
        this.stops = stops;
    }
}
