package org.example.Models;

import java.sql.Time;
import java.util.List;

public class Bill {
    private Long id;
    private Long number;
    private Time exittime;
    private int amount;
    private List<Payment> ListOfPayments;
    private Status status;
}
