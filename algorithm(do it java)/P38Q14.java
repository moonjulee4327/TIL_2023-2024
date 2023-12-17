import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P38Q14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("사각형을 출력합니다.");
        System.out.print("단수 : ");
        int lineCount = Integer.parseInt(br.readLine());
        br.close();
        for (int i = 0; i < lineCount; i++){
            for(int j = 0; j < lineCount; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
