/**
 * @Author yangllong
 * @Date 2022/3/6 15:13
 */
public class Gcd {
    /**
     * 欧几里得算法求最大公约数
     *
     * @param p 较大的数
     * @param q 较小的数
     * @return gcd
     */
    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }

    public static int gcd2(int p, int q) {
        int gcd = p;
        while (q != 0) {
            gcd = p;
            p = q;
            q = gcd % q;
        }
        return gcd;
    }

    public static void main(String[] args) {
        System.out.println(gcd2(10, 4));
        System.out.println(gcd(10, 4));
        System.out.println(gcd(10, 4) == gcd2(10, 4));

    }
}
