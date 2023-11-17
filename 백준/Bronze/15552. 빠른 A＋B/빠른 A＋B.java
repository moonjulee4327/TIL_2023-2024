import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String n = br.readLine();
        int num = Integer.parseInt(n);

        int result = 0;
        for(int i = 0; i < num; i++){
            String inputNumber = br.readLine();
            // 방법 1
//            String[] inputNumberArr = inputNumber.split(" ");
//            result = Integer.parseInt(inputNumberArr[0]) + Integer.parseInt(inputNumberArr[1]);
            // 방법 2
//            StringTokenizer st = new StringTokenizer(inputNumber);
//            result = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            // 방법 3
            StringTokenizer st = new StringTokenizer(inputNumber, " ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            sb.append("\n");
            // 방법 1, 2
//            bw.write(result + "\n");
        }
        br.close();
        // 방법 1, 2
//        bw.flush();
        // 방법 3
        System.out.println(sb);
    }
}