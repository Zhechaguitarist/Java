import java.io.IOException;
import java.io.RandomAccessFile;

public class OnlyMain {
    public static void main(String[] args) {
        String fileName = MyFiles.inPath;
        int number = 500;
        String text = "BEER";
        try (RandomAccessFile raf = new RandomAccessFile(fileName, "rw")) {
            long point = raf.length() > number ? number : raf.length();
            raf.seek(point);
            raf.writeBytes(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
