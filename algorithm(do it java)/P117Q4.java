import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P117Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("요솟수를 입력해주세요 : ");
        int num = Integer.parseInt(br.readLine());

        int[] x = new int[num];
        System.out.println("요소를 오름차순으로 입력해주세요.");
        System.out.print("x[0] : ");
        x[0] = Integer.parseInt(br.readLine());

        for(int i = 1; i < num; i++){
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = Integer.parseInt(br.readLine());
            }while (x[i] < x[i - 1]);
        }

        System.out.print("검색할 값을 입력해주세요 : ");
        int key = Integer.parseInt(br.readLine());

        int idx = binSearchProcessPrint(x, num, key);

        if(idx == -1){
            System.out.println("그 값은 요소에 없습니다.");
        }else {
            System.out.println(key + "은 x[" + idx + "]에 있습니다.");
        }
    }

    public static int binSearchProcessPrint(int[] a, int n, int key){
        int pl = 0;
        int pr = n - 1;

        System.out.print("   |");
        for (int i = 0; i < n; i++){
            System.out.printf("%4d", i);
        }
        System.out.println();

        System.out.print("---+");
        for(int i = 0; i < 4 * n + 2; i++){
            System.out.printf("-");
        }
        System.out.println();

        do {
            int pc = (pl + pr) / 2;
            System.out.print("   |");
            if (pl != pc) {
                System.out.printf(String.format("%%%ds<-%%%ds+", (pl * 4) + 1, (pc - pl) * 4), "", "");
            }else {
                System.out.printf(String.format("%%%ds<-+", pc * 4 + 1), "");
            }

            if (pc != pr) {
                System.out.printf(String.format("%%%ds->\n", (pr - pc) * 4 - 2), "");
            }else{
                System.out.println("->");
            }

            System.out.printf("%3d|", pc);
            for (int i = 0; i < n; i++){
                System.out.printf("%4d", a[i]);
            }
            System.out.println();
            System.out.print("   |");
            System.out.println();

            if (a[pc] == key){
                return pc;
            }else if (key < a[pc]){
                pr = pc - 1;
            }else {
                pl = pc + 1;
            }

        }while (pl <= pr);

        return -1;
    }
}
