import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P64Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("배열의 길이를 입력하세요. : ");
        int idx = Integer.parseInt(br.readLine());

        int[] numArr = new int[idx];

        for(int i = 0; i < idx; i++){
            System.out.print("요소 값을 넣어주세요(" + (i + 1) + "/" + idx + ") : ");
            numArr[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        System.out.println("배열을 복사하겠습니다.");
        int[] numArrA = new int[idx];

        copy(numArrA, numArr);

        System.out.print("복사한 배열의 값은");
        for(int num : numArrA){
            System.out.print(" "+num);
        }
        System.out.print("입니다.");
    }

    public static void copy(int[] a, int[] b){
        for (int i = 0; i < b.length; i++){
            a[i] = b[i];
        }
    }
}
