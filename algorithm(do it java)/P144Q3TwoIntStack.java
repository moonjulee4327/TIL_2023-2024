import java.io.BufferedReader;
import java.io.IOException;
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
                break;
            case STACK_B:
                if (ptrB <= 0){
                    throw new EmptyError();
                }
                result = stk[++ptrB];
                break;
        }
        return result;
    }

    public int peek(AorB ab) throws EmptyError{
        int result = 0;
        switch (ab){
            case STACK_A:
                if (ptrA <= 0){
                    throw new EmptyError();
                }
                result = stk[ptrA - 1];
                break;
            case STACK_B:
                if (ptrB <= 0){
                    throw new EmptyError();
                }
                result = stk[ptrB - 1];
                break;
        }
        return result;
    }

    public int indexOf(AorB ab){
        switch (ab){
            case STACK_A:
                for (int i = ptrA - 1; i >= 0; i--){
                    return i;
                }
                break;
            case STACK_B:
                for (int i = ptrB + 1; i < max; i++){
                    return i;
                }
                break;
        }
        return -1;
    }

    public void clear(AorB ab){
        switch (ab){
            case STACK_A:
                ptrA = 0;
                break;
            case STACK_B:
                ptrB = max - 1;
                break;
        }
    }

    public int capacity(){
        return max;
    }

    public int size(AorB ab){
        switch (ab){
            case STACK_A:
                return ptrA;
            case STACK_B:
                return max - ptrB - 1;
        }
        return 0;
    }

    public boolean isEmpty(AorB ab){
        switch (ab){
            case STACK_A:
                return ptrA <= 0;
            case STACK_B:
                return ptrB >= max - 1;
        }
        return true;
    }

    public boolean isFull(){
        return ptrA >= ptrB + 1;
    }

    public void dump(AorB ab){
        switch (ab){
            case STACK_A:
                if (ptrA <= 0){
                    System.out.println("A스택은 비어 있습니다.");
                }else {
                    for (int i = 0; i < ptrA; i++){
                        System.out.print(stk[i] + " ");
                    }
                }
                break;
            case STACK_B:
                if (ptrB >= max - 1){
                    System.out.println("B스택은 비어 있습니다.");
                }else {
                    for (int i = max - 1; i > ptrB; i--){
                        System.out.print(stk[i] + " ");
                    }
                }
                break;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("스택 A와 B의 길이의 합을 설정해주세요. : ");
        P144Q3TwoIntStack tis = new P144Q3TwoIntStack(Integer.parseInt(br.readLine()));


        while (true){
            System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (5)검색 (6)모두 삭제 (7)스택 정보 확인 (8)덤프 (0)종료 : ");
            int menu = Integer.parseInt(br.readLine());

            if (menu == 0){
                break;
            }

            AorB ab;
            String abStr;
            int x;
            switch (menu){
                case 1:
                    System.out.print("스택 A, B를 선택해주세요. : ");
                    abStr = br.readLine();
                    if (abStr.equals("A")){
                        ab = AorB.STACK_A;
                    } else if (abStr.equals("B")) {
                        ab = AorB.STACK_B;
                    }else {
                        System.out.println("올바른 입력을 해주세요.");
                        continue;
                    }
                    System.out.print("데이터를 입력해주세요. : ");
                    x = Integer.parseInt(br.readLine());
                    tis.push(ab, x);
            }
        }
    }
}
