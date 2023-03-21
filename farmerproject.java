import java.util.Scanner;
class Farmer{
	int pa;
	float td;
	static float ri;
	float si;
	
	static {
		ri=44.4f;
	}
	
	void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("please mention the ammount requird");
		pa=scan.nextInt();
		System.out.println("please mention time duration ");
		td=scan.nextFloat();
		pa=scan.nextInt();
		System.out.println("please mention time duration ");
		td=scan.nextFloat();
		 
		 
		
	}
	void compute()
	{
		si=(pa*ri*td)/100f;
	}
	


void disp()
{
	System.out.println("SI is:" + si);
}
}
public class farmerproject{
    public static void main(String args[]) {
    	Farmer f1=new Farmer();
    	f1.input();
    	f1.compute();
    	f1.disp();
    	
    	Farmer f2=new Farmer();
    	f2.input();
    	f2.compute();
    	f2.disp();
    	
    	
    	
    }
}


