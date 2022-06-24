package lab1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Task6 {
    public static void main(String[] args) {
        String fileContent = readFile("text.txt");
        String[] lines = fileContent.split(System.lineSeparator());

        for(int i=0; i< lines.length; i++) {
            System.out.println((i+1) + " " + lines[i]);
        }
    }

    private static String readFile(String fileName) {
        String text = "";

        try (FileInputStream input = new FileInputStream(new File(fileName))) {
            int data;

            while ((data = input.read()) != -1) {
                text += ((char)data);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return text;
    }
}
