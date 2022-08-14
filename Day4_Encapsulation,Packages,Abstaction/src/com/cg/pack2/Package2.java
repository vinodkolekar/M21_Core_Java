package com.cg.pack2;

//import com.cg.pack1.Package1;         //one way to import other package
import com.cg.pack1.*;                  // another way to import other package
public class Package2 {

	public static void main(String[] args) {
		Package1 p= new Package1();
		p.print();

	}

}
