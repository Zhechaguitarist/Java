class Test {
    String name;

    String s;
    public int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    void num (String s){
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
    }
}
class TestTestDrive{
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.sum(3,6));
        t.num("HuYnYa");
    }
}