import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P21 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.print("a의 값 : ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("b의 값 : ");
        int b = Integer.parseInt(br.readLine());
        System.out.print("c의 값 : ");
        int c = Integer.parseInt(br.readLine());

        System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
    }

    public static int med3(int a, int b, int c){
        if(a >= b){
            if(b >= c){
                return b;
            }else if(a <= c) {
                return a;
            }else { // b가 c 작거나 같을 경우
                return c;
            }
        }else if(a > c) { // b가 a보다 큰 경우
            return a;
        }else if(b > c) { // 위의 조건문을 통해 b > a, c > a, b > c 이다.
            return c;
        }else { // 같은 방법으로 b > a, c > a, c >= b 인 경우 -> c > b > a,
            return b;
        }
    }
}
