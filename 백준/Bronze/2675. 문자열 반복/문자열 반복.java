import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // repeat() 함수 없이 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            String[] RS = br.readLine().split(" ");
            int R = Integer.parseInt(RS[0]);
            int SLength = RS[1].length();

            for(int j = 0; j < SLength; j++){
                for(int k = 0; k < R; k++){
                    sb.append(RS[1].charAt(j));
                }
            }
            sb.append("\n");
        }
        br.close();

        System.out.println(sb);
    }
}