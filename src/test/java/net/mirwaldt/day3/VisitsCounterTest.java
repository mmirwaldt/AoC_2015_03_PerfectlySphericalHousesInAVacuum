package net.mirwaldt.day3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VisitsCounterTest {
    private final static VisitsCounter visitsCounter = new DefaultVisitsCounter();

    private static Stream<Arguments> visitsCounter() {
        return Stream.of(Arguments.of(visitsCounter));
    }

    @ParameterizedTest
    @MethodSource("visitsCounter")
    void test(VisitsCounter visitsCounter) {
        assertEquals(1, visitsCounter.countVisits(""));
        assertEquals(2, visitsCounter.countVisits(">"));
        assertEquals(2, visitsCounter.countVisits("^"));
        assertEquals(2, visitsCounter.countVisits("<"));
        assertEquals(2, visitsCounter.countVisits("v"));
        assertEquals(2, visitsCounter.countVisits("<>"));
        assertEquals(2, visitsCounter.countVisits("^v"));
        assertEquals(2, visitsCounter.countVisits("<><>"));
        assertEquals(2, visitsCounter.countVisits("^v^v"));
        assertEquals(3, visitsCounter.countVisits("^v<>"));
        assertEquals(3, visitsCounter.countVisits("<>^v"));
        assertEquals(4, visitsCounter.countVisits("<^>v"));
        assertEquals(5, visitsCounter.countVisits("<^>v>"));
        assertEquals(6, visitsCounter.countVisits("<^>v>v"));
    }
}
