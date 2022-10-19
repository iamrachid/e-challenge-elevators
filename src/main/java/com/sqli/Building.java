package main.java.com.sqli;

import main.java.com.sqli.dispatcher.Dispatcher;
import main.java.com.sqli.dispatcher.IDispatcher;
import main.java.com.sqli.elevators.Elevator;
import main.java.com.sqli.elevators.ElevatorFactory;
import main.java.com.sqli.elevators.IElevatorFactory;

import java.util.Map;

public class Building {
    private int numberOfFloors;
    private Map<String, Elevator> elevators;
    private IElevatorFactory elevatorFactory = ElevatorFactory.getInstance();
    private IDispatcher dispatcher;

    public Building(int numberOfFloors, String... elevators){
        this.numberOfFloors = numberOfFloors;
        this.elevators = elevatorFactory.createElevators(numberOfFloors, elevators);
        dispatcher = Dispatcher.getInstance();
    }

    public String requestElevator(int floor){
        return dispatcher.requestElevator(elevators, numberOfFloors, floor);
    }
    public String requestElevator(){
        return dispatcher.requestElevator(elevators, numberOfFloors, numberOfFloors);
    }
    public void move(String id, String state){
        dispatcher.move(elevators, id, state);
    }

    public void stopAt(String id, int floor){
        dispatcher.stopAt(elevators, id, floor);
    }
}
