import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");

        int n = Integer.parseInt(strArr[0]);
        int m = Integer.parseInt(strArr[1]);

        int[] nArr = new int[n];
        for(int i = 0; i < nArr.length; i++){
            nArr[i] = i + 1;
        }

        for(int j = 0; j < m; j++){
            String[] brArr = br.readLine().split(" ");

            int a = Integer.parseInt(brArr[0]) - 1;
            int b = Integer.parseInt(brArr[1]) - 1;

            for(int k = a; k < b; k++){
                int temp = nArr[k];
                nArr[k] = nArr[b];
                nArr[b] = temp;
                b--;
            }
        }
        
        br.close();
        
        for (int l: nArr) {
            System.out.print(l + " ");
        }

    }
}