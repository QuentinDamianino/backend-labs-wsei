package lab1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Task2 {

    public static void main(String[] args) throws IOException {
        displayFile("text.txt");
    }


    public static void displayFile(String fileName) throws IOException {
        try (FileInputStream input = new FileInputStream(new File(fileName))) {
            int data;

            while ((data = input.read()) != -1) {
                System.out.print((char)data);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
