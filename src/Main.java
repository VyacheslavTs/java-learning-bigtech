//Как код написал Я:
/*
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, BigTech!");
        System.out.println("Today is: "+LocalDate.now());
        System.out.println("My goal: Become a BigTech Java Developer!");
    }
}

 */

//Как по фэншую пишут в бигтехах:

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * A simple introduction program that prints a greeting,
 * today's date, and a personal career goal.
 *
 * Author: Vyacheslav
 * Date: 2025-08-09
 */
public class Main {

    public static void main(String[] args) {
        printGreeting();
        printTodayDate();
        printGoal();
    }

    /**
     * Prints the greeting message.
     */
    private static void printGreeting() {
        System.out.println("Hello, BigTech!");
    }

    /**
     * Prints today's date in a human-readable format.
     */
    private static void printTodayDate() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        System.out.println("Today is: " + today.format(formatter));
    }

    /**
     * Prints the career goal.
     */
    private static void printGoal() {
        System.out.println("My goal: Become a BigTech Java Developer!");
    }
}
