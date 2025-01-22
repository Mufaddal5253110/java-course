package com.tutor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.Assert;

public class GradleTutorTest {

    @Test
    public void testComputeFinalPosition() throws IOException {
        Path path = Path.of(getClass().getClassLoader().getResource("com/tutor/testcases.txt").getPath());

        List<String> lines = Files.readAllLines(path);
        Rover rover = new Rover();
        String plateauCoordinates = lines.get(0);
        List<String> expectedResults = Arrays.asList("1 3 N", "5 1 E");
        int k = 0;
        for (int i = 1; i < lines.size(); i += 2) {
            String initialPosition = lines.get(i);
            String instructions = lines.get(i + 1);
            String expected = expectedResults.get(k++);

            String result = rover.computeFinalPosition(plateauCoordinates, initialPosition, instructions);
            Assert.assertEquals("Test failed for input: " + lines.get(i) + "Expected Output " + lines.get(i + 1),
                    expected, result);

        }
    }
}
