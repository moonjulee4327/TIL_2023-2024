import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P29 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("1부터 입력값 까지의 합을 구합니다. 입력값 : ");
        int n = Integer.parseInt(br.readLine());
        int i = 1;
        int sum = 0;
        while (i <= n){
            sum += i;
            i++;
        }
        System.out.println("1부터 입력 값의 합은 : " + sum + "이고, 반복 횟수는 " + i + "번 입니다.");
    }
}
