package main.java.com.sqli.elevators;

import java.util.HashMap;
import java.util.Map;

public class ElevatorFactory implements IElevatorFactory{

    private static ElevatorFactory instance;
    private ElevatorFactory() {
    }

    public static ElevatorFactory getInstance() {
        if (instance == null)
            instance = new ElevatorFactory();

        return instance;
    }

    public Map<String, Elevator> createElevators(int numberOfFloors, String[] elevators) {
        Map<String, Elevator> elevatorMap = new HashMap<>();
        for(String elevatorString: elevators){
            String[] elevatorArgs = elevatorString.split(":");
            Elevator elevator = new
                    Elevator(elevatorArgs[0], Integer.parseInt(elevatorArgs[1]), numberOfFloors);
            elevatorMap.put(elevator.getId(), elevator);
        }
        return elevatorMap;
    }
}
