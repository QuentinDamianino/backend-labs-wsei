package com.company;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        displayLocalTime();
    }

    public static void displayLocalTime()
    {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");

        LocalDateTime now = LocalDateTime.now();

        System.out.println(dateTimeFormatter.format(now));
    }

    public static void displayGlobalTime()
    {

    }
}
