package demo_test;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.runner.OrderWith;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute{
	int Sequence() default 1;

	
}

class MyClass{

	@Execute(Sequence=2)
	public static void myMethod1(){
		System.out.println("This is the method 2");
		}
	@Execute(Sequence=1)
	public static void myMethod2() {
		System.out.println("This is the method 1");

	}
	@Execute(Sequence=3)
	public static void myMethod3() {
		System.out.println("This is the method 3");

	}



}

public class Annotation3 {

	public static void main(String[] args) {
		MyClass c = new MyClass();
		c.myMethod2();
		c.myMethod1();
		c.myMethod3();
		/*Annotation an = c.getAnnotation(Execute.class);
		Execute e = (Execute)an;
		System.out.println(e.Sequence());*/
		

	}

}


