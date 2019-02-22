package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tick = 0;
        while(true) {
            System.out.print("Please enter number of tickets: ");
            tick = scanner.nextInt();
            if(tick == -1)
                break;
            System.out.print("How many round-trip tickets: ");
            int trip = scanner.nextInt();
            Ticket tk = new Ticket();
            System.out.println("You should pay " + tk.TIcket(tick, trip));
        }
    }
}
