package main.java.com.sqli.elevators;

import main.java.com.sqli.states.ElevatorState;
import main.java.com.sqli.states.ElevatorStateResting;

public class Elevator {

    // attributes
    private String id;
    private int floor;
    private int numberOfFloors;
    private ElevatorState elevatorState;

    // constructors
    public Elevator(String id, int floor, int numberOfFloors) {
        this.id = id;
        this.floor = floor;
        this.numberOfFloors = numberOfFloors;
        this.elevatorState = new ElevatorStateResting();
    }

    // getters & setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public ElevatorState getElevatorState() {
        return elevatorState;
    }

    public void setElevatorState(ElevatorState elevatorState) {
        this.elevatorState = elevatorState;
    }

    public int getDistance(int destinationFloor){
        return elevatorState.getDistance(floor, destinationFloor, numberOfFloors);
    }
}
