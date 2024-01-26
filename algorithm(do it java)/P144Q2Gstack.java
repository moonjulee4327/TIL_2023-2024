public class P144Q2Gstack<E> {
    private int max; // 스택 용량
    private int ptr; // 스택 포인터
    private E[] stk; // 스택 본체

    // 실행할 때 예외：스택이 비어 있음
    public static class EmptyGstackException extends RuntimeException {
        public EmptyGstackException() {
        }
    }

    // 실행할 때 예외：스택이 가득 참
    public static class OverflowGstackException extends RuntimeException {
        public OverflowGstackException() {
        }
    }
    public P144Q2Gstack(int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stk = (E[]) new Object[max];
        }catch (OutOfMemoryError e){
            max = 0;
        }
    }

    public E push(E x) throws OverflowGstackException{
        if (ptr >= max){
            throw new OverflowGstackException();
        }
        return stk[ptr++] = x;
    }

    public E pop() throws EmptyGstackException{
        if (ptr <= 0){
            throw new EmptyGstackException();
        }
        return stk[--ptr];
    }

    public E peek() throws EmptyGstackException{
        if (ptr <= 0){
            throw new EmptyGstackException();
        }
        return stk[ptr - 1];
    }

    public int indexOf(E x){
        for (int i = ptr - 1; i >= 0; i--){
            if (stk[i].equals(x)){
                return i;
            }
        }
        return -1;
    }

    public void clear(){
        ptr = 0;
    }

    public int capacity(){
        return max;
    }

    public int size(){
        return ptr;
    }

    public boolean isEmpty(){
        return ptr <= 0;
    }

    public boolean isFull(){
        return ptr >= max;
    }

    public void dump(){
        if (ptr <= 0){
            System.out.println("스택이 비어 있습니다.");
        }else {
            for (E e : stk){
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
