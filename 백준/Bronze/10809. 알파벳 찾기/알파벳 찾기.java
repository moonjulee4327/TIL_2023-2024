import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numArr = new int[26];
        for(int i = 0; i < numArr.length; i++){
            numArr[i] = -1;
        }

        String S = br.readLine();

        for(int j = 0; j < S.length(); j++){
            char SChar = S.charAt(j);

            if(numArr[SChar - 'a'] == -1){
                numArr[SChar - 'a'] = j;
            }

        }

        br.close();

        for (int num : numArr) {
            System.out.print(num + " ");
        }
    }
}