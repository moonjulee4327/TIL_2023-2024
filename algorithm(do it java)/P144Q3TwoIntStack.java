import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P144Q3TwoIntStack {
    private int max; // A, B 스택의 용량 합
    private int ptrA;
    private int ptrB;
    private int[] stk;

    public enum AorB{
        STACK_A, STACK_B
    }

    public class EmptyError extends RuntimeException{
        public EmptyError(){}
    }

    public class OverflowError extends RuntimeException{
        public OverflowError(){}
    }

    public P144Q3TwoIntStack(int capacity){
        max = capacity;
        ptrA = 0;
        ptrB = capacity - 1;

        try {
            stk = new int[max];
        }catch (OutOfMemoryError e){
            max = 0;
        }
    }

    public int push(AorB ab, int x) throws OverflowError{
        if (ptrA >= ptrB + 1){
            throw new OverflowError();
        }

        switch (ab){
            case STACK_A:
                stk[ptrA++] = x;
                break;
            case STACK_B:
                stk[ptrB--] = x;
                break;
        }
        return x;
    }

    public int pop(AorB ab) throws EmptyError{
        int result = 0;
        switch (ab){
            case STACK_A:
                if (ptrA <= 0){
                    throw new EmptyError();
                }
                result = stk[--ptrA];
            case STACK_B:
                if (ptrB <= 0){
                    throw new EmptyError();
                }
                result = stk[++ptrB];
        }
        return result;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        P144Q3TwoIntStack tis = new P144Q3TwoIntStack(10);

        System.out.println(tis.push(AorB.STACK_A, 1));

        System.out.println(tis.push(AorB.STACK_B, 1));
    }
}
