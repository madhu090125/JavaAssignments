package madhu;
import java.util.*;

public class StudentMark {

	public static void main(String[] args) {
		int m1 , m2 , m3  ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first subject mark:");
		m1 = sc.nextInt();
		System.out.println("Enter the Second subject mark:");
		m2 = sc.nextInt();
		System.out.println("Enter the Third subject mark:");
		m3 = sc.nextInt();
		if(m1>60 && m2>60 && m3>60)
		 {
			System.out.println("Passed"); 
		 }
		if((m1<60 && (m2>60 && m3>60)) || (m2<60 && (m1>60 && m3>60)) || (m3<60 && (m1>60 && m2>60)))
		 {
			System.out.println("Promoted"); 
		 }
		if((m1>60 && (m2<60 && m3<60)) || (m2>60 && (m1<60 && m2<60)) || (m3>60 && (m1<60 && m2<60)) || (m1<60 && m2<60 && m3<60))
		 {
			System.out.println("Failed"); 
		 }
		
	}

}
