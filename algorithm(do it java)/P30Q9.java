import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P30Q9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("첫번째 숫자를 입력하세요. : ");
        int num1 = Integer.parseInt(br.readLine());

        System.out.print("두번째 숫자를 입력하세요. : ");
        int num2 = Integer.parseInt(br.readLine());

        System.out.println("두 수 사이의 모든 정수의 합은 " + sumof(num1, num2) + " 입니다.");
        br.close();
    }

    public static int sumof(int num1, int num2){
        // 두 수 중 큰 수 num1로 설정
        if(num1 > num2){
            int temp;
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int sum = 0;
        for(int i = num1; i <= num2; i++){
            sum += i;
        }

        return sum;
    }
}
