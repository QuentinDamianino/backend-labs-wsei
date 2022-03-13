package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        System.out.println("Podaj tekst: ");

        Scanner scanner = new Scanner(System.in);
        String content = scanner.nextLine();

        saveFile(content);
    }

    public static void saveFile(String content)
    {
        try {
            File file = new File("testSave.txt");
            FileOutputStream output = new FileOutputStream(file);

            byte[] b = content.getBytes(StandardCharsets.UTF_8);

            output.write(b);
            output.close();

            System.out.println("Success");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
