import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true){
            String num = br.readLine();
            if(num.equals("0 0")){
                break;
            }
            String[] numArr = num.split(" ");
            int sum = Integer.parseInt(numArr[0]) + Integer.parseInt(numArr[1]);

            sb.append(sum + "\n");
        }
        br.close();

        System.out.print(sb);
    }
}