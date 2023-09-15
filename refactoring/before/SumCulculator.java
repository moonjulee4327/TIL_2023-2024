package refactoring.before;

public class SumCulculator {

    public static int sumCulculator(String input){
        if(input == null || input.isEmpty()){
            return 0;
        }
        String[] strNumbers = input.split("[.:]");
        int number = 0;
        for(String strNumber : strNumbers){
            number += Integer.parseInt(strNumber);
        }

        return number;
    }
}
