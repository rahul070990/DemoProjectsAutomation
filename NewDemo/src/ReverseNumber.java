import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your no. to be reveresed: " );
		int number = sc.nextInt();
		
		int rev=0;
		
		while(number!=0) {
			rev= rev*10 + number%10; //rev=4, 40+1= 41
			number= number/10;
			
		}
		System.out.println("Your desired reversed number is: " +rev);
		
		
	}

}
