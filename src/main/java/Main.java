import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = "C:" + separator + "Users" + separator + "evgen" + separator + "Desktop" + separator + "in.txt";
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while (br.ready()) sb.append(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        String string = sb.toString();
        int index = string.indexOf("<");
        string = string.substring(index);
        List<String> stringList = new ArrayList<>();
        String tag = "span";
        Pattern inside = Pattern.compile("<" + tag + "(\\w|\\s)*>.+?</" + tag + ">");
        Pattern p = Pattern.compile("<" + tag + ".*>(" + inside.pattern() + ")?</" + tag + ">");
        Matcher m = p.matcher(string);
        while (m.find()) {
            String temp = m.group();
            stringList.add(temp);
            string = string.replace(temp, "");
        }
        int size = stringList.size();
        for (int i = 0; i < size; i++) {
            m = inside.matcher(stringList.get(i));
            while (m.find()) stringList.add(m.group());
        }
        m = inside.matcher(string);
        while (m.find()) stringList.add(m.group());
        for (String string1 : stringList) {
            System.out.println(string1);
        }
    }
}