import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String firstStr = br.readLine();
        StringTokenizer st = new StringTokenizer(firstStr, " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] numArr = new int[n];
        for(int i = 0; i < n; i++){
            numArr[i] = i + 1;
        }

        int temp = 0;
        for(int j = 0; j < m; j++){
            String[] strArr = br.readLine().split(" ");
            int first = Integer.parseInt(strArr[0]) - 1;
            int last = Integer.parseInt(strArr[1]) - 1;
            temp = numArr[first];
            numArr[first] = numArr[last];
            numArr[last] = temp;
        }
        for(int num : numArr){
            System.out.print(num + " ");
        }
    }
}