import java.util.Scanner;

/**
 * Created by sanjaykanwar on 20/07/2015.
 */
public class StudentGrade {

    public static  void main(String[] args){
        gradeCalculation();

    }

    static void gradeCalculation(){
        int quiz;
        int midTerm;
        int finalScores;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quiz: ");
        quiz = scanner.nextInt();
        System.out.println("Enter Mid Term: ");
        midTerm = scanner.nextInt();
        System.out.println("Enter Final Scores: ");
        finalScores = scanner.nextInt();

        int total = quiz+midTerm+finalScores;
        int averageScore = (total/3);

        if(averageScore>=90){
            System.out.println("Your Grade is A ");
        }
        else if(averageScore >= 70 && averageScore < 90){
            System.out.println("Your Grade is B ");
        }
        else if(averageScore >= 50 && averageScore < 70){
            System.out.println("Your Grade is C ");
        }
        else{
            System.out.println("Your Grade is F");
        }

    }

}
