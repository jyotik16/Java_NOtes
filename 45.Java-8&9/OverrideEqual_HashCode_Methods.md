**The general contract of hashCode is:**

> During the execution of the application, if hashCode() is invoked more than once on the same Object then it must consistently return the same Integer value, provided no information used in **equals(Object)** comparison on the Object is modified. It is not necessary that this Integer value to be remained same from one execution of the application to another execution of the same application.

> You must override hashCode() in every class that overrides equals(). Failure to do so will result in a violation of the general contract for Object.hashCode(), which will prevent your class from functioning properly in conjunction with all hash-based collections, including HashMap, HashSet, and Hashtable. (-Joshua Bloch)
> Here is the  <u>**contract**</u>, from the java.lang.Object specialization:

> Whenever it(hashcode) is invoked on the same object more than once during an execution of a Java application, the hashCode method must consistently return the same integer, provided no information used in equals comparisons on the object is modified. This integer need not remain consistent from one execution of an application to another execution of the same application.
> If two objects are equal according to the equals(Object) method, then calling the hashCode method on each of the two objects must produce the same integer result.

> It is not required that if two objects are unequal according to the equals(java.lang.Object) method, then calling the hashCode method on each of the two objects must produce distinct integer results. However, the programmer should be aware that producing distinct integer results for unequal objects may improve the performance of hashtables.
>
---
**Note: Equal objects must produce the same hash code as long as they are equal, however unequal objects need not produce distinct hash codes.**

###  Case 1: Override Equal Methods Only
```
@Override
    public boolean equals(Object obj)
    {
       // if both the object references are 
       // referring to the same object.
       if(this == obj)
            return true;
            
        // it checks if the argument is of the 
        // type Geek by comparing the classes 
        // of the passed argument and this object.
        // if(!(obj instanceof Geek)) return false; ---> avoid.
        if(obj == null || obj.getClass()!= this.getClass())
            return false;
            
        // type casting of the argument.    
        Geek geek = (Geek) obj;
            
        // comparing the state of argument with 
        // the state of 'this' Object.
        return (geek.name.equals(this.name) && geek.id == this.id);
    } 
    
    public static void main (String[] args) 
    {
          
        // creating two Objects with 
        // same state
        Geek g1 = new Geek("aditya", 1);
        Geek g2 = new Geek("aditya", 1);
          
        Map<Geek, String> map = new HashMap<Geek, String>();
        map.put(g1, "CSE");
        map.put(g2, "IT");
          
        for(Geek geek : map.keySet())
        {
            System.out.println(map.get(geek).toString());
        }
  
    }
    CSE
	IT
```
If we only override equals(Object) method, when we call map.put(g1, “CSE”); it will hash to some bucket location and when we call map.put(g2, “IT”); it will hash to some other bucket location because of different hashcode value as hashCode() method has not been overridden.

![equal](https://media.geeksforgeeks.org/wp-content/uploads/hashcoe_1.png)

### Case 2: Override HashCode  Methods Only

```
Map map = new HashMap();
map.put(“xyz”, “CSE”);
map.put(“xyz”, “IT”);

```

When we call **map.put(“xyz”, “CSE”);** it will generate hashcode value and stores it to the bucket location that is specified with this address (hashcode value). And when we call **map.put(“xyz”, “IT”);** it generates same hashcode value as previous entry since key objects are same and hashCode() method has been overridden. So it should replace first with second as per rule. But it didn’t. Reason is, when it iterate through that bucket and seeks to find k such that k.equals(“xyz”) i.e. if searching key already exist.  But it fails to find because equals(Object ) method has not been overridden. It is violation of rule of hashing.



![hashcode_3](https://media.geeksforgeeks.org/wp-content/uploads/hashcode_3.png)

###  Case 3: Override both Methods

```
IT

```

In this case we override both methods properly.
When we call **map.put(g1, “CSE”);** it will hash to some bucket location and when we call **map.put(g2, “IT”);**, it will generates same hashcode value (same as g1) and replace first value by second value because while iterating over same bucket it found a k such that k.equals(g2) is true, means searching key already exist. So, it replaces old value of that key by new value.
