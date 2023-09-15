package refactoring.after.v1;

public class NewSumCulculator {
    public static int newSumCulculator(String strValue){
        if(isBlank(strValue)){
            return 0;
        }
        return sum(toInts(splite(strValue)));
    }

    private static boolean isBlank(String strValue){
        return strValue == null || strValue.isEmpty();
    }

    private static String[] splite(String strValue){
        return strValue.split("[.:]");
    }

    private static int[] toInts(String[] strValues){
        int[] numbers = new int[strValues.length];
        for(int i = 0; i < strValues.length; i++){
            numbers[i] = Integer.parseInt(strValues[i]);
        }
        return numbers;
    }

    private static int sum(int[] numbers){
        int result = 0;
        for(int number : numbers){
            result += number;
        }
        return result;
    }
}
