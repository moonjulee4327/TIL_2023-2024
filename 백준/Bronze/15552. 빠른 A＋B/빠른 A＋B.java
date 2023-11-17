import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        int num = Integer.parseInt(n);

        int result = 0;
        for(int i = 0; i < num; i++){
            String inputNumber = br.readLine();
            // 방법 1
//            String[] inputNumberArr = inputNumber.split(" ");
//            result = Integer.parseInt(inputNumberArr[0]) + Integer.parseInt(inputNumberArr[1]);
            // 방법 2
            StringTokenizer st = new StringTokenizer(inputNumber);
            result = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

            bw.write(result + "\n");
        }
        bw.flush();
    }
}