import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numArr = new int[9];
        int max = 0;
        int line = 0;
        for(int i = 0; i < 9; i++){
            numArr[i] = Integer.parseInt(br.readLine());
        }

        for(int j = 0; j < numArr.length; j++){
            if(numArr[j] > max){
                max = numArr[j];
                line = j+1;
            }
        }

        br.close();

        bw.write(max + "\n" + line);
        bw.close();
    }
}