package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.print("Please enter number of tickets: ");
        Scanner scanner = new Scanner(System.in);
        int tick = scanner.nextInt();
        System.out.print("How many round-trip tickets: ");
        int trip = scanner.nextInt();
        TIcket tk = new TIcket();
        System.out.println("You should pay "+tk.TIcket(tick,trip));
    }
}
