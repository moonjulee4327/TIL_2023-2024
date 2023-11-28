import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numArr = new int[10];
        for(int i = 0; i < 10; i++){
            int n = Integer.parseInt(br.readLine());
            numArr[i] = (n % 42);
        }
        br.close();

        int count = 10;
        for(int j = 0; j < numArr.length; j++){
            for(int k = 0; k < numArr.length; k++){
                if(j == k){
                    continue;
                }else if(k > j && numArr[j] == numArr[k]){
                    count--;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}