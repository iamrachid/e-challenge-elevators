package main.java.com.sqli.dispatcher;

import main.java.com.sqli.elevators.Elevator;
import main.java.com.sqli.states.ElevatorStateDown;
import main.java.com.sqli.states.ElevatorStateStopping;
import main.java.com.sqli.states.ElevatorStateUp;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

public class Dispatcher implements IDispatcher{

    private static Dispatcher instance;

    private Dispatcher() {
    }

    public static Dispatcher getInstance() {
        if (instance == null)
            instance = new Dispatcher();
        return instance;
    }

    @Override
    public String requestElevator(Map<String, Elevator> elevators, int numberOfFloors, int floor) {
        return Collections.min(elevators.entrySet(), Comparator.comparingInt(e -> e.getValue().getDistance(floor))).getKey();
    }

    @Override
    public void move(Map<String, Elevator> elevators, String id, String state) {
        Elevator elevator = elevators.get(id);
        if (state.equals("DOWN"))
            elevator.setElevatorState(new ElevatorStateDown());
        else
            elevator.setElevatorState(new ElevatorStateUp());
        elevators.put(id, elevator);
    }

    @Override
    public void stopAt(Map<String, Elevator> elevators, String id, int floor) {
        Elevator elevator = elevators.get(id);
        elevator.setElevatorState(new ElevatorStateStopping());
        elevator.setFloor(floor);
        elevators.put(id, elevator);
    }
}
