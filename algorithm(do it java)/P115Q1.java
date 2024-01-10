import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P115Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("요솟수를 입력해주세요 : ");
        int num = Integer.parseInt(br.readLine());

        System.out.println("요소를 입력해주세요.");
        int[] x = new int[num + 1];
        for(int i = 0; i < num; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = Integer.parseInt(br.readLine());
        }

        System.out.print("검색할 값 : ");
        int key = Integer.parseInt(br.readLine());

        int idx = seqSearchSen(x, num, key);

        if(idx == -1){
            System.out.println("그 값은 요소에 없습니다.");
        }else {
            System.out.println(key + "은 x[" + idx + "]에 있습니다.");
        }
    }

    public static int seqSearchSen(int[] a, int n, int key){
        a[n] = key;

        int i;
        for(i = 0; a[i] != key; i++) // for문 무한 루프
                ;
        return i == n ? -1 : i;
    }
}
