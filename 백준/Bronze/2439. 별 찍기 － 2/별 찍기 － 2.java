import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int a = n;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(j >= a){
                    sb.append("*");
                }else {
                    sb.append(" ");
                }
            }
            a--;
            sb.append("\n");
        }
        System.out.println(sb);
    }
}