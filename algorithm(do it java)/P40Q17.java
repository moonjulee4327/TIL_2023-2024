import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P40Q17 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n;
        do {
            System.out.print("숫자를 입력해주세요. : ");
            n = Integer.parseInt(br.readLine());
        }while (n <= 0);
        npira(n);
    }

    public static void npira(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (i - 1) * 2 + 1; j++){
                System.out.print(i % 10);
            }
            System.out.println();
        }
    }
}
