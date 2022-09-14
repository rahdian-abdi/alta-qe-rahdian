package res;

import java.util.Scanner;

public class Palindrome {
    private static boolean isPalindrome(String str){
        String reversedStr = "";
        for (int i=0 ; i < str.length() ; i++){
            reversedStr = str.charAt(i) + reversedStr;
        }

        if (str.toLowerCase().equals(reversedStr.toLowerCase())){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input String: ");
        String str = input.nextLine();
        boolean result = isPalindrome(str);
        System.out.println(result);
    }
}
