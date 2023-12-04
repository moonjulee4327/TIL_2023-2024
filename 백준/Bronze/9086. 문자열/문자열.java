import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        String str = "";
        for(int i = 0; i < num; i++){
            str = br.readLine();
            sb.append(str.charAt(0) + "" + str.charAt(str.length() - 1) + "\n");
        }
        br.close();

        System.out.println(sb);
    }
}