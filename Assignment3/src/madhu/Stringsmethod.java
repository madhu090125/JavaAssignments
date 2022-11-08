package madhu;

public class Stringsmethod {

public static void main(String[] args) {

String str="Java String pool refers to collection of strings which are stored in heap memory";
System.out.println("string is :"+str);
String str1=str.toLowerCase();
System.out.println("String in lowercase:"+str1);
String str2=str.toUpperCase();
System.out.println("String in Uppercase:"+str2);
String str3=str.replace("a", "$");
System.out.println("After replacing a as $ is:"+str3);
System.out.println(str.contains("collection"));
System.out.println(str.equals("Java String pool refers to collection of strings which are stored in heap memory"));

}

}


