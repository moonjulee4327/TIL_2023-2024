import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> numHashSet = new HashSet<Integer>();
        for(int i = 0; i < 10; i++){
            numHashSet.add(Integer.parseInt(br.readLine()) % 42);
        }
        br.close();

        System.out.println(numHashSet.size());
    }
}