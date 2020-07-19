package DegHoleCounter;

import java.util.Scanner;

public class Count {

    private int numOfHoles;

    private double degBetweenHoles;

    double valueOfMixing = 0;

    public void setNumOfHoles(int numOfHoles){
        this.numOfHoles = numOfHoles;
    }

    public int getNumOfHoles(){
        return numOfHoles;
    }

    public void setDegBetweenHoles(double degBetweenHoles){
        this.degBetweenHoles = degBetweenHoles;
    }

    public double getDegBetweenHoles(){
        return degBetweenHoles;
    }

    public void setValueOfMixing(double valueOfMixing) {
        this.valueOfMixing = valueOfMixing;
    }

    public double getValueOfMixing() {
        return valueOfMixing;
    }

    public void scanNumOfHolesAndValueOfMixing(){
        Scanner scanNumOfHoles = new Scanner(System.in);
        System.out.println("Введите количество отверстий");
        setNumOfHoles(scanNumOfHoles.nextInt());
            while (numOfHoles <= 0) {
                System.out.println("Вы ввели некорректное количество отверстий");
                Scanner secondScanNumOfHoles = new Scanner(System.in);
                System.out.println("Введите количество отверстий ещё раз");
                setNumOfHoles(secondScanNumOfHoles.nextInt());
            }
        Scanner scanValueOfMixing = new Scanner(System.in);
        System.out.println("Введите величину смещения от горизонтальной оси");
        setValueOfMixing(scanValueOfMixing.nextDouble());
    }

    public void calculateDegBetweenHoles() {
        setDegBetweenHoles((double) 360 / getNumOfHoles());
        int roundedDegBetweenHoles = (int) Math.round(getDegBetweenHoles());
        if (getDegBetweenHoles() == roundedDegBetweenHoles) {
            System.out.println("Угол между ближайшими отверстиями равен " + roundedDegBetweenHoles + " градусов");
        } else {
            System.out.println("Угол между ближайшими отверстиями равен " + getDegBetweenHoles() + " градусов");
        }
    }

    public void degOfAllHoles(){
        double[] degs = new double[getNumOfHoles()];
        degs[0] = getValueOfMixing();
        for (int i = 1; i<degs.length; i++){
            degs[i] = degs[i-1] + degBetweenHoles;
            }
        for (int i=0;i<degs.length;i++) {
            int j = i + 1;
            System.out.println("Градус " + j + "-ой окружности равен " + degs[i]);
        }

    }

}
