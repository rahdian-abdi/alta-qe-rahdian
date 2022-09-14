package res;

import java.util.Scanner;
public class GradeConversion {
    private static String gradeScore(int score){
        String grade;
        if(score <= 34){
            grade = "D";
        } else if (score >= 35 && score <= 49){
            grade = "C";
        } else if (score >= 50 && score <= 64){
            grade = "B";
        } else if (score >= 65 && score <= 79){
            grade = "B+";
        } else if (score >= 80 && score <= 100){
            grade = "A";
        } else {
            return "Wrong score!";
        }
        return grade;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Input score (1 - 100): ");
        int studentScore = input.nextInt();
        System.out.println("Your grade is: " + gradeScore(studentScore));
    }

}
