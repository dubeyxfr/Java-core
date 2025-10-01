package in.kgcoding.File;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ch_write {
    public static void main(String[] args) {
        String filename = "Java Course File";
        try (FileWriter write = new FileWriter(filename)){
            write.write("File is null");
            System.out.println("File is Created Successful");
        }catch (IOException e){
            System.out.printf("Exception occurred %s\n",e.getMessage());
        }
    }
}
