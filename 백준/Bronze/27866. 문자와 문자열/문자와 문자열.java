import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        int i = Integer.parseInt(br.readLine());
        br.close();
        
        System.out.println(S.charAt(i-1));

    }
}