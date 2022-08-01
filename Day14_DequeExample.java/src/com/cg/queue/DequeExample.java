package com.cg.queue;

import java.util.Deque;
import java.util.ArrayDeque;

public class DequeExample {

	public static void main(String[] args) {
		Deque d=new ArrayDeque();
		d.add(11);
		d.addFirst(13);
		d.addLast(7);
		d.add("vinod");
		d.add("vk");
		System.out.println(d);
		d.removeFirst();
		d.removeLast();
		System.out.println(d);

	}

}
