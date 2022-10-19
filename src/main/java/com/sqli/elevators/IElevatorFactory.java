package main.java.com.sqli.elevators;

import java.util.Map;

public interface IElevatorFactory {
    Map<String, Elevator> createElevators(int numberOfFloors, String... elevators);
}
