package DegHoleCounter;

public class Result {
    public static void main(String[] args) {
        Count count = new Count();
        count.scanNumOfHolesAndValueOfMixing();
        count.calculateDegBetweenHoles();
        count.degOfAllHoles();
    }
}
