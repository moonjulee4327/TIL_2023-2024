public class P115Exam {
    public static void main(String[] args) {
        int n = 1000;
        int[] x = new int[n];
        for(int i = 0; i < n; i++){
            x[i] = i;
        }
        int key = 1000;

        int idx = binSearch(x, n, key);
        System.out.println(idx);
    }

    public static int binSearch(int[] a, int n, int key){
        int pl = 0;
        int pr = n - 1;

        do {
            int pc = (pl + pr) / 2;
            if (a[pc] == key){
                return pc;
            }else if(a[pc] < key){
                pl = pc + 1;
            }else {
                pr = pc - 1;
            }
        }while (pl <= pr);

        return -1;
    }
}
