import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Types {
    public static void main(String[] args) {
        List <Integer> list1 = new ArrayList<>();
        Scanner scanNumOfNumbers = new Scanner(System.in);
        System.out.println("Введите количество элементов");
        int numOfNumbers = scanNumOfNumbers.nextInt();
        RandomNumber randomNumber = new RandomNumber();
        for (int i=0;i<numOfNumbers;i++){
            Integer number = randomNumber.getRandomNumber();
            list1.add(number);
        }
        for (Integer integer:list1) {
            System.out.println(integer);
        }
        int kup = list1.get(2);
        double sum=0;
        for (Integer i:list1){
            sum+=i;
        }
        double avg = sum/numOfNumbers;
        System.out.println("Среднее значение равняется: "+avg);
        if (avg>49.9999999){
            System.out.println("ДА");
        } else System.out.println("НЕТ");
    }
}
class RandomNumber {
    public int getRandomNumber(){
        return (int) Math.round(Math.random()*100);
    }
}
class Number{
    String name;
}