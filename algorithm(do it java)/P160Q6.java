public class P160Q6<E>{
    private int max;
    private int num;
    private int front;
    private int rear;
    private E [] que;
    public static class EmptyIntQueueException extends RuntimeException{
        public EmptyIntQueueException() {
        }
    }

    public static class OverflowIntQueueException extends RuntimeException{
        public OverflowIntQueueException() {
        }
    }

    public P160Q6(int capacity) {
        max = capacity;
        num = front = rear = 0;
        try {
            que = (E[]) new Object[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public E enque(E x) throws OverflowIntQueueException{
        if (num >= max){
            throw new OverflowIntQueueException();
        }
        que[rear++] = x;
        num++;
        if (rear == max){
            rear = 0;
        }
        return x;
    }

    public E deque() throws EmptyIntQueueException{
        if (num == 0){
            throw new EmptyIntQueueException();
        }
        E x = que[front++];
        num--;
        if (front == max){
            front = 0;
        }
        return x;
    }

    public E peek() throws EmptyIntQueueException{
        if (num <= 0){
            throw new EmptyIntQueueException();
        }
        return que[front];
    }

    public int indexOf(E x){
        for (int i = 0; i < num; i++){
            int idx = (i + front) % max;
            if (que[idx].equals(x)){
                return i + front;
            }
        }
        return -1;
    }

    public void clear(){
        num = front = rear = 0;
    }

    public int capacity(){
        return max;
    }

    public int size(){
        return num;
    }

    public boolean isEmpty(){
        return num <= 0;
    }

    public boolean isFull(){
        return num >= max;
    }

    public void dump(){
        if (num <= 0){
            System.out.println("큐가 비어 있습니다.");
        }else {
            for (int i = 0; i < num; i++){
                System.out.println(que[(i + front) % max] + " ");
            }
            System.out.println();
        }
    }
}
