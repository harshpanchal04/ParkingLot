package org.example.Models;

import java.sql.Time;

public class Ticket {
    private Long id;
    private Long number;
    private Time entrytime;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private Gate gate;
    private Status status;
}
