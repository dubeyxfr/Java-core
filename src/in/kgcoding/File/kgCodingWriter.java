package in.kgcoding.File;

import java.io.FileWriter;
import java.io.IOException;

public class kgCodingWriter {
    public static void main(String[] args) {
        String fileName = "Java-course.txt";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("this is best java course." );
            for (int i=0;i<10000;i++){
                writer.write('x');
            }
            writer.flush();
            System.out.println("File written successful.");
        }catch (IOException exception) {
            System.out.printf("Exception occurred %s\n"
                    ,exception.getMessage());
        }
    }
}
