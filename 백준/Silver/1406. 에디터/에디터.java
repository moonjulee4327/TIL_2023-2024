import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();

        String str = br.readLine();
        int M = Integer.parseInt(br.readLine());
        LinkedList<Character> list = new LinkedList();

        for (int i = 0; i < str.length(); i++){
            list.add(str.charAt(i));
        }

        ListIterator<Character> listIterator = list.listIterator();

        while (listIterator.hasNext()){
            listIterator.next();
        }

        for (int i = 0; i < M; i++){
            String commend = br.readLine();
            if (commend.equals("L")){
                if (listIterator.hasPrevious()){
                    listIterator.previous();
                }
            } else if (commend.equals("D")) {
                if (listIterator.hasNext()){
                    listIterator.next();
                }
            } else if (commend.equals("B")) {
                if (listIterator.hasPrevious()){
                    listIterator.previous();
                    listIterator.remove();
                }
            }else {
                listIterator.add(commend.charAt(2));
            }
        }

        for (Character c : list) {
            bw.write(c);
        }

        br.close();
        bw.flush();
        bw.close();
    }
}