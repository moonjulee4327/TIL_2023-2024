import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P117Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("요솟수를 입력해주세요 : ");
        int num = Integer.parseInt(br.readLine());

        int[] x = new int[num];
        System.out.println("요소를 입력해주세요.");
        for (int i = 0; i < num; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = Integer.parseInt(br.readLine());
        }

        System.out.print("검색값을 입력해주세요. : ");
        int key = Integer.parseInt(br.readLine());
        
        int[] idxArr = new int[num];
        int idx = searchIdx(x, num, key, idxArr);

        if(idx == 0){
            System.out.println("그 값은 요소에 없습니다.");
        }else {
            for(int i = 0; i < idx; i++){
                System.out.println("검색값" + key + "는 x[" + idxArr[i] + "]에 있습니다.");
            }
        }
    }
    
    public static int searchIdx(int[] a, int n, int key, int[] idx){
        int count = 0;
        for (int i = 0; i < n; i++){
            if (a[i] == key){
                idx[count++] = i;
            }
        }
        return count;
    }
}
