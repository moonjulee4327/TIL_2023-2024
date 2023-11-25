import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] oneLine = br.readLine().split(" ");
        int n = Integer.parseInt(oneLine[0]);
        int standardNum = Integer.parseInt(oneLine[1]);

        String[] twoLine = br.readLine().split(" ");
        br.close();

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(twoLine[i]);
            if(standardNum > num){
                if(sb.length() == 0){
                    sb.append(num);
                }else {
                    sb.append(" " + num);
                }
            }
        }
        System.out.println(sb);
    }
}