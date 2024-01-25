import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P144Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        P136ExamInstack s = new P136ExamInstack(64);

        while (true){
            System.out.println("현재 데이터 수 : " + s.size() + "/" + s.capacity());
            System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (5)검색 (6)모두 삭제 (7)정보 확인 (0)종료 : ");

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

                case 5:
                    System.out.print("검색할 값을 입력하세요 : ");
                    x = Integer.parseInt(br.readLine());

                    int idx = s.indexOf(x);
                    if (idx >= 0){
                        System.out.println("해당 값은 꼭대기부터 " + (s.size() - idx) + "번째에 있습니다.");
                    }else {
                        System.out.println("해당 데이터는 없습니다.");
                    }
                    break;

                case 6:
                    s.clear();
                    break;

                case 7:
                    System.out.println("용량 : " + s.capacity());
                    System.out.println("데이터 수 : " + s.size());
                    System.out.println("비어 " + (s.isEmpty() ? "있습니다." : "있지 않습니다."));
                    System.out.println("가득 " + (s.isFull() ? "찼습니다." : "차 있지 않습니다."));
                    break;
            }
        }
    }
}
