package com.cg.annotations;
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented 
@interface Custom
{
	//abstract method
	//multi-value annotation example as it contains more than one method
	String print() default "Shabnam"; //here we cannot define any method inside custom annotation because they are abstract method
	int speed() default 5;
	float percentage() default 20.33f;
}
class B
{
	@Custom (print="Custom Annotation",speed=50,percentage=88.9f)
	public void display()
	{
		System.out.println("Struggle");
	}
}
public class CustomAnnotation {

	public static void main(String[] args) throws Exception{
		B b=new B();
		Method m=b.getClass().getMethod("display");   //Method is predefines class in java annotation
		Custom obj= m.getAnnotation(Custom.class);
		System.out.println(obj.print());
		System.out.println(obj.speed());
		System.out.println(obj.percentage());
		b.display();
	}
}
