import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P30Q7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        System.out.print("n값을 입력해주세요. : ");
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i != n){
                sb.append(i + " + ");
            }else {
                sb.append(i + " = ");
            }
            sum += i;
        }
        System.out.println(sb + "" + sum);
        br.close();
    }
}
