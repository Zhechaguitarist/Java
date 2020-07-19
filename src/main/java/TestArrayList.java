import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestArrayList {
    private int n; //количество людей

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    //n, setters & getters

    List <Human> arrayOne = new ArrayList<>(n);
}
class TestArrayListTestDrive{
    public static void main(String[] args) {
        TestArrayList t = new TestArrayList();
        Scanner scanN = new Scanner(System.in);
        System.out.println("Введите количество людей");
        t.setN(scanN.nextInt());
        int j = 1;
        for(int i = 0;i<t.getN();i++) {
            Human human = new Human();
            t.arrayOne.add(i,human);
            Scanner scanNameOfHumanOne = new Scanner(System.in);
            System.out.println("Введите имя "+j+"-го человека");
            human.setName(scanNameOfHumanOne.nextLine());
            j++;
        }
        j--;
        System.out.println();
        int l = 1;
        for (int k = 0; k<j ;k++, l++) {
            //int l = k + 1;
            System.out.print(l+"-го человека зовут "+t.arrayOne.get(k).getName()+", ");
            //Вместо int l = k + 1 должно быть i=1; sout; i++;, но так не работает
        }
        System.out.print("общее количество людей равняется "+t.arrayOne.size());
    }
}
