import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++){
            String exam = br.readLine();
            String[] examArr = exam.split(" ");
            int repeatNum = Integer.parseInt(examArr[0]);
            String[] exam1Arr = examArr[1].split("");
            for(int j = 0; j < exam1Arr.length; j++){
                sb.append(exam1Arr[j].repeat(repeatNum));
            }
            sb.append("\n");
        }
        br.close();
        
        System.out.println(sb);
    }
}