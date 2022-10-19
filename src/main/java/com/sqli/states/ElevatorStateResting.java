package main.java.com.sqli.states;

public class ElevatorStateResting implements ElevatorState{

    @Override
    public int getDistance(int elevatorFloor, int destinationFloor,int numberOfFloors) {
        return Math.abs(destinationFloor - elevatorFloor);
    }
}
