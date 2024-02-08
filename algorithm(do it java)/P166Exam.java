import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P166Exam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("정수만 입력해주세요. : ");
        int num = Integer.parseInt(br.readLine());
        System.out.println(num + "!은 " + factorial(num) + "입니다.");
    }

    public static int factorial(int n){
        if (n > 0){
            return n * factorial(n - 1);
        }else {
            return 1;
        }
    }
}
