package lekcijaSesi.majasDarbs;

public class Calculator {
    int result;

    //Method for addition
    public int add(int num1, int num2) {
        result = num1 + num2;
        return result;
    }
    //Method for subtraction
    public int subtract(int num1, int num2) {
        result = num1 - num2;
        return result;
    }
    //Method for multiplication
    public int multipy(int num1, int num2) {
        result = num1 * num2;
        return result;
    }
    //Method for division
    public float divide(int num1, int num2){
        result = num1 / num2;
        return result;
    }
}

