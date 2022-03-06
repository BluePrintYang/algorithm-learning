import edu.princeton.cs.algs4.StdOut;

/**
 * @Author yangllong
 * @Date 2022/3/6 19:11
 */
public class Exercise1_1_3 {
    public static void main(String[] args) {
        int[] ints = new int[3];
        for (int i = 0; i < 3; i++) {
            ints[i] = Integer.parseInt(args[i]);
        }
        if (ints[0] == ints[1] && ints[1] == ints[2]) {
            StdOut.printf("equal");
        } else {
            StdOut.printf("not equal");
        }
    }
}
