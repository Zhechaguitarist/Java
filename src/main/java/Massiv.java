import java.util.Scanner;

public class Massiv {
    public static void main(String[] args) {
        int[] massiv1 = new int[5];
        System.out.println("Длина массива равна " + massiv1.length);
        for(int i = 0; i<massiv1.length; i++){
            Scanner mas1 = new Scanner(System.in);
            System.out.println("Введите " + i + " элемент массива");
            int zhnachenie1 = mas1.nextInt();
            massiv1[i] = zhnachenie1;
        }
        for(int i = 0; i<massiv1.length; i++){
            System.out.println(i + " элемент равен " + massiv1[i]);
        }
        System.out.println();
        System.out.println();
        String[] massiv2 = new String[5];
        System.out.println("Длина массива равна " + massiv2.length);
        for(int i = 0; i<massiv2.length; i++) {
            Scanner mas2 = new Scanner(System.in);
            System.out.println("Введите " + i + " элемент массива");
            String zhnachenie2 = mas2.nextLine();
            massiv2[i] = zhnachenie2;
        }
        for(int i = 0; i<massiv2.length; i++){
            System.out.println(i + "  элемент равен " + massiv2[i]);
        }
        String s = null;
        System.out.println(s);
}
}

