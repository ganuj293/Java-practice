// A school has following rules for grading system:
// a. Below 25 - F
// b. 25 to 45 - E
// c. 45 to 50 - D
// d. 50 to 60 - C
// e. 60 to 80 - B
// f. Above 80 - A
// Ask user to enter marks and print the corresponding grade.
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Enter your marks :");
        double marks = sc.nextInt();
        
        char grade = 'x';

        if(marks <= 100 && marks>0)
        {   if (marks<=25)
            grade = 'F';
            else if(marks >25 && marks <=45)
            grade = 'E';
            else if(marks >45 && marks <=50)
            grade = 'D';
             else if(marks >50 && marks <=60)
            grade = 'C';
            else if(marks >60 && marks <= 80)
            grade = 'B';
            else
            grade = 'A';

            System.out.println("your grade is : "+ grade);
        }
        else 
            System.out.println("you have entered wrong marks : ");
        sc.close();
    }     
}
