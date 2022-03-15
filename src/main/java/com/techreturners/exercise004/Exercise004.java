package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {
    private final LocalDateTime result;
    public Exercise004(LocalDate date) {
        LocalDateTime dateTime = date.atStartOfDay();
        result = dateTime.plusSeconds(1000000000);
    }

    public Exercise004(LocalDateTime dateTime) {
        result = dateTime.plusSeconds(1000000000);
    }

    public LocalDateTime getDateTime() {
        return result;

    }
}
