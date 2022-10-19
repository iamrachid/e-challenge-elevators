package main.java.com.sqli.states;

public interface ElevatorState {
    int getDistance(int elevatorFloor, int destinationFloor, int numberOfFloors);
}