package MyRealisations;

public class MyIntArrayList {
    private static final int DEAFULT_SIZE = 10;
    private int size;
    private int[] myList;

    public MyIntArrayList() {
        myList = new int[DEAFULT_SIZE];
    }

    public MyIntArrayList(int size) {
        this.size = size;
        myList = new int[size];
    }

    public void add(int element) {
        int[] newMyList = new int[size + 1];
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                newMyList[i] = myList[i];
            }
            myList = newMyList;
        } else {
            myList = new int[size + 1];
            myList[myList.length - 1] = element;
        }
        size++;
    }

    public int get(int index) {
        return myList[index];
    }

    public int size() {
        return size;
    }

    public String toString() {
        String result;
        String sumOfElements = "";
        String start = "{";
        String finish = "}";
        String separate = ", ";
        for (int i = 0; i < size(); i++) {
            if (i == size - 1) {
                sumOfElements = sumOfElements + Integer.toString(myList[i]);
            } else {
                sumOfElements = sumOfElements + Integer.toString(myList[i]) + separate;
            }
        }
        result = start + sumOfElements + finish;
        return result;
    }
}

class myIntArrayListTestDrive {
    public static void main(String[] args) {
        MyIntArrayList myIntArrayList = new MyIntArrayList();
        myIntArrayList.add(3);
        System.out.println(myIntArrayList.size());
        System.out.println(myIntArrayList.get(0));
        myIntArrayList.add(35);
        System.out.println(myIntArrayList.size());
        System.out.println(myIntArrayList.get(1));
        System.out.println(myIntArrayList);
    }
}