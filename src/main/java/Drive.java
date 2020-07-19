import java.util.Scanner;

public class Drive {
    void drive() {
        Test t = new Test();
        System.out.println(t);
        System.out.println(t.name);
        t.name = "Huy";
        System.out.println(t.name);
        Scanner scana = new Scanner(System.in);
        System.out.println("Введите a");
        int scanneda = scana.nextInt();
        Scanner scanb = new Scanner(System.in);
        System.out.println("Введите b");
        int scannedb = scanb.nextInt();
        System.out.println("a+a+b=" + t.sum(t.sum(scanneda, scanneda), scannedb));
        Scanner prints = new Scanner(System.in);
        System.out.println("Введите строку");
        String printscan = prints.nextLine();
        t.num(printscan);
    }
}
