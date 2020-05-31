package collectionQues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class LinkedListReverse {

	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<>();
		l.add(1); 
		l.add(2);
		l.add(3);
		l.add(5);
		l.set(2,4);
		l.add(3, 6);
		//fun1(l);
		fun2();
	}

	private static void fun2() {
		 ArrayList<Object> al = new ArrayList<Object>();
		    al.add('a');
		    al.add('b');
		    al.add('c');
		    al.add('b');
		    al.add("asd");
		    al.add(12);
		    al.add(12);
		    //TreeSet<Object> ss = new TreeSet<Object>(al); only allow homogenous element
		    HashSet<Object> hs = new HashSet<>(al);
		    //System.out.println(ss);
		    System.out.println(hs); //a b c asd 12
	}

	private static void fun1(LinkedList<Integer> l) {
		
		for(int i=0;i<l.size()/2;i++) {
			Integer tem = l.get(i);
			l.set(i, l.get(l.size()-1-i));
			l.set(l.size()-1-i, tem);
		}
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);
	}
}
