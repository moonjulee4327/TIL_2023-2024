import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split("");
        br.close();

        int sum = 0;
        for(int i = 0; i < num; i++){
            sum += Integer.parseInt(strArr[i]);
        }
        System.out.println(sum);
    }
}