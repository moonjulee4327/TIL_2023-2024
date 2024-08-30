import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        // 직관적으로 늘어나는 부분과 줄어드는 부분으로 나눠 생각
        
        // 별이 증가하는 부분
        for (int i = 1; i <= n; i++){
            // 출력을 보면 * 이후의 공백은 없다.
            // 공백을 만든다.
            for (int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            // 이후 별을 찍어준다.
            for (int k = 0; k < 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 별이 감소하는 부분
        for (int i = n - 1; i > 0; i--){
            for (int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            for (int k = 2 * i - 1; k > 0; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}