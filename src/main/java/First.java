import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Objects;

class First {
    public int id;
    public String name;

    public First(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        First first = (First) o;
        return id == first.id &&
                Objects.equals(name, first.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    private static void b(int i) {
        String s = Integer.toBinaryString(i);
        int sLength = s.length();
        String prefix = String.format("%s : длина = %d", s, sLength);
        if (sLength < 5) prefix = "%4s";
        else if (sLength < 9) prefix = "%8s";
        else if (sLength < 13) prefix = "%12s";
        else if (sLength < 17) prefix = "%16s";
        if (sLength > 16) s = String.format(prefix, s);
        else s = String.format(prefix, s).replace(" ", "0");
        System.out.println(s);
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(new byte[4]));

        byte[] bytes = new byte[4];
        System.out.println(Arrays.toString(bytes));

        try {
            System.out.println("Блок try");
            InputStream inputStream = new FileInputStream("C://Users/evgen/Desktop/in.txt");
            while (inputStream.available() > 0) System.out.print((char) inputStream.read());
        } catch (IOException e) {
            System.out.println();
            System.out.println("Блок catch");
        } finally {
            System.out.println();
            System.out.println("Блок finally");
        }

        /*List<Person> people = new ArrayList<>();
        people.add(new Person(1, "Tim"));
        people.add(new Person(3, "Jessica"));
        people.add(new Person(2, "Rick"));

        Collections.sort(people);

        System.out.println(people);

        Map<String, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        StringBuilder sb = new StringBuilder("A");

        for (int i = 0; i < 10; i++) {
            map1.put(Integer.toString(i), sb.toString());
            map2.put(i, sb.toString());
            sb.append("b");
        }
        String s;
        Date date1 = new Date();
        for (Map.Entry<String, String> entry : map1.entrySet()) s = entry.getKey() + entry.getValue();
        System.out.println(new Date().getTime() - date1.getTime());
        Date date2 = new Date();
        for (Map.Entry<Integer, String> entry : map2.entrySet()) s = entry.getKey() + entry.getValue();
        System.out.println(new Date().getTime() - date2.getTime());

        List<String> list = new ArrayList<>(map1.keySet());
        List<String> list1 = new ArrayList<>(map2.values());

        System.out.println(list);
        System.out.println(list1);

        System.out.println("   a   ".trim());*/
        /*First first1 = new First(1, "Timka");
        First first2 = new First(1, "Timka");

        System.out.println(first1.equals(first2));
        System.out.println(first1.hashCode());
        System.out.println(first2.hashCode());

        int result = 1 | 8;

        System.out.println(result);
        System.out.println(Integer.toBinaryString(~137)); // 137 - 10001001 5 - 101
        System.out.println(Integer.toBinaryString(357>>3)); // 357 - 101100101

        int myByte = (1<<5);
        int getMyByte = (myByte & (1<<5));
        String getMyByteString = Integer.toBinaryString(getMyByte).replace("0", "");
        System.out.println(getMyByteString);*/



       /* int number = 45; // 1001 Значение, которое надо зашифровать - в двоичной форме   101101
        int key = 102; //Ключ шифрования - в двоичной системе                           1100110
        int encrypt = number ^ key; //Результатом будет число                           1001011 или 75
        System.out.println("Зашифрованное число: " +encrypt);
                                                                                 //     1001011
        int decrypt = encrypt ^ key; // Результатом будет исходное число 45             1100110
        System.out.println("Расшифрованное число: " + decrypt);                   //    0101101*/



        /*int i = 32; // 00100000
        int j = 47; // 00101111
        b(32);
        b(47);
        b(i & j); // 00100000
        b(i | j); // 00101111
        b(i ^ j); // 00001111
        b(~i); // 11011111
        b(~j); // 11010000*/
    }

    static class Person implements Comparable {

        int id;
        String name;

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Object o) {
            Person person = (Person) o;
            return Integer.compare(this.id, person.id);
        }
    }
}