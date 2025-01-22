package com.tutor;

import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

class Rover {
    final HashMap<String, int[]> moveRover = new HashMap<String, int[]>() {
        {
            put("N", new int[] { 0, 1 });
            put("E", new int[] { 1, 0 });
            put("S", new int[] { 0, -1 });
            put("W", new int[] { -1, 0 });
        }
    };

    final HashMap<List<String>, String> rotateRover = new HashMap<List<String>, String>() {
        {
            put(Arrays.asList("N", "L"), "W");
            put(Arrays.asList("N", "R"), "E");
            put(Arrays.asList("E", "L"), "N");
            put(Arrays.asList("E", "R"), "S");
            put(Arrays.asList("S", "L"), "E");
            put(Arrays.asList("S", "R"), "W");
            put(Arrays.asList("W", "L"), "S");
            put(Arrays.asList("W", "R"), "N");
        }
    };

    public String computeFinalPosition(String plateauCoordinates, String initialPosition, String instructions) {

        int roversPositionX = Integer.parseInt(initialPosition.split(" ")[0]);
        int roversPositionY = Integer.parseInt(initialPosition.split(" ")[1]);
        String roversPositionDirection = initialPosition.split(" ")[2];

        for (char command : instructions.toCharArray()) {
            if (command == 'M') {
                roversPositionX += moveRover.get(roversPositionDirection)[0];
                roversPositionY += moveRover.get(roversPositionDirection)[1];
            } else {
                roversPositionDirection = rotateRover
                        .get(Arrays.asList(roversPositionDirection, Character.toString(command)));
            }
        }

        return roversPositionX + " " + roversPositionY + " " + roversPositionDirection;
    }
}

public class GradleTutor {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String plateauCoordinates = sc.nextLine();
        String initialPosition = sc.nextLine();
        String instructions = sc.nextLine();

        Rover rover = new Rover();
        System.out.println(rover.computeFinalPosition(plateauCoordinates, initialPosition, instructions));
    }
}
