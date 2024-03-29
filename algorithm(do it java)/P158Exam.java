import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P158Exam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        P148ExamIntQueue iQue = new P148ExamIntQueue(64);

        while (true){
            System.out.println("현재 데이터 수 : " + iQue.size() + " / " + iQue.capacity());
            System.out.print("(1)인큐 (2)디큐 (3)피크 (4)덤프 (0)종료");

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
                        iQue.enque(x);
                    } catch (P148ExamIntQueue.OverflowIntQueueException e) {
                        System.out.println("큐가 가득 찼습니다.");
                    }
                    break;
                case 2:
                    try {
                        x = iQue.deque();
                        System.out.println("디큐한 데이터는 " + x + "입니다.");
                    } catch (P148ExamIntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;
                case 3:
                    try {
                        x = iQue.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (P148ExamIntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;
                case 4:
                    iQue.dump();
                    break;
            }
        }
    }
}
