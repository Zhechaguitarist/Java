import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class SrednyDopusk {
    private int zvenya;

    public int getZvenya() {
        return zvenya;
    }

    public void setZvenya(int zvenya) {
        this.zvenya = zvenya;
    }

    public void scanZvenya() {
        Scanner scanZvenya = new Scanner(System.in);
        System.out.println("Введите количество звеньев");
        setZvenya(scanZvenya.nextInt());
    }

    private double dopusk;

    public double getDopusk() {
        return dopusk;
    }

    public void setDopusk(double dopusk) {
        this.dopusk = dopusk;
    }

    public void scanDopusk(){
        Scanner scanDopusk = new Scanner(System.in);
        System.out.println("Введите допуск на замыкающее звено");
        setDopusk(scanDopusk.nextDouble());
    }

    public void srednyDopusk(){
        scanZvenya();
        scanDopusk();
        double srednyDopusk = getDopusk()/(getZvenya()-1);
        System.out.println("Средний допуск равняется "+srednyDopusk);
    }

}
class SrednyDopuskTestDrive{
    public static void main(String[] args) {
        SrednyDopusk s = new SrednyDopusk();
        s.srednyDopusk();
    }
}
