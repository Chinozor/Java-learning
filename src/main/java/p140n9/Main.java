package p140n9;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
     fibonachiNubers(10);
    }
    static BigInteger secondNumber = BigInteger.ONE;
    static BigInteger firstNumber = BigInteger.ONE;
    static BigInteger  bufferNUmber = BigInteger.ZERO;
    private static void fibonachiNubers(int n){
        System.out.println("Первый член последовательнсоти Фибоначи =" + firstNumber);
        System.out.println("Второй член последовательности Фибоначи =" + secondNumber);
        for (int i = 0; i < n; i++) {
            bufferNUmber = secondNumber;
            secondNumber = firstNumber.add(secondNumber);
            firstNumber = bufferNUmber;
            System.out.println(i+3 + "ый член последовательности Фибоначи = " + secondNumber);
        }
    }

}
/*class FibonachiNubers{
    int nextNumber = 1;
    int firstNumber = 0;
    public void fibonachiNubers(int n){
        for (int i = 0; i < n; i++) {
            nextNumber = firstNumber + nextNumber;
        }
        System.out.println(nextNumber);
    }
}*/
