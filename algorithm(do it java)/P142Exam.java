import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P142Exam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        P136ExamInstack s = new P136ExamInstack(64);

        while (true){
            System.out.println("현재 데이터 수 : " + s.size() + "/" + s.capacity());
            System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (0)종료 : ");

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
                        s.push(x);
                    }catch (P136ExamInstack.OverflowIntStackException e){
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2:
                    try {
                        x = s.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    }catch (P136ExamInstack.EmptyIntStackException e){
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 3:
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    }catch (P136ExamInstack.EmptyIntStackException e){
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 4:
                    s.dump();
                    break;
            }
        }
    }
}
