package com.cg.lamexp;
import java.util.*;

public class CollectionLambdaExpression {

	public static void main(String[] args) {
		LinkedList<Integer>obj=new LinkedList<Integer>();
		obj.add(11);
		obj.add(22);
		obj.add(33);
		obj.add(44);
		System.out.println(obj);
		//Lambda Expression
		obj.forEach((i)->
		{
			System.out.println(i);
		});
	}
}
