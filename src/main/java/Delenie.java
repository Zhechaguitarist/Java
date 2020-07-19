import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Delenie {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = "C:" + separator + "Users" + separator + "evgen" + separator + "Desktop" + separator + "in.txt";
        try (BufferedReader bfr = new BufferedReader(new FileReader(path))) {
            List<String> stringList = new ArrayList<>();
            while (bfr.ready()) stringList.add(bfr.readLine());
            for (int i = 0; i < stringList.size(); i++) {
                String temp = stringList.get(i).substring(0, stringList.get(i).indexOf(" "));
                if (i < stringList.size() - 1) {
                    for (int j = stringList.indexOf(stringList.get(i) + 1); j < stringList.size(); j++) {
                        if ((j < stringList.size() - 1) && stringList.get(j).substring(0, stringList.get(j).indexOf(" ")).equals(temp)) {
                            double firstString = Double.parseDouble(stringList.get(i).substring(stringList.get(i).indexOf(" ") + 1, stringList.get(i).length()));
                            double secondString = Double.parseDouble(stringList.get(j).substring(stringList.get(j).indexOf(" ") + 1, stringList.get(j).length()));
                            double mySum = firstString + secondString;
                            String sum = Double.toString(mySum);
                            stringList.set(stringList.indexOf(stringList.get(i)), stringList.get(i).substring(0, stringList.get(i).indexOf(" ") + 1) + sum);
                            stringList.set(stringList.indexOf(stringList.get(j)), stringList.get(i).substring(0, stringList.get(i).indexOf(" ") + 1) + sum);
                        }
                    }
                }
            }
            stringList.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
