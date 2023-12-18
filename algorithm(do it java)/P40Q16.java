import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P40Q16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        triangleLU(n);
        triangleRU(n);
        triangleRB(n);
    }

    public static void triangleLU(int n){
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangleRU(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(j >= i){
                    System.out.printf("*");
                }else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }

    public static void triangleRB(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(n - j >= i){
                    System.out.printf(" ");
                }else {
                    System.out.printf("*");
                }
            }
            System.out.println();
        }
    }
}
