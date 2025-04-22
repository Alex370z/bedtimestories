import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the story you would like to read!(EX:___.txt): ");
        String fileName = input.nextLine();


        try {
            FileInputStream file = new FileInputStream(fileName); // reads the file
            Scanner fileScanner = new Scanner(file);        // create a scanner object to read data from files

            int i = 1;
            while (fileScanner.hasNextLine()) {
                System.out.println(i + ". " + fileScanner.nextLine());
                i++;
            }
        } catch (FileNotFoundException e) {       // if file not found prints error
            System.out.println("ERROR FILE NOT LOCATED.");
        }
    }
}