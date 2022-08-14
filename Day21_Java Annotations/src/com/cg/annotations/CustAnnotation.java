package com.cg.annotations;
//import java.lang.annotation.ElementType;
//import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
//custom annotation
@interface OwnCustom
{
	int accept();
}
class C
{
	@OwnCustom(accept=35)
	public void display()
	{
		System.out.println("I am using Custom Annotation");
	}
}
public class CustAnnotation {

	public static void main(String[] args) throws Exception
	{
		C c=new C();
		Method m=c.getClass().getMethod("display");   //Method is predefines class in java annotation
		OwnCustom obj= m.getAnnotation(OwnCustom.class);
		System.out.println(obj.accept());
		c.display();
	}
}
