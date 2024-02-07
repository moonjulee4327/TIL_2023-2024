public class P160Q7 {
    private int max;
    private int num;
    private int front;
    private int rear;
    private int[] que;
    public class EmptyIntQueueException extends RuntimeException{
        public EmptyIntQueueException() {
        }
    }
    public class OverflowIntQueueException extends RuntimeException{
        public OverflowIntQueueException() {
        }
    }

    public P160Q7(int capacity) {
        max = capacity;
        num = front = rear = 0;
        try {
            que = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int enqueFront(int x) throws OverflowIntQueueException{
        if (num >= max){
            throw new OverflowIntQueueException();
        }
        num++;
        if (--front < 0){
            front = max - 1;
        }
        que[front] = x;
        return x;
    }

    public int enqueRear(int x) throws EmptyIntQueueException{
        if (num >= max){
            throw new OverflowIntQueueException();
        }
        num++;
        if (rear == max){
            rear = 0;
        }
        return x;
    }

    public int dequeFront() throws EmptyIntQueueException{
        if (num <= 0){
            throw new EmptyIntQueueException();
        }
        int x = que[front++];
        num--;
        if (front == max){
            front = 0;
        }
        return x;
    }

    public int dequeRear() throws EmptyIntQueueException{
        if (num <= 0){
            throw new EmptyIntQueueException();
        }
        int x = que[rear--];
        num--;
        if (rear < 0){
            rear = max - 1;
        }
        return x;
    }

    public int peekFront() throws EmptyIntQueueException{
        if (num <= 0){
            throw new EmptyIntQueueException();
        }
        return que[front];
    }

    public int peekRear() throws EmptyIntQueueException{
        if (num <= 0){
            throw new EmptyIntQueueException();
        }
        return que[rear];
    }

    public int indexOf(int x){
        for (int i = 0; i < num; i++){
            if (que[(i + front) % max] == x){
                return i + front;
            }
        }
        return -1;
    }

    public int search(int x){
        for (int i = 0; i < num; i++){
            if (que[(i + front) % max] == x){
                return i + 1;
            }
        }
        return 0;
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
            System.out.println("덱(deck)이 비었습니다.");
        }else {
            for (int i = 0; i < num; i++){
                System.out.print(que[(i + front) % max] + " ");
            }
            System.out.println();
        }
    }
}
