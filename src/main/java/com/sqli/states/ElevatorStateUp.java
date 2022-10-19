package main.java.com.sqli.states;

public class ElevatorStateUp implements ElevatorState{

    @Override
    public int getDistance(int elevatorFloor, int destinationFloor, int numberOfFloors) {
        if (elevatorFloor < destinationFloor)
            return destinationFloor - elevatorFloor;
        else
            return 2 * numberOfFloors - elevatorFloor + destinationFloor;
    }
}
