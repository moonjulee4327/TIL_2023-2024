package refactoring.after.v2;

public class Positive {
    private int number;

    public Positive(String strNum) {
        this(Integer.parseInt(strNum));
    }

    public Positive(int number) {
        if(number < 0){
            throw new RuntimeException();
        }
        this.number = number;
    }

    public Positive add(Positive other){
        return new Positive(this.number + other.number);
    }

    public int getNumber() {
        return number;
    }
}
