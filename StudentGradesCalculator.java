  import java.util.Scanner;
public class StudentGradesCalculator
{
    
	public static void main(String[] args) {
	  
		Scanner input = new Scanner (System.in);
        // variables
        int sum =0 ;
       
		System.out.print("Enter the grade of the first subject  ");
		int grade1 = input.nextInt();
		
		System.out.print("Enter the grade of the second subject  ");
		int grade2 = input.nextInt();
		
		System.out.print("Enter the grade of the third subject ");
		int grade3 = input.nextInt();
		
		sum = grade1 + grade2 + grade3 ; 
		System.out.println("Sum :" + sum);
		
		double avg = sum/3 ;
		System.out.println("Average :"+ avg);
		if(avg>= 85)
		System.out.println("Grade : Excellent");
		else if (avg>=70)
		System.out.println("Grade : Good ");
		else 
		System.out.println("Grade : Needs improvement");
		
		
	}
}