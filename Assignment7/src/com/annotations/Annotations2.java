package com.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Info{
	int AuthorId() ;
	String Author();
	String Supervisor();
	String Date();
	String Time();
	String Description();
	double version();
}

@Info(AuthorId=01,Author="Madhu",Supervisor="Priya",Date="03-11-2022",Time="20:25",Description="This is all about annotation",version=12.0)
class Book{
	
}


public class Annotations2 {

	public static void main(String[] args) {
		Book b = new Book();
		Class c = b.getClass();
		Annotation an = c.getAnnotation(Info.class);
		Info i = (Info)an;
		System.out.println(i.Author());
		System.out.println(i.AuthorId());
		System.out.println(i.Supervisor());
		System.out.println(i.Date());
		System.out.println(i.Time());
		System.out.println(i.Description());
		System.out.println(i.version());

	}

}
