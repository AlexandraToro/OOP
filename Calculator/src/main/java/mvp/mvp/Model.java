package mvp.mvp;

public class Model {

    private int first;
    private int second;
    public void setFirst(int first) {
        this.first = first;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public int getSum() {
        return first + second;
    }
    public int getMultiplication() { return first*second; }
    public int getDivision(){ return first/second; }
    public int getDifference(){ return first-second; }
    public double getExponentiation() { return Math.pow(first,second); }

    public static void main(String[] args) {
        Model sumModel = new Model();

        sumModel.setFirst(1);
        sumModel.setSecond(1);
        if (sumModel.getSum() != 2) {
            throw new AssertionError("Incorrect test result");
        }
        if (sumModel.getDifference() != 0){
            throw new AssertionError("Incorrect test result");
        }
        if (sumModel.getDivision() != 1){
            throw new AssertionError("Incorrect test result");
        }
        if (sumModel.getMultiplication() != 1){
            throw new AssertionError("Incorrect test result");
        }
        if (sumModel.getExponentiation() != 1){
            throw new AssertionError("Incorrect test result");
        }

        // А написанное условие в одну строчку это перегруз?
        sumModel.setFirst(1);
        sumModel.setSecond(2);
        if (sumModel.getSum() != 3 || sumModel.getDivision() != (-1) || sumModel.getMultiplication() != 2 || sumModel.getExponentiation() != 1 || sumModel.getDivision() != 0) {
            throw new AssertionError("Incorrect test result");
        }

        sumModel.setFirst(2);
        sumModel.setSecond(3);
        if (sumModel.getSum() != 5) {
            throw new AssertionError("Incorrect test result");
        }


    }
}
