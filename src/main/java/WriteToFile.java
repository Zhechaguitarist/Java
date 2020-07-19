import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "C:" + separator + "Users" + separator + "evgen" + separator + "Desktop" + separator + "WriteToFileJava.txt";
        File fileToWrite = new File(path);

        PrintWriter printWriter = new PrintWriter(fileToWrite);

        printWriter.println("Top");
        printWriter.println("Middle");
        printWriter.println("Bottom");

        printWriter.close();

        File fileToRead = new File(path);

        Scanner scanner = new Scanner(fileToRead);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
