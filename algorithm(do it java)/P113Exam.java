public class P113Exam {
    public static void main(String[] args) {

        int n = 1000;
        int[] x = new int[n];
        for(int i = 0; i < n; i++){
            x[i] = i;
        }
        int key = 1000;

        int idx = seqSearch(x, n, key);
        System.out.println(idx);
    }

    public static int seqSearch(int[] a, int n, int key){
        int i = 0;

        while (i < n){
            if (a[i] == key){
                return i;
            }
            i++;
        }

        return -1;
    }
}
