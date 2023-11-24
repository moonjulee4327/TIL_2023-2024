import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] numStrArr = br.readLine().split(" ");
        String num2Str = br.readLine();
        br.close();
        
        int result = 0;
        for(int i = 0; i < n; i++){
            if(numStrArr[i].equals(num2Str)){
                result++;
            }
        }
        System.out.print(result);
    }
}