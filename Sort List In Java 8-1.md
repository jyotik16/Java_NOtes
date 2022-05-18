#### anonymous class vs lambda vs method reference

```scala
//anonymous class*****************
		countryList.stream().forEach(	
		   new Consumer<String>() {		
		               @Override		
		               public void accept(String country) {		
		                           System.out.print(country+" ");		
		               } 	
		});

//lamdba******************

System.out.println();

countryList.stream().forEach(country->System.out.print(country+" "));

//method expression*****************

System.out.println();

countryList.stream().forEach(System.out::print);
```

#### Get Duplicate list And list without Duplicate

```javascript
private static void getDuplicate() {

List<Integer> myList2 = Arrays.asList(10,15,8,49,25,98,98,32,15);
  
    Set<Integer> set2 = new HashSet<>();
    System.out.print("@@");
   List<Integer> withoutDuplicates =  myList2.stream()
           			.filter(n -> set2.add(n))
           			.map(n->n)         																		.collect(Collectors.toList());
   System.out.println(withoutDuplicates);
   
   Set<Integer> set3 = new HashSet<>();
   List<Integer> onlyuplicates =  myList2.stream()
				.filter(n -> !set3.add(n))
				.map(n->n)
				.collect(Collectors.toList());
   System.out.println(onlyuplicates);
   }
```
```scala
[10,15,8,49,25,98,32,15]
@@
[98]
```

##### Find out the distinct words from the string?

```javascript
String input = "Java Hungry Hungry Hungry Blog Alive is Awesome";		
					String[] arr = input.split(" ");
					List<String> mylist = Arrays.asList(arr);
					mylist.stream().distinct().forEach(System.out::println);
					System.out.println("@@@@@@@@@@@@@@@@@@@");	
					Set<String> mySet = 			     	mylist.stream().collect(Collectors.toSet());
									mySet.forEach(System.out::println);
```
```scala
Java
Hungry
Blog
Alive
is
Awesome
@@@@@@@@@@@@@@@@@@@
[Java,Hungry,Blog,Alive,is,Awesome]
```

#### this() Vs super()
```java
static class demo {

        demo(){
              System.out.println("demo 1");
  }
  demo(String s){
              System.out.println("demo 2");
  }
  static class test extends demo{

      String str;
      test(){  	this("Hey");
                  System.out.println("test 1");
      }

      test(String s){
      // this(); // this make to call no arg constructor of both class

      // If this is comment then by default only super class no arg constructor invoked

      //super(); //  this make of call no-arg constructor of super class only

        System.out.println("test 2 "+s);

      }

  }

```

#### Count the no of characters present in the String

```scala
	  	
String input = "aaabbccdfe";

        Map<Character, Long> map2 = input.codePoints()//streams
                 .mapToObj(s -> Character.valueOf((char) s)) 
                 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, 					Collectors.counting()));

	  	 Map<Character, Long> map = input.chars()//streams
                   .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase  
                    .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, 					Collectors.counting()));

  	 for(Entry<Character, Long> xx:map2.entrySet()) {
       System.out.print(xx.getKey()+"->"+xx.getValue()+", ");
      }
```
```scala
a->3, b->2, c->2, d->1, f->1, e->1, 
[d, f, e]
```

#### Find non repeat character by using above code

```java
//now find the only non repeated character
      List<Character> list = map.entrySet().stream()

      .filter(e->e.getValue()==1)

      .map(e->e.getKey())

      .collect(Collectors.toList());

      System.out.println();

      System.out.println(list);
Output:
[d, f, e]
```


####  Map Vs FlatMap

```scala
/MAP vs FLATMAP

 List<List<Integer> > number = new ArrayList<>();
number.add(Arrays.asList(1, 2));        number.add(Arrays.asList(3, 4));
number.add(Arrays.asList(5, 6));        number.add(Arrays.asList(7, 8));

System.out.println("List of list-" + number);

// using flatmap() to flatten this list

List<Integer> flatList = number.stream().flatMap(L -> L.stream()).collect(Collectors.toList());

System.out.println("List generate by flatMap-"+ flatList);
```

```scala
List of list-[[1, 2], [3, 4], [5, 6], [7, 8]]
List generate by flatMap-[1, 2, 3, 4, 5, 6, 7, 8]
```

#### Print Numbers start with '1'

```scala
List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);

myList.stream()
    .map(s -> s + "")
    .filter(s -> s.startsWith("1"))
    .forEach(System.out::println);
```

```scala
number start with 1
10
15
```

### Find Nth Highest Salary

```scala
private static void NthHighstSalary() {
   List<employee> emp = new ArrayList<>();

          emp.add(new employee(1,80000));
          emp.add(new employee(2,87000));
          emp.add(new employee(3,90000));
          emp.add(new employee(4,70000));      
     //Method - 1      

          Optional<employee> nthsalaryEmp = emp.stream()
                .sorted(Comparator.comparingDouble(employee::getSalary).reversed()
                   .skip(1).findFirst();
          System.out.println(nthsalaryEmp); 
     }

    private static void StreamMethodDemo() {

          	List<Integer> list =Arrays.asList(1,2,3,4,5);
     		Optional<Integer> ans = list.stream().reduce((a,b)->a>b?a:b);
    		System.out.println(ans);
   }


```





