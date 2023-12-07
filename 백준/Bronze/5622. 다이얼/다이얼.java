import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        br.close();
        int strLength = str.length();
        int result = 0;
        
        for(int i = 0; i < strLength; i++){
            result += 2;
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'C'){
                result += 1;
            } else if (str.charAt(i) <= 'F') {
                result += 2;
            } else if (str.charAt(i) <= 'I') {
                result += 3;
            } else if (str.charAt(i) <= 'L') {
                result += 4;
            } else if (str.charAt(i) <= 'O') {
                result += 5;
            } else if (str.charAt(i) <= 'S') {
                result += 6;
            } else if (str.charAt(i) <= 'V') {
                result += 7;
            }else {
                result += 8;
            }
        }
        System.out.println(result);
    }
}
