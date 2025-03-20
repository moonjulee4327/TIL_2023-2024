import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        String even = Arrays.stream(num_list).filter(n -> n % 2 == 0).mapToObj(String::valueOf).collect(Collectors.joining(""));
        String odd = Arrays.stream(num_list).filter(n -> n % 2 != 0).mapToObj(String::valueOf).collect(Collectors.joining(""));
        
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        
        return answer;
    }
}