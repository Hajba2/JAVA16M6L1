package math;

public class Math {

    public static int sum1toN(int n) {
        class Sum {
            public int calculateSum() {
                int res = 0;
                for (int i = 0; i <= n; i++) {
                    res += i;
                }
                return res;
            }
        }

        return new Sum().calculateSum();
    }

    public static void main(String[] args) {
        System.out.println("sum1toN(9) = " + sum1toN(9));
    }
}
