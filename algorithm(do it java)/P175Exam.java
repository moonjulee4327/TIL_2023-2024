package doItJava;

public class P175Exam {
    public static void main(String[] args) {
        recurX(4);
    }

    private static void recurX(int n){
        while (n > 0){
            recurX(n - 1);
            System.out.println(n);
            n = n - 2;
        }
    }
}
