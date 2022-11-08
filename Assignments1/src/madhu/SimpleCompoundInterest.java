package madhu;
import java.util.*;
import java.lang.Math;

public class SimpleCompoundInterest {

	public static void main(String[] args) {
		int p , r , n = 3; 
		double SI , CI;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal value:");
		p = sc.nextInt();
		System.out.println("Enter the rate of interest:");
		r = sc.nextInt();
		
		 SI = (p*r*n)/100;
		 System.out.println("The simple interest for the given values is:"+SI);
		 CI = p*(1+(r/100))^n-p;
		 System.out.println("The compound interest for the given values is:"+CI);
	

	}

}
