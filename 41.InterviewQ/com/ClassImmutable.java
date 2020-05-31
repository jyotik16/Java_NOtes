package com;

import java.util.HashMap;
import java.util.Iterator;

public class ClassImmutable {
		private final int id;	
		private final String name;	
		private final HashMap<String,String> testMap;
		final int[] ar;
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		/**
		 * Accessor function for mutable objects
		 */
		public HashMap<String, String> getTestMap() {
			return testMap; //return actual ref {1=first, 2=second, 4=new}
			//return (HashMap<String, String>) testMap.clone(); //{1=first, 2=second}
		}
		public int[] getTestAR() {
			return ar; 
			//return ar.clone();
		}

		/**
		 * Constructor performing Deep Copy
		 * @param i
		 * @param n
		 * @param hm
		 */
		
		public ClassImmutable(int i, String n, HashMap<String,String> hm,int[] ar){
			System.out.println("Performing Deep Copy for Object initialization");
			this.id=i;
			this.name=n;
			//this.ar=ar
			int []res = new int[ar.length];
			for(int j=0;j<ar.length;j++) {
				res[j]=ar[j];
			}
			this.ar=res;
			HashMap<String,String> tempMap=new HashMap<String,String>();
			String key;
			Iterator<String> it = hm.keySet().iterator();
			while(it.hasNext()){
				key=it.next();
				tempMap.put(key, hm.get(key));
			}
			this.testMap=tempMap;
		}
		
		
		/**
		 * Constructor performing Shallow Copy
		 * @param i
		 * @param n
		 * @param hm
		 */
		/**
		public ClassImmutable(int i, String n, HashMap<String,String> hm){
			System.out.println("Performing Shallow Copy for Object initialization");
			this.id=i;
			this.name=n;
			this.testMap=hm;
		}
		*/
		
		/**
		 * To test the consequences of Shallow Copy and how to avoid it with Deep Copy for creating immutable classes
		 * @param args
		 */
		public static void main(String[] args) {
			HashMap<String, String> h1 = new HashMap<String,String>();
			h1.put("1", "first");
			h1.put("2", "second");		
			String s = "original";		
			int i=10;
			int [] ar= {1,2,3};
			ClassImmutable ce = new ClassImmutable(i,s,h1,ar);
			
			//Lets see whether its copy by field or reference
			System.out.println(s==ce.getName());
			System.out.println("h1="+(h1 == ce.getTestMap())); //false
			//print the ce values
			System.out.println("ce id:"+ce.getId());
			System.out.println("ce name:"+ce.getName());
			System.out.println("ce testMap:"+ce.getTestMap());
			
			System.out.println("ar="+(ar == ce.getTestAR()));
			
			for(int a:ar) {
				System.out.println(a);
			}
			//change the local variable values
			i=20;
			s="modified";
			h1.put("3", "third");
			//print the values again
//			System.out.println("ce id after local variable change:"+ce.getId());
//			System.out.println("ce name after local variable change:"+ce.getName());
//			System.out.println("ce testMap after local variable change:"+ce.getTestMap());
//			
			HashMap<String, String> hmTest = ce.getTestMap();
			hmTest.put("4", "new");
//			
			System.out.println("ce testMap after changing variable from accessor methods:"+ce.getTestMap());

		}


	}


