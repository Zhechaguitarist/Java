public class Bubbles implements NumberOfElements {
    int[] arrayToBubbles = {1, 6, -4, 9, 5};

    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }

    public void returnNothing() {
        for (int k : arrayToBubbles) {
            if (k < 0) {
                return;
            }
            System.out.println(k);
        }
    }

    public void bubbles() {
        for (int i = 0; i < arrayToBubbles.length; i++) {
            for (int j = 0; j < arrayToBubbles.length - i - 1; j++) {
                if (arrayToBubbles[j] < arrayToBubbles[j + 1]) {
                    int min = arrayToBubbles[j];
                    arrayToBubbles[j] = arrayToBubbles[j + 1];
                    arrayToBubbles[j + 1] = min;
                }
            }
        }
        for (int number : arrayToBubbles) {
            System.out.println(number);
        }
    }
}
class BubblesTestDrive{
    public static void main(String[] args) {
        Bubbles bubbles = new Bubbles();
        bubbles.returnNothing();
        bubbles.bubbles();
    }
}
