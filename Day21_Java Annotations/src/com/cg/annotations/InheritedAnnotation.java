package com.cg.annotations;
import java.lang.annotation.*;
//if we need to inherit an annotation from superclass the go with inherited annotation
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface CustomA
{
	String print() default "Shabnam"; 
}
class D
{
	@CustomA(print="Custom Annotation")
	public void display()
	{
		System.out.println("Displaying Inherited");
	}
}
class E extends D
{
	public void display1()
	{
		System.out.println("Displaying Inherited-11");
	}
}
public class InheritedAnnotation 
{
	public static void main(String[] args) 
	{
		E e=new E();
		e.display1();
		e.display();
	}
}
