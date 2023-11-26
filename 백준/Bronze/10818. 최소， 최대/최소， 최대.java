import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] numArr = new int[n];
        String[] strArr = br.readLine().split(" ");
        int max = 0;
        int min = 0;
        for(int i = 0; i < n; i++){
            numArr[i] = Integer.parseInt(strArr[i]);
            if(i == 0){
                max = numArr[i];
                min = numArr[i];
            } else {
                if(numArr[i] > max){
                    max = numArr[i];
                } else if (min > numArr[i]) {
                    min = numArr[i];
                }
            }
        }
        br.close();

        bw.write(min + " " + max);
        bw.close();
    }
}