import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P115Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("요솟수를 입력하세요 : ");
        int num = Integer.parseInt(br.readLine());

        int[] x = new int[num];
        System.out.println("요소를 입력하세요.");
        for (int i = 0; i < num; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = Integer.parseInt(br.readLine());
        }

        System.out.print("검색 값을 입력하세요 : ");
        int key = Integer.parseInt(br.readLine());

        int idx = seqSearchSen(x, num, key);

        if(idx == -1){
            System.out.println("\n그 값은 요소에 없습니다.");
        }else {
            System.out.println("\n" + key + "은 x[" + idx + "]에 있습니다.");
        }
    }

    public static int seqSearchSen(int[] a, int n, int key){
        int i = 0;

        System.out.print("   |");
        for (int j = 0; j < n; j++){
            System.out.printf("%3d", j);
        }

        System.out.println("\n---+----------------------------------");

        while (i < n){
            System.out.printf("   |%2s","");
            System.out.printf("\n%3d|", i);
            for (int aNum : a){
                System.out.printf("%2d", aNum);
            }
            if (a[i] == key){
                return i;
            }
            System.out.println("\n   |");
            i++;
        }

        return -1;
    }
}
