package com.epam.hometasks.ht6.utils;


import java.util.Calendar;

public class Validator {
    Calendar now = Calendar.getInstance();
    int currentYear = now.get(Calendar.YEAR);

    public boolean negativeNumber(Integer num) {
        if (num < 0) {
            return false;
        }
        return true;
    }

    public boolean futureYear(Integer year) {
        if (year > currentYear) {
            return false;
        }
        return true;
    }
}
