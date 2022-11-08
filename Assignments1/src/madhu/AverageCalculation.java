package madhu;
import java.util.*;

public class AverageCalculation {

	public static void main(String[] args) {
		int a[]= {99,98,97};
		int b[]= {96,95,94};
		int c[]= {93,92,91};
		int total1=0,total2=0,total3=0,grandtotal=0;
		double avg1=0,avg2=0,avg3=0 , finalavg=0;
		for(int i = 0;i<a.length;i++) {
			total1 = a[0]+a[1]+a[2];
			avg1 = total1/3;
			
		}
		System.out.println("Total of student A is:"+total1);
		System.out.println("Average :"+avg1);
		for(int j = 0;j<b.length;j++) {
			total2 = b[0]+b[1]+b[2];
			avg2 = total2/3;
			
		}
		System.out.println("Total of student B is:"+total2);
		System.out.println("Average : "+avg2);
		for(int k = 0;k<c.length;k++) {
			total3 = c[0]+c[1]+c[2];
			avg3 = total3/3;
			
		}
		System.out.println("Total scored by student C is:"+total3);
		System.out.println("Average :"+avg3);
		for(int m = 0 ;m<3;m++) {
			grandtotal= total1+total2+total3;
			finalavg = (avg1+avg2+avg3)/3;
			
		}
		System.out.println("Total marks scored by all the students is:"+grandtotal);
		System.out.println("Average:"+finalavg);
		
		



		

	}

}
