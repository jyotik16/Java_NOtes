package com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String args[]) {
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,9,6,0);
		System.out.println(list1);
		
		List<Integer> list2 = list1.stream().filter(i->i%2!=0).collect(Collectors.toList());
		System.out.println(list2);
		
		List<Integer> list3 = list1.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(list3);
		
		long noOfList = list1.stream().filter(i->i%2==0).count();
		System.out.println(noOfList);
		
		List<Integer> list4 = list1.stream().sorted().collect(Collectors.toList());
	//	List<Integer> list4 = list1.stream((i1,i2)->i1.compareTo(i2)).sorted().collect(Collectors.toList());
	//	List<Integer> list4 = list1.stream((i1,i2)->-i1.compareTo(i2)).sorted().collect(Collectors.toList());
//natural sorting
		System.out.println(list4);
		List<Integer> list5 = list1.stream().sorted((i1,i2)->(i1>i2)?-1:(i1<i2)?+1:0).collect(Collectors.toList()); //customized sorting
		System.out.println(list5); //Descending
		
		Comparator<String> c = (s1,s2)->{
			int l1 = s1.length();
			int l2 = s2.length();
			if(l1<l2) return -1;
			else if(l1>l2) return +1;
			else return s1.compareTo(s2);
		};
		List<String> list = Arrays.asList("A","AA","AAAA","AAA");
		List<String> list6 = list.stream().sorted(c).collect(Collectors.toList());
		System.out.println(list6);
		
		Integer min = list1.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min);
		Integer max = list1.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(max);
		
		//reverse order
		
		Integer min1 = list1.stream().min((i1,i2)->-i1.compareTo(i2)).get();
		System.out.println(min1);
		Integer max1 = list1.stream().max((i1,i2)->-i1.compareTo(i2)).get();
		System.out.println(max1);
		
	//	list.stream().forEach(System.out::print);
		
		Consumer<Integer> f = i->{
			System.out.print((i*i)+" ");
		};
		list1.stream().forEach(f);
		System.out.println();
		//same thing
		list1.stream().forEach(i->{
			System.out.print((i*i)+" ");
		});
		
		//toArray
		Integer[] i =list1.stream().toArray(Integer[]::new );
//		for(Integer I:i) {
//			System.out.println(I+" ");
//		}
		
		//<--OR-->
		Stream.of(i).forEach(System.out::println);
		Stream<Integer> s = Stream.of(9,99,9999);
		s.forEach(System.out::println);
		
		Integer[] ii = {1,2,3,4,5};
		Stream.of(ii).forEach(System.out::println);
	}
	
}
