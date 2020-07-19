import java.util.Scanner;

public class Task {
    String z = "Huy";
    String bz = z.toLowerCase();
    public static void main(String[] args) {
        Test t = new Test();
        Scanner scanNum = new Scanner(System.in);
        System.out.println("Введите слово");
        String slovo = scanNum.nextLine();
        t.num(slovo);
    }
}
