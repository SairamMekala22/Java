import java.io.File;
import java.io.FileOutputStream;
import java.util.*;

public class Execption {
    
    int a = 45;
    public static void main(String[] args) throws Exception {
        File f = new File("Pikachu.txt");
        FileOutputStream piakchu = new FileOutputStream("Pikachu");
        piakchu.write(45);
    }
} 