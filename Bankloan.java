import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

class User {
	int pa;
	// pa = Principal Amount
	
	float td;
	// td = Time Duration
	
	static float ri;
	// ri = Rate of Interest
	float si;
	// si = Simple Interest
	static {
		ri=2.4f;
	}
	
	void input()
	{
		
			Scanner scan = new Scanner(System.in);
			
			{
		    System.out.println("Please Mention The Requird Amount");
		       pa=scan.nextInt();
	         }
		
		    {
			  Date thisDate = new Date();
		      SimpleDateFormat dateForm = new SimpleDateFormat("dd/M/y");
		         {
			    	System.out.println("Check Today's Date. Today's Date ia");
			    }
		      
		      System.out.println( dateForm.format(thisDate));
		    }
		    
		System.out.println("Please Mention Time Duration(Total Month)");
		td=scan.nextInt();
		  
	}
	void compute()
	{
		si=(pa*ri*td)/100f;
	}
	
void disp()
{
	System.out.println("SI (Simple Interest) is:" + si);
}
}
public class Bankloan {
    public static void main(String args[]) {
    	User f1=new User();
    	f1.input();
    	f1.compute();
    	f1.disp();	
    }
}


