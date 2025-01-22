package com.tutor;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.Assert;

public class GradleTutorTest {

    @Test
    public void testComputeFinalPosition() {
        Rover rover = new Rover();

        List<List<String>> testCases = Arrays.asList(
                Arrays.asList("5 5", "1 2 N", "LMLMLMLMM", "1 3 N"),
                Arrays.asList("5 5", "3 3 E", "MMRMMRMRRM", "5 1 E"),
                Arrays.asList("7 7", "2 3 S", "MMMLM", "3 0 E"));

        for (List<String> testCase : testCases) {
            String plateauCoordinates = testCase.get(0);
            String initialPosition = testCase.get(1);
            String instructions = testCase.get(2);
            String expected = testCase.get(3);

            String result = rover.computeFinalPosition(plateauCoordinates, initialPosition, instructions);
            Assert.assertEquals("Test failed for input: " + testCase, expected, result);
        }
    }
}
