public class P192Exam {
    private static boolean[] flag = new boolean[8];
    private static int[] pos = new int[8];

    private static void print(){
        for (int i = 0; i < 8; i++){
            System.out.printf("%2d", pos[i]);
        }
        System.out.println();
    }

    public static void set(int i){
        for (int j = 0; j < 8; j++){
            if (flag[j] == false){
                pos[i] = j;
                if (i == 7){
                    print();
                }else {
                    flag[j] = true;
                    set(i + 1);
                    flag[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        set(0);
    }
}
