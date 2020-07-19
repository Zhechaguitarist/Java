import java.util.Scanner;

public class Radians {
    public void degRad(){
        Scanner scanDeg = new Scanner(System.in);
        System.out.println("Введите значиние в градусах");
        double deg = scanDeg.nextDouble();
        double rad = Math.toRadians(deg);
        System.out.println("Значение в градусах: " + deg + "deg");
        System.out.println();
        System.out.println("Значение в радианах: " + rad + "rad");
        rad *= 1000;
        rad = Math.rint(rad) / 1000;
        System.out.println("Округлённое значение в радианах: " + rad + "rad");
    }
}
class RadiansTestDrive{
    public static void main(String[] args) {
        Radians r = new Radians();
        r.degRad();
    }
}
