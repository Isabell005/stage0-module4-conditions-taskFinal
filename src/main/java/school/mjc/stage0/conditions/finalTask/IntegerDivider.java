package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {

        int a = dividend / divider;
        if ((a * divider) == dividend) {
            System.out.println("can be divided completely");
        } else if (dividend == 0) {
            System.out.println("division by zero");
        } else {
            System.out.println("cannot be divided completely");
        }
    }
}
