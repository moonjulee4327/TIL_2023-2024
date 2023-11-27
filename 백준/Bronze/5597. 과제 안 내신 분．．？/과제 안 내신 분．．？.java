import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numArr = new int[28];
        for(int i = 1; i <= 28; i++){
            int num = Integer.parseInt(br.readLine());
            numArr[i-1] = num;
        }

        for(int j = 1; j <= 30; j++){
            for(int k = 0; k < 28; k++){
                if(numArr[k] == j){
                    break;
                }
                if(k == 27){
                    System.out.println(j);
                }
            }
        }
    }
}