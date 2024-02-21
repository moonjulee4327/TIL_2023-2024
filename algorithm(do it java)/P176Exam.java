package doItJava;

public class P176Exam {
    public static void main(String[] args) {
        recur(4);
    }

    private static void recur(int n){
        P136ExamInstack stack = new P136ExamInstack(n);

        while (true){
            if (n > 0){
                stack.push(n);
                n -= 1;
                continue;
            }
            if (stack.isEmpty() != true){
                n = stack.pop();
                System.out.println(n);
                n -= 2;
                continue;
            }
            break;
        }
    }
}
