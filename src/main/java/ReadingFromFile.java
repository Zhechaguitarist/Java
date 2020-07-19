import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "C:" + separator + "Users" + separator + "evgen" + separator + "Desktop" + separator + "ReadingFromFileJava.txt";
        //String path = "C:\Users\evgen\Desktop\TextFileForJava.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
