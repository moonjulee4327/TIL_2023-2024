import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P171Exam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("정수를 입력해주세요. : ");
        int x = Integer.parseInt(br.readLine());

        recur(x);
    }

    private static void recur(int n) {
        if (n > 0){
            recur(n - 1);
            System.out.println(n);
            recur(n - 2);
        }
    }
}
