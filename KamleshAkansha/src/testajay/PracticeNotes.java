package testajay;

public class PracticeNotes {
	
	public String method() {
		String a="";
		
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a=120; //-128,127
		short s=3000; //-32,768,32,767
		
		int x=10000; // -2^31,2^31-1
		
		long y = 100000L; //-2^63,2^63-1
		String d="Hello World";
		
		boolean one = false; //only contains true and false
		
		char letterA = 'A';
		
		int b=20;
		int c=50;
		
		int z=b+c;
		
		
		System.out.println(z);
		
		
		//Syntax for object creation
		ClassName object_refrence= new ClassName();
		
		Child co= new Child();/
		Parent po= new Parent();
		Parent po= new Child(); //Dynamic binding
		po.child();
		
		
		
		co.Method1();
		
		
		
		

	}

}
