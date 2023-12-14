import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P30Q8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("n값을 입력해주세요. : ");
        int n = Integer.parseInt(br.readLine());
        long sum = (long) (1 + n) * n/2;

        System.out.println("1 ~ " + n + " 의 합은 " + sum + " 입니다.");
        br.close();
    }
}
