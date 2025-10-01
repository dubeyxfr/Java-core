package in.kgcoding.File;

import java.io.FileReader;
import java.io.IOException;

public class KgCodingReader {
    public static void main(String[] args) {
        String filename = "Java-course.txt";
        try (FileReader Reader = new FileReader(filename)) {
            int read = 0;
            do {
                read = Reader.read();
                System.out.print((char)read);
            }while (read!=-1);
        }catch (IOException e){
            System.out.printf("Exception Occurred. %s\n"
                    ,e.getMessage());
        }
    }
}
