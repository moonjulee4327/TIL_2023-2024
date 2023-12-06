import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String numStr = br.readLine();
        StringTokenizer st = new StringTokenizer(numStr, " ");

        String[] num1Arr = st.nextToken().split("");
        String[] num2Arr = st.nextToken().split("");

        int num1 = Integer.parseInt(num1Arr[2] + num1Arr[1] + num1Arr[0]);
        int num2 = Integer.parseInt(num2Arr[2] + num2Arr[1] + num2Arr[0]);

        System.out.println(num1 > num2 ? num1 : num2);

    }
}