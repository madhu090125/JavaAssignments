package madhu;

public class RangeArmstrong {

	public static void main(String[] args) {
		int num1=999;
		for(int i =100;i<=num1;i++) {
			int check, mod,sum=0;
			check=i;
			while(check!=0)
			{
				mod=check%10;
				sum += mod*mod*mod;
				check = check/10;
				
			}
			if(sum == i) {
				System.out.println("Armstrong numbers are");
				System.out.println(""+i);
			}
		}

	}

}
