package res;

import java.util.Scanner;

public class DrawXYZ {
    private static void drawXyz(int num){
        // ch will be reset
        char ch;
        for (int i=1 ; i <= Math.pow(num,2) ; i++){
            if(i % 2 == 0 && i % 3 == 0){
                ch = 'X';
            } else if(i % 3 == 0){
                ch = 'X';
            } else if (i % 2 == 0){
                ch = 'Z';
            } else {
                ch = 'Y';
            }
            System.out.print(ch);
            if (i%num == 0){
                System.out.println("");
            }
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input number: ");
        int num = input.nextInt();
        drawXyz(num);
    }
}
