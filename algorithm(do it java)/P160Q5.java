import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P160Q5 {
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

    public P160Q5(int capacity) {
        num = front = rear = 0;
        max = capacity;
        try {
            que = new int[max];
        }catch (OutOfMemoryError e){
            max = 0;
        }
    }

    public int enque(int x) throws P160Q5.OverflowIntQueueException {
        if(num >= max){
            throw new P160Q5.OverflowIntQueueException();
        }
        que[rear++] = x;
        num++;
        if (rear == max){
            rear = 0;
        }
        return x;
    }

    public int deque() throws P160Q5.EmptyIntQueueException {
        if (num == 0){
            throw new P160Q5.EmptyIntQueueException();
        }
        int x = que[front++];
        num--;
        if (front == max){
            front = 0;
        }
        return x;
    }

    public void dump(){
        if (num <= 0){
            System.out.println("큐가 비어 있습니다.");
        }else {
            for (int i = 0; i < num; i++){
                System.out.print(que[(i + front) % max] + " ");
            }
        }
    }

    public int search(int x){
        for (int i = 0; i < num; i++){
            int idx = (i + front) % max;
            if(que[idx] == x){
                return i + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        P160Q5 exam = new P160Q5(12);

        while (true){
            System.out.print("(1)인큐 (2)디큐 (3)검색 (4)덤프 (0)종료 : ");

            int menu = Integer.parseInt(br.readLine());
            if (menu == 0){
                break;
            }

            int x;
            switch (menu){
                case 1:
                    System.out.print("데이터 : ");
                    x = Integer.parseInt(br.readLine());
                    try {
                        exam.enque(x);
                    } catch (P160Q5.OverflowIntQueueException e) {
                        System.out.println("큐가 가득 찼습니다.");
                    }
                    break;
                case 2:
                    try {
                        x = exam.deque();
                        System.out.println("디큐한 데이터는 " + x + "입니다.");
                    } catch (P160Q5.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;
                case 3:
                    System.out.print("데이터 : ");
                    x = Integer.parseInt(br.readLine());
                    int result = exam.search(x);
                    if (result == 0){
                        System.out.println("해당 데이터는 존재하지 않습니다.");
                    }else {
                        System.out.println("검색한 데이터는 " + result + "번째에 있습니다.");
                    }
                    break;
                case 4:
                    exam.dump();
                    System.out.println();
                    break;
            }
        }
    }
}
