package New;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class MyList {
    List<String> al = new ArrayList<>();

    public void setList() {
        System.out.println("Тип элементов в списке: String");
        Scanner scanNumOfElements = new Scanner(System.in);
        System.out.println("Введите количество элементов");
        int numOfElements = scanNumOfElements.nextInt();
        for (int i = 0; i < numOfElements; i++) {
            Scanner scanElements = new Scanner(System.in);
            System.out.println("Введите " + (i + 1) + "-й элемент");
            al.add(i, scanElements.nextLine());
        }
        System.out.println("Всего элементов в списке: " + al.size());
    }

    public int findElement() { // возвращает индекс элемента, если он присутствует в массиве
        Scanner scanElement = new Scanner(System.in);
        System.out.println("Введите элемент, который хотите найти");
        String element = scanElement.nextLine();
        int n = -2;
        if (al.contains(element)) {
            n = al.indexOf(element);
            System.out.println("Найденный элемент: " + al.get(n));
        } else {
            System.out.println("Этого элемента нет в списке");
            n = -1;
        }
        return n;
    }
    public void showFindElement() {
        if (findElement()>=0) {
            if (al.contains(al.get(findElement()))) {
                System.out.println("Его номер в списке: " + findElement());
            }
        }
    }
    public void removeElement(){ // удаляет элемент по указанному индексу
        Scanner scanNumOfRemoveElements = new Scanner(System.in);
        System.out.println("Введите число элементов, которые хотите удалить");
        int numOfRemoveElemenst = scanNumOfRemoveElements.nextInt();
        for (int i=0;i<numOfRemoveElemenst;i++) {
            Scanner scanRemoveElement = new Scanner(System.in);
            System.out.println("Введите порядковый номер элемента, который хотите удалить");
            int num = scanRemoveElement.nextInt();
            int index = num - 1;
            if (index >= 0 && index < al.size()) {
                System.out.println("Удалённый элемент: " + al.get(index));
                al.remove(index);
            } else {
                System.out.println("Элемента под номером " + num + " не существует");
            }
        }
    }
    public void showElements(List<String> list){ // показывает все элементы массива
        if (list.size()>0) {
            System.out.println();
            System.out.println("Список элементов на данный момент:");
            for (String s : list) {
                System.out.println((list.indexOf(s) + 1) + "-й элемент: " + s);
            }
        }
        else {
            System.out.println("Нет элементов");
        }
    }
}
