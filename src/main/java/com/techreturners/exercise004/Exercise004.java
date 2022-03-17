package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {
    private final LocalDateTime result;
    private static final long GIGASECOND = 1000000000;

    public Exercise004(LocalDate date) {
        LocalDateTime dateTime = date.atStartOfDay();
        result = dateTime.plusSeconds(GIGASECOND);
    }

    public Exercise004(LocalDateTime dateTime) {
        result = dateTime.plusSeconds(GIGASECOND);
    }

    public LocalDateTime getDateTime() {
        return result;

    }
}
