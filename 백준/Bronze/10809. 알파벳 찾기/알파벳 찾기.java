import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numArr = new int[26];
        for(int i = 0; i < numArr.length; i++){
            numArr[i] = -1;
        }

        String[] S = br.readLine().split("");

        for(int j = 0; j < S.length; j++){
            for(char k = 'a'; k <= 'z'; k++){
                if(numArr[k - 'a'] != -1){
                    continue;
                }

                if(S[j].equals(k+"")){
                    numArr[k - 'a'] = j;
                }
            }
        }

        br.close();

        for (int num : numArr) {
            System.out.print(num + " ");
        }
    }
}