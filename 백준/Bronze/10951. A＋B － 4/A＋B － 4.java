import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String num;
        while ((num = br.readLine()) != null){
            String[] numArr = num.split(" ");
            int sum = Integer.parseInt(numArr[0]) + Integer.parseInt(numArr[1]);
            sb.append(sum + "\n");
        }
        System.out.print(sb);
        br.close();
    }
}