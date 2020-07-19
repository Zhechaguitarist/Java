import java.util.Scanner;

public class NewStart {
    public static void main(String[] args) {
        Scanner scanX = new Scanner(System.in);
        System.out.println("Введи целое число");
        int x = scanX.nextInt();
        for(int i = 0;i < x;i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i);
            if(i == 11) {
                System.out.println(i);
                break;
            }
        }
        System.out.println("Конец");
    }
}