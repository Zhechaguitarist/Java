import java.util.Scanner;

public class TZ {
    double[] arrow = new double[7];
    void arrowMethod(){
        for (int j = 0;j < arrow.length;j++) {
            arrow[j] = Math.random()*10;
            arrow[j] = Math.round(arrow[j]);
        }
        double min = arrow[0];
        double max = arrow[0];
        for(int i = 0;i<arrow.length;i++){
            if(min>arrow[i]){
                min = arrow[i];
            }
            if(max<arrow[i]){
                max = arrow[i];
            }
        }
        int d = 1;
        for(int i = 0;i<arrow.length;i++) {
            System.out.println(d + "-е число = " + arrow[i]);
            d++;
        }
        double avg = 0;
        for(int i = 0;i<arrow.length;i++){
            avg += arrow[i];
        }
        avg /= arrow.length;
        System.out.println("Наименьшее число = " + min);
        System.out.println("Наибольшее число = " + max);
        System.out.println("Среднее арифметическое = " + avg);
    }
}
class TZTestDrive{
    public static void main(String[] args) {
        TZ t = new TZ();
        t.arrowMethod();
    }
}