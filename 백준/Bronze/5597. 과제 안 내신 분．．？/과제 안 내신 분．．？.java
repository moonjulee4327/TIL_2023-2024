import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] attands = new boolean[30];
        for(int i = 0; i < 28; i++){
            int n = Integer.parseInt(br.readLine());
            attands[n-1] = true;
        }
        br.close();

        for(int j = 0; j < 30; j++){
            if(!attands[j]){
                System.out.println(j+1);
            }
        }
    }
}