package net.mirwaldt.aoc.year2015.day3;

import java.util.HashSet;
import java.util.Set;

public class TwoVisitorsVisitsCounter implements VisitsCounter {
    @Override
    public int countVisits(String directions) {
        final Set<Point> visited = new HashSet<>();
        Point currentPositionOfSanta = new Point(0,0);
        Point currentPositionOfRoboSanta = new Point(0,0);
        visited.add(currentPositionOfSanta);
        for (int i = 0; i < directions.length(); i++) {
            if(isSantasTurn(i)) {
                currentPositionOfSanta = currentPositionOfSanta.move(directions.charAt(i));
                visited.add(currentPositionOfSanta);
            } else {
                currentPositionOfRoboSanta = currentPositionOfRoboSanta.move(directions.charAt(i));
                visited.add(currentPositionOfRoboSanta);
            }
        }
        return visited.size();
    }

    private boolean isSantasTurn(int i) {
        return i % 2 == 0;
    }
}
