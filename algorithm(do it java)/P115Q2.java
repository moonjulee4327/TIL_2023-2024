import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P115Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("요솟수를 입력하세요 : ");
        int num = Integer.parseInt(br.readLine());

        int[] x = new int[num + 1];
        System.out.println("요소를 입력하세요.");
        for (int i = 0; i < num; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = Integer.parseInt(br.readLine());
        }

        System.out.print("검색 값을 입력하세요 : ");
        int key = Integer.parseInt(br.readLine());

        int idx = seqSearchSen(x, num, key);

        if(idx == -1){
            System.out.println("그 값은 요소에 없습니다.");
        }else {
            System.out.println(key + "은 x[" + idx + "]에 있습니다.");
        }
    }

    public static int seqSearchSen(int[] a, int n, int key){ // 보초법 X
        System.out.printf("%4s", "|");
        for (int j = 0; j < n; j++){
            System.out.printf("%3d", j);
        }
        System.out.println();

        System.out.print("---+");
        for (int j = 0; j < n; j++){
            System.out.print("---");
        }
        System.out.println();

        a[n] = key;
        for(int i = 0; i < n; i++){
            System.out.printf("%4s", "|");
            System.out.printf(String.format("%%%ds\n", (i * 3) + 3), "*");
            System.out.printf("%3d|",i);
            for (int j = 0; j < n; j++){
                System.out.printf("%3d", a[j]);
            }
            System.out.println();
            if(a[i] == key){
                return i;
            }
            System.out.printf("%4s", "|");
            System.out.println();
        }

        return -1;
    }
}
