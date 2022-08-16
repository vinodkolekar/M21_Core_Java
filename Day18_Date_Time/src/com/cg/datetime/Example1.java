package com.cg.datetime;

import java.time.*
;

public class Example1 {

	public static void main(String[] args) {
		LocalDate l= LocalDate.now();
		LocalTime t= LocalTime.now();
		LocalDateTime dt= LocalDateTime.now();
		LocalDate l1= LocalDate.of(1997, Month.MAY,15);
		
		System.out.println(l);
		System.out.println(t);
		System.out.println(dt);
		System.out.println(l1 );

	}

}
