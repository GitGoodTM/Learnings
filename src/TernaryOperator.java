import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args){
        // variable = (condition) ? ifTrue : ifFalse;
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        System.out.print("Enter the score: ");
        score=scanner.nextInt();
        System.out.println("You have " + ((score>=60)?((score>100)?"Entered Invalid score":"Passed"):((score<0)?"Entered invalid Score":"Failed")));
    }
}
