package net.mirwaldt.day3;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class TwoVisitorsVisitsCounterMain {
    public static void main(String[] args) throws IOException {
        String content = Files.readString(Path.of("input.txt"), StandardCharsets.US_ASCII);
        VisitsCounter visitsCounter = new TwoVisitorsVisitsCounter();
        System.out.println(visitsCounter.countVisits(content)); // result : 2631
    }
}
