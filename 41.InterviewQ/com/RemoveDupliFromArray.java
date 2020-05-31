package com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

class RemoveDupliFromArray{

public static void main(String []args){

int ar[] = {7,2,4,2,6,1};

int res[] = Dupli(ar);
for(int rr:res) {
	System.out.print(rr+",");
}
}

public static int[] Dupli(int[] ar){

HashMap<Integer,Integer> hr = new HashMap<>();

for(int i=0;i<ar.length;i++)
{
  if(!hr.containsKey(ar[i]))
	{
		hr.put(ar[i],1);
	}
}



//traverse with Iterator  you cant not get key,value differently with 
Iterator<Integer> it = hr.keySet().iterator();
while(it.hasNext()){
	System.out.print(it.next());
	
}
System.out.println();
//traverse with Set
Set<Map.Entry<Integer,Integer>> sethr = hr.entrySet();
int br[] = new int[hr.size()];
int i=0;
System.out.println(hr.size());
for(Map.Entry<Integer,Integer> EE:sethr)
{
System.out.print(EE.getKey()+"->"+EE.getValue()+" ");
br[i++] = EE.getKey();
}
System.out.println();
return br;

}

}