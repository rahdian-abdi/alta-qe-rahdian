package res;

import java.util.Scanner;
public class NumberFactor {
    private static void factorial(int num){
        for (int i=1 ; i <= num ; i++){
            if (num%i != 0){
                continue;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input number : ");
        int num = input.nextInt();
        factorial(num);
    }
}
