package ru.netology.web;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Generation {
    public String dateGeneration (int day) {
        LocalDate localDate = LocalDate.now();
        LocalDate newDate = localDate.plusDays(day);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String date = newDate.format(dateFormat);
        return date;
    }

}
