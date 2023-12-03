import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        br.close();
        
        double[] totalArr = new double[total];
        double maxNum = 0;
        double sum = 0;
        for(int i = 0; i < total; i++){
            totalArr[i] = Double.parseDouble(strArr[i]);
            if(totalArr[i] > maxNum){
                maxNum = totalArr[i];
            }
            sum += totalArr[i];
        }

        System.out.println((sum/maxNum)*100/total);

    }
}