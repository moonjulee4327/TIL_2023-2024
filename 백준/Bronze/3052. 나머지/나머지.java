import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set numHashSet = new HashSet();
        for(int i = 0; i < 10; i++){
            int n = Integer.parseInt(br.readLine());
            numHashSet.add(n % 42);
        }
        br.close();

        System.out.println(numHashSet.size());
    }
}