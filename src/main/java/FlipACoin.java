import java.util.Scanner;

public class FlipACoin {
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    private String answer;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    int win = 0;

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    int lose = 0;

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public void flipACoin() {
        FlipACoin f = new FlipACoin();
        Scanner scanN = new Scanner(System.in);
        System.out.println("Сколько раз наебнуть");
        f.setN(scanN.nextInt());
        for (int i = 0; i < f.getN(); i++) {
            double x = (Math.random());
            if ((x > 0.499999999)) {
                setAnswer("ДА");
                System.out.println(getAnswer());
                win++;
            } else
                setAnswer("НЕТ");
                System.out.println(getAnswer());
                lose++;
        }
        System.out.println();
        System.out.println(win + " раз(а) ДА, " + lose + " раз(а) НЕТ");
        System.out.println();
        System.out.print("Итог: ");
        if(getLose() >= getWin()){
            if(getLose() == getWin()){
                System.out.print("ХЗ");
            }
            else System.out.print("НЕТ");
        }
        else System.out.print("ДА");
    }
}
class FlipACoinTestDrive {
    public static void main(String[] args) {
        FlipACoin flip = new FlipACoin();
        flip.flipACoin();
    }
}