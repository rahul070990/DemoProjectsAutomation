package DemoProjectSelenium.DemoProjectSelenium;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class TxtFileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String filePath="C:\\Users\\rahul-shar\\Documents\\SeleniumCourse\\Automation\\fileRead\\content.txt";
		FileReader fr= new FileReader(filePath);
		//FileinputSTream
		BufferedReader br=new BufferedReader(fr);
	
		
		String str;
		//Set<String> hash=new HashSet<String>();
		while((str = br.readLine()) != null) {
		
			System.out.println(str);
			
		}
	

	}

}
