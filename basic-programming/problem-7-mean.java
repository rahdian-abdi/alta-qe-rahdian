package res;

import java.util.Scanner;

public class Mean {
    public static float mean(float[] nums){
        float sum = 0;
        float mean;
        for (int i=0 ; i < nums.length ; i++){
            sum += nums[i];
        }
        mean = sum/nums.length;
        return mean;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // INPUT ARRAY LENGTH
        System.out.println("Input array length: ");
        int arrLength = input.nextInt();
        float[] arr = new float[arrLength];
        // INPUT ELEMENTS
        System.out.println("Input elements: ");
        for (int i=0 ; i < arrLength ; i++){
            arr[i] = input.nextFloat();
        }

        float result = mean(arr);
        System.out.println("Mean is: " + result);
    }
}
