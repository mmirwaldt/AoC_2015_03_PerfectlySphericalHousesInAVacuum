package net.mirwaldt.aoc.year2015.day3;

import java.util.Objects;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point move(char direction) {
        switch (direction) {
            case '^':
                return new Point(x, y + 1);
            case 'v':
                return new Point(x, y - 1);
            case '<':
                return new Point(x - 1, y);
            case '>':
                return new Point(x + 1, y);
            default:
                throw new IllegalArgumentException("Cannot handle direction '" + direction + "'!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point that = (Point) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "ImmutablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
