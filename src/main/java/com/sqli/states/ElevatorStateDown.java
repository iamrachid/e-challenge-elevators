package main.java.com.sqli.states;

public class ElevatorStateDown implements ElevatorState{

    @Override
    public int getDistance(int elevatorFloor, int destinationFloor, int numberOfFloors) {
        if (elevatorFloor > destinationFloor)
            return elevatorFloor - destinationFloor;
        else
            return elevatorFloor + destinationFloor;
    }
}
