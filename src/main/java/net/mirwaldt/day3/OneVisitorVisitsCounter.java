package net.mirwaldt.day3;

import java.util.HashSet;
import java.util.Set;

public class OneVisitorVisitsCounter implements VisitsCounter {
    @Override
    public int countVisits(String directions) {
        final Set<Point> visited = new HashSet<>();
        Point currentPosition = new Point(0,0);
        visited.add(currentPosition);
        for (int i = 0; i < directions.length(); i++) {
            currentPosition = currentPosition.move(directions.charAt(i));
            visited.add(currentPosition);
        }
        return visited.size();
    }
}
