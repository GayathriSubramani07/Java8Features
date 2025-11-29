package com.demo;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

/*
 * DateTimeApiDemo.java
 * --------------------
 * This program demonstrates the Date and Time API introduced in Java 8.
 * Package: java.time
 *
 * Key improvements over pre-Java 8 date/time classes:
 *  - Immutable and thread-safe
 *  - Clear separation of Date, Time, and DateTime
 *  - Easier and more readable API
 *  - Better time-zone handling
 */

public class DateTimeApiDemo {

    public static void main(String[] args) {

        /*
         * --------------------------------------------------------------------
         * BEFORE JAVA 8 (Problems with old Date API)
         * --------------------------------------------------------------------
         * 1) The Date class existed in two packages: java.util and java.sql
         *    - java.util.Date → Machine-readable (system date)
         *    - java.sql.Date  → Database-specific (MySQL)
         *    => This caused confusion.
         *
         * 2) Date formatting required additional packages (e.g., java.text.SimpleDateFormat)
         *
         * 3) The old Date classes were NOT thread-safe.
         *
         * 4) java.util.Date included both date and time, even if you only needed the date.
         */

        /*
         * --------------------------------------------------------------------
         * JAVA 8 DATE AND TIME API (java.time package)
         * --------------------------------------------------------------------
         * Advantages:
         * 1) Immutable and thread-safe
         * 2) Clear distinction between date, time, and datetime
         * 3) Easier to use and more readable
         * 4) Supports multiple time zones
         */

        // LocalDate: Represents only date (no time)
        LocalDate currentDate = LocalDate.now();              // Current system date
        LocalDate birthDate = LocalDate.of(2003, 1, 14);      // Custom date
        System.out.println("Current Date: " + currentDate);
        System.out.println("Birth Date: " + birthDate);

        // LocalTime: Represents only time (no date)
        LocalTime currentTime = LocalTime.now();              // Current system time
        LocalTime specificTime = LocalTime.of(1, 46);         // Custom time
        System.out.println("Current Time: " + currentTime);
        System.out.println("Specific Time: " + specificTime);

        // ZoneId: Represents a time zone
        System.out.println("\nAvailable Zone IDs:");
        for (String zone : ZoneId.getAvailableZoneIds()) {
            System.out.println(zone);
        }

        // LocalTime with a specific time zone
        LocalTime saigonTime = LocalTime.now(ZoneId.of("Asia/Saigon"));
        System.out.println("\nCurrent Time in Asia/Saigon: " + saigonTime);

        // Instant: Represents a timestamp (machine-readable, UTC)
        Instant instant = Instant.now();
        System.out.println("\nMachine-readable Instant: " + instant);

        // LocalDateTime: Represents both date and time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + dateTime);

        /*
         * --------------------------------------------------------------------
         * Summary:
         * --------------------------------------------------------------------
         * - LocalDate → Only Date
         * - LocalTime → Only Time
         * - LocalDateTime → Date + Time
         * - Instant → Machine-readable timestamp (UTC)
         * - ZoneId → Represents time zones
         *
         * All classes are immutable and thread-safe.
         */
    }
}
