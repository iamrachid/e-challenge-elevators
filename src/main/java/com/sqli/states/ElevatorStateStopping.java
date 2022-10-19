package main.java.com.sqli.states;

public class ElevatorStateStopping implements ElevatorState {
    @Override
    public int getDistance(int elevatorFloor, int destinationFloor, int numberOfFloors) {
        return Integer.MAX_VALUE;
    }
}
