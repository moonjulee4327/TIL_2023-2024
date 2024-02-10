import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P170Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("정수를 입력해주세요. : ");
        int n = Integer.parseInt(br.readLine());

        System.out.println(n + "!은 " + factorial(n) + "입니다.");
    }

    public static int factorial(int n){
        int result = 1;
        if(n > 0){
            for (int i = 1; i <= n; i++){
                result *= i;
            }
            return result;
        }else {
            return result;
        }
    }
}