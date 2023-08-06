import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        
        Map<String, String> singohan = new HashMap<>();
        Map<String, Integer> singodang = new HashMap<>();
        Set<String> removeReport = new HashSet<>();
        Map<String, Integer> mailReturn = new HashMap<>();

        for(int i = 0; i < id_list.length; i++){
            singohan.put(id_list[i], "");
            singodang.put(id_list[i], 0);
            mailReturn.put(id_list[i], 0);
        }

        removeReport.addAll(Arrays.asList(report));

        report = removeReport.toArray(new String[0]);

        for(int i = 0; i < report.length; i++){
            String[] reportStr = report[i].split(" ");
            for(int j = 0; j < reportStr.length - 1; j++){
                String singohanVal = singohan.get(reportStr[0]);
                singohan.put(reportStr[0], singohanVal + " " + reportStr[1]);

                int singodangVal = singodang.get(reportStr[1]);
                singodang.put(reportStr[1], singodangVal + 1);
            }
        }

        answer = new int[id_list.length];

        for(int i = 0; i < singodang.size(); i++){
            if(singodang.get(id_list[i]) >= k){
                for(int j = 0; j < singohan.size(); j++){
                    String[] singohanStr = singohan.get(id_list[j]).split(" ");
                    for(int a = 0; a < singohanStr.length; a++){
                        if(singohanStr.equals("")){
                            continue;
                        }

                        if(singohanStr[a].equals(id_list[i])){
                            answer[j] = answer[j] + 1;
                        }
                    }
                }
            }
        }
        
        return answer;
    }
}