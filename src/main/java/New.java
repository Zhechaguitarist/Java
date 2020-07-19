import java.util.Scanner;

/**class NewTestDrive{
    public static void main(String[] args) {
        New stringArray1 =  new New();
        stringArray1.kSetter();
        stringArray1.kGetter();
        //далее код обрывается
        stringArray1.nameSetter();
        stringArray1.nameGetter();
    }
}
public class New {

    private int i = 0;
    private int j = 1;
    private int k;
    private String[] names = new String[k];
    public int getK(){
        return k;
    }
    public void kGetter(){
        System.out.println("Количество элеметнов в массиве равняется "+getK());
    }
    public void kSetter(){
        Scanner numOfK = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        setK(numOfK.nextInt());
    }
    public void setK(int k){
        this.k = k;
    }
    public String getNames(){
        return k;
    }
    public void setNames(String name){
        this.names[i] = name;
    }
    public void nameSetter(){
        for(int t = 0; t<k; i++ ){
            Scanner scanNameOfMan = new Scanner(System.in);
            System.out.println("Введите имя " + j + "-го элемента");
            names[t] = scanNameOfMan.nextLine();
            System.out.println(getNames());
            j++;
        }
        i = 0;
        j = 1;
    }
    public void nameGetter(){
        for(String nameOfIElement: names) {
            System.out.println("Имя " + j + "-го элемента "+names[i]+" ");
            i++;
            j++;
        }
    }
}*/