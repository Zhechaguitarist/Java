import java.util.Scanner;

class Chikly {
    private int x;
    private int y = 20;

    //Setters and Getters
    public void setX() {
        Scanner scanX = new Scanner(System.in);
        System.out.println("Введите x");
        int newx = scanX.nextInt();
        if (newx>0) {
            this.x = newx;
        }
        else {
            System.out.println("Вы ввели неположительный x");
        }
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
        System.out.println(y);
    }

    public int getY() {
        return y;
    }
    public void printX(){
        System.out.println("Ваш x равен " + getX());
    }
}
