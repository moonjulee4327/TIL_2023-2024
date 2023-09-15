package refactoring.after.v2;

public class New2SumCulculator {
    public static int new2SumCulculator(String strValue){
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

    private static Positive[] toInts(String[] strValues){
        Positive[] numbers = new Positive[strValues.length];
        for(int i = 0; i < strValues.length; i++){
            numbers[i] = new Positive(strValues[i]);
        }
        return numbers;
    }

    private static int sum(Positive[] numbers){
        Positive result = new Positive(0);
        for(Positive number : numbers){
            result = result.add(number);
        }
        return result.getNumber();
    }
}
