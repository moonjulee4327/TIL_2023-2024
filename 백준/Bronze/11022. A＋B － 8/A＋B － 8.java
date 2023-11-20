import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++){
            String inputNumber = br.readLine();
            StringTokenizer st = new StringTokenizer(inputNumber, " ");
            int st1 = Integer.parseInt(st.nextToken());
            int st2 = Integer.parseInt(st.nextToken());
            sb.append("Case #" + i + ": " + st1 + " + " + st2 + " = " + (st1+st2));
            sb.append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}