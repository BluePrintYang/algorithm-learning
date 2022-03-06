import edu.princeton.cs.algs4.StdOut;

/**
 * @Author yangllong
 * @Date 2022/3/6 19:11
 */
public class Exercise1_1_5 {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++){
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
