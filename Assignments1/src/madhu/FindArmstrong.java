package madhu;
import java.util.*;

public class FindArmstrong {

	public static void main(String[] args) {
		
		int number , temp , result , my_num=0;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		temp = number;
		System.out.println("The given number is:" +temp);
		
		while(temp !=0) {
			result = temp % 10;
			my_num += result *result*result;
			temp = temp / 10;
			
		}	
		if(my_num == number) {
			System.out.println("The given number is an armstrong number");
		}
		else
		{
			System.out.println("The given number is not an armstrong number");
		}

	}

}
