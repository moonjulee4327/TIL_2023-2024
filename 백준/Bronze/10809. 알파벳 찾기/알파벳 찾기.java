import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] strArr = br.readLine().split("");
        br.close();

        for(char i = 97; i < 123; i++){
            for(int j = 0; j < strArr.length; j++){
                if(strArr[j].equals(i+"")){
                    sb.append(j + " ");
                    break;
                }else if (!strArr[j].equals(i+"") && j+1 == strArr.length){
                    sb.append("-1 ");
                }
            }
        }
        System.out.println(sb);
    }
}