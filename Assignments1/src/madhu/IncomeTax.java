package madhu;
import java.util.*;

public class IncomeTax {

	public static void main(String[] args) {
		double ctc , tax;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the CTC value:");
		ctc = sc.nextDouble();
		
		if(ctc>=0 && ctc<=180000) 
		{
			tax = 0;
			System.out.println("No need to pay tax");
		}
		if(ctc>=180001 && ctc<=300000) 
		{
			tax = 0.1*(ctc - 180000);
			System.out.println("Tax="+tax);
		}
		if(ctc>=300001 && ctc<=500000) 
		{
			tax = 0.2*(ctc-300000);
			System.out.println("Tax amount = "+tax);
		}
		if(ctc>=500001 && ctc<=1000000) 
		{
			tax = 0.3*(ctc-500000);
			System.out.println("Tax amount= "+tax);
		}

	}

}
