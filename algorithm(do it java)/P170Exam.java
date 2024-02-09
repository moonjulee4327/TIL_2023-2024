import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P170Exam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("두 정수의 최대공약수를 구합니다.");

        System.out.print("첫번째 정수를 입력해주세요. : ");
        int x = Integer.parseInt(br.readLine());
        System.out.print("두번째 정수를 입력해주세요. : ");
        int y = Integer.parseInt(br.readLine());

        System.out.println("최대공약수는 " + gcd(x , y) + "입니다.");
    }

    public static int gcd(int x, int y){
        if (y == 0){
            return x;
        }else {
            return gcd(y, x % y);
        }
    }
}
