// Scanner Class 이용
// source code
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner Class 불러오기.
        double A, B;

        A = input.nextDouble();
        B = input.nextDouble();
        System.out.print(A / B);
    }
}
