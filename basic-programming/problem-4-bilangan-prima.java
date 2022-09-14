package res;

import java.util.Scanner;

public class PrimeNumber {
    private static boolean isPrimeNumber(int number){
        boolean isTrue = true;
        if (number == 0 || number == 1 ) return false;

        for (int i=2 ; i < number ; i++){
            if (number % i == 0){
                isTrue = false;
                break;
            }
        }
        return isTrue;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input number: ");
        int isPrime = input.nextInt();
        boolean result = isPrimeNumber(isPrime);
        System.out.println(result);
    }
}
