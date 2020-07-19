import java.util.Scanner;

public class Switch {
    public Switch(int age){
        this.age=age;
    }
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    void scanAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        setAge(scanner.nextInt());
        }
    public void addObject(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        int scan1 = scanner.nextInt();
        Switch s1 = new Switch(scan1);
    }
}
class SwitchTestDrive{
    public static void main(String[] args) {
        System.out.printf("%.0f",39.49490);
    }
}