import java.util.Scanner;

public class StringPalondrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc= new Scanner(System.in);
	System.out.println("ENter your desired STring: ");
	
	String input= sc.next();
	String org_string=input;
	String rev="" ;
	//System.out.print(input.length());
	//System.out.print(input.charAt(0));
	
	for(int i=org_string.length()-1;i>=0;i--) {
		 
		 //System.out.println(t);
		  rev= rev + org_string.charAt(i);
		  //System.out.print(test);
	
	}
	
	
	if(org_string.equals(rev)) {
		System.out.println("String is palondrome");
	}
	else {
		System.out.println("String is not a palondrome");
	}
	
	
			
		
		
	}

}
