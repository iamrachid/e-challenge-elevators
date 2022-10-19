package main.java.com.sqli.dispatcher;

import main.java.com.sqli.elevators.Elevator;

import java.util.Map;

public interface IDispatcher {
    String requestElevator(Map<String, Elevator> elevators, int numberOfFloors, int floor);

    void move(Map<String, Elevator> elevators, String id, String state);

    void stopAt(Map<String, Elevator> elevators, String id, int floor);

}
