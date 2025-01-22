package com.tutor;

import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class GradleTutor {
    public static void main(String args[]) {

        HashMap<String, int[]> moveRover;
        moveRover = new HashMap<String, int[]>() {
            {
                put("N", new int[] { 0, 1 });
                put("E", new int[] { 1, 0 });
                put("S", new int[] { 0, -1 });
                put("W", new int[] { -1, 0 });
            }
        };

        HashMap<List<String>, String> rotateRover = new HashMap<List<String>, String>() {
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

        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter Upper-right coordinates of the plateau with space
        // separated integers: ");

        String[] plateauCoordinates = sc.nextLine().split(" ");
        // int upperRightX = sc.nextInt();
        // int upperRightY = sc.nextInt();

        // System.out.println("Upper right coordinates: " + upperRightX + " " +
        // upperRightY);
        // System.out.println("Upper right coordinates: " + plateauCoordinates[0] + " "
        // + plateauCoordinates[1]);

        // System.out.println(
        // "Enter rovers current position and direction with two integers and a letter
        // separated by spaces: ");

        int roversPositionX = sc.nextInt();
        int roversPositionY = sc.nextInt();
        String roversPositionDirection = sc.next();

        // System.out.println("Current position and direction: " + roversPositionX + " "
        // + roversPositionY + " "
        // + roversPositionDirection);

        // System.out.println("Enter Series of instructions telling the rover how to
        // explore the plateau: ");

        String instructions = sc.next();

        // System.out.println("Instructions: " + instructions);

        for (char command : instructions.toCharArray()) {
            // System.out.println("Current instruction: " + command);
            // System.out.println("Current position and direction: " + roversPositionX + " "
            // + roversPositionY + " "
            // + roversPositionDirection);
            if (command == 'M') {
                // System.out.println("Move rover for " +
                // moveRover.get(roversPositionDirection));
                roversPositionX += moveRover.get(roversPositionDirection)[0];
                roversPositionY += moveRover.get(roversPositionDirection)[1];
            } else {
                roversPositionDirection = rotateRover
                        .get(Arrays.asList(roversPositionDirection, Character.toString(command)));
            }
            // System.out.println("New position and direction: " + roversPositionX + " " +
            // roversPositionY + " "
            // + roversPositionDirection);
        }

        // System.out.println("Final position and direction: " + roversPositionX + " " +
        // roversPositionY + " "
        // + roversPositionDirection);

        System.out.println(roversPositionX + " " + roversPositionY + " " + roversPositionDirection);
    }
}
