import java.util.Arrays;

public class RecursiveFactorialCalculation {

    private static long calculate(long number) {
        long result = number;
        if (number > 2) result *= calculate(--number);
        return result;
    }

    private static long anotherCalculate(long number) {
        long result;
        if (number == 1) return number;
        result = anotherCalculate(number - 1) * number;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(RecursiveFactorialCalculation.calculate(10));
        System.out.println(RecursiveFactorialCalculation.anotherCalculate(10));
        System.out.println(2 & 5);
    }

    /*private static long calculate(long number) {
        long result = number;
        if (number > 1) {
            result *= calculate(--number);
        }
        return result;
    }*/
}
