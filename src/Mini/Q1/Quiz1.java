// 나영서

package Mini.Q1;

public class Quiz1 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                String result = String.format("%02d x %02d = %02d    ", j, i, i*j);
                System.out.print(result);
            }
            System.out.println();
        }

    }
}
