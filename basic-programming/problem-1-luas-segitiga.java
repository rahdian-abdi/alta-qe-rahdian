package res;

import java.util.Scanner;
// INVOKE CLASS
public class TriangleArea {
    // INVOKE METHOD
    private static float calculateLuas(float a, float b){
        return 0.5f * a * b;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Input Base: ");
        float base = input.nextFloat();
        System.out.println("Input Height: ");
        float height = input.nextFloat();
        float result = calculateLuas(base,height);
        System.out.println("Triangle area: " + result);
    }

}
