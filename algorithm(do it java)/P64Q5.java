import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P64Q5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("배열의 길이를 입력해주세요. : ");
        int idx = Integer.parseInt(br.readLine());

        int[] numArrA = new int[idx];
        System.out.println("배열 원소를 설정하세요.");
        for(int i = 0; i < idx; i++){
            System.out.print("[" + (i + 1) + "/" + idx + "]원소를 입력하세요. : ");
            numArrA[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        int[] numArrB = new int[idx];
        rCopy(numArrA, numArrB);
        System.out.println("\n배열을 역순으로 복사하였습니다!");
        for (int i = 0; i < numArrB.length; i++) {
            System.out.println("numArrB[" + i + "] = " + numArrB[i]);
        }
    }

    public static void rCopy(int[] a, int[] b){
        int idx = a.length - 1;
        for(int i = 0; i < b.length; i++){
            b[i] = a[idx--];
        }
    }
}
