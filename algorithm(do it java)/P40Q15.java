import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P40Q15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        do {
            System.out.print("숫자를 입력하세요. : ");
            n = Integer.parseInt(br.readLine());
        }while (n <= 0);

        triangleLB(n);
    }

    public static void triangleLB(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
