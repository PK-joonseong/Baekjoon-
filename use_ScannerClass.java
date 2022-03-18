// Scanner Class를 이용
// source code
import java.util.*; // Scanner class 불러오기.

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("문장을 입력하세요 : ");
		String line = 	input.nextLine();
		System.out.print(line);
		
	}

}
