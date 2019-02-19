package com.train;

public class TIcket {
    int ticket;
    int trip;
    int priec;

    public int TIcket(int tick, int trip){
        int money;
        this.ticket = tick;
        this.trip = trip;
        money = (ticket - trip)*1000 + trip*1800;
        return money;
    }
}
