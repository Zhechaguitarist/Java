public class MyExceptions {
    public void tryException() {
        int[] numbers = new int[5];
        for (int i = 0;i<numbers.length;i++) {
            numbers[i] = i;
        }
        for (int number : numbers) {
            if (number%2!=0){
                System.out.println("Нечётное число, на которое похуй");
            }
            else {
                System.out.println(number);
            }
        }
    }
}
class MyExceptionsTestDrive{
    public static void main(String[] args) {
        MyExceptions myExceptions = new MyExceptions();
        myExceptions.tryException();
    }
}
