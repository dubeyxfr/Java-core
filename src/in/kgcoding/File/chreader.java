package in.kgcoding.File;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class chreader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter filename to read: ");
        String filename = input.nextLine();

        try (FileReader reader = new FileReader(filename)) {
            int ch;
            while ((ch = reader.read()) != -1) {  // -1 means EOF
                System.out.print((char) ch);//
            }
        } catch (FileNotFoundException e) {
            System.out.printf("%s not found!",filename);//
        } catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        }
    }
}
