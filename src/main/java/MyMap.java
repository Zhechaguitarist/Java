import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyMap {

    public void newMap(int numOfElements){
        Map<Integer, String> myMap = new HashMap<>();
        for (int i = 0; i<numOfElements; i++){
            int numberOfKey = i + 1;
            String numberOfValue = "Value " + numberOfKey;
            myMap.put(numberOfKey, numberOfValue);
        }
        /*Scanner scanKey = new Scanner(System.in);
        Map.Entry<Integer, String> myKeyMap;
        myMap.entrySet();
        System.out.println(myKeyMap);*/
        /*for (Map.Entry<Integer, String> forMyMap : myMap.entrySet()){
            System.out.println(forMyMap.getKey() + " : " + forMyMap.getValue());
        }*/
    }
}
class MyMapTestDrive{
    public static void main(String[] args) {
        MyMap myMap = new MyMap();
        myMap.newMap(150);
    }
}