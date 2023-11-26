import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] numArr = new int[n];

        for(int i = 0; i < m; i++){
            String[] strNumArr = br.readLine().split(" ");
            int firstIndex = Integer.parseInt(strNumArr[0]) - 1;
            int lastIndex = Integer.parseInt(strNumArr[1]);
            int inputNum = Integer.parseInt(strNumArr[2]);

            for(int j = firstIndex; j < lastIndex; j++){
                numArr[j] = inputNum;
            }
        }
        br.close();

        for(int s : numArr){
            System.out.print(s + " ");
        }
    }
}