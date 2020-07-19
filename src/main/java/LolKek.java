import java.util.ArrayList;
import java.util.Scanner;

public class LolKek {
    ArrayList<String> array = new ArrayList<>();
    void showArrow(){
        Scanner scanM = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        String m = scanM.nextLine();
        for (int i = 0;i<array.size();i++)
            array.add(m);
        System.out.println(array.size());
    }
}
class LolKekTestDrive{
    public static void main(String[] args) {
        String temp = "Петров 2";
        String key = temp.substring(0, temp.indexOf(" "));
        System.out.println(key);
    }
}