package gr.aueb.cf.ch19.mono_parking;

import java.time.LocalDateTime;
import java.util.*;

public class MonoParking {

    private final Deque<String> parking = new LinkedList<>();

    public List<String> getParking() {
        return List.copyOf(parking);
    }

    // Delegation
    public void addLast(String carId) {
        parking.push(carId);
    }

    public String removeLast() {
        return parking.pop();
    }

    public boolean isEmpty() {
        return parking.isEmpty();
    }

    public void traverse() {
        parking.forEach(System.out::println);
    }
}
