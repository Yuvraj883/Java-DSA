import java.io.*;
import java.util.*;

public class UserNameGenerator2
{
	public static void main (String [] args)
	{
		String secondName, firstName, date, username;
		Scanner in = new Scanner(System.in);
	//	Random r = new Random();
		
        int t = in.nextInt();
        ArrayList<String> userNames = new ArrayList<>();
        for (int i=0; i<t; i++){
		try 
		{
		//	System.out.println("Please Enter First name: ");
			firstName = in.next();
           // System.out.println("Please Enter Last Name: ");
			secondName = in.next();
			
			//System.out.println("Please DOB (DD/MM/YY): ");
		//	date = in.next();
			
			int num1 = 100 + new Random().nextInt(9000);//(Integer.parseInt(date.substring(0,2))+Integer.parseInt(date.substring(3,5))/Integer.parseInt(date.substring(7)));
			//day + month / year in order to give unique digit 
			
		//	int num2 = Integer.parseInt(date.substring(1,2));
			//to ensure username is unique
			
			username = firstName.charAt(0) +secondName.substring(0,(secondName.length())) + num1 ;
	        userNames.add(username); 
	       // System.out.println(num1);
		} catch(Exception e) 
		{
			System.out.println("Input Error");
			e.printStackTrace();
		}
		
    }
    System.out.println(userNames);
    in.close();
	}
}