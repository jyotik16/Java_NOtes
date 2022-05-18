###Hash Table Vs HashMap Vs Synchronized HashMap Vs Concurrent HashMap

| Properties                               | Hash Table(1.1)            | HashMap(1.2)                             | Synchronized(1.2)                        | Concurrent(1.5)                          |
| ---------------------------------------- | -------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| Interface implements                     | Serializable,Cloneable,Map | Serializable,Cloneable,Map               | Serializable,Cloneable,Map               | Serializable,Cloneable,Map               |
| Null                                     | Not allow                  | one Key, Many Values                     | One Key,Many Values                      | Not Allow                                |
| Synchronization                          | All operations             | Not                                      | All Operations                           | Only Write Operation                     |
| Threads No.                              | One Thread                 | Multiple Threads                         | One Thread                               | 16 Threads perform write operations , Many Thread Do Read Operations |
| Locking                                  | Object Level               | No Lock(Not a Thread Safe)               | Object Level                             | Segment Level                            |
| Iterator(Concurrent Exception is Present ) | No , Fail Safe             | Fail Fast (Performance wise Fast But Throw Exception) | Fail Fast (Performance wise Fast But Throw Exception) | No,Fail Safe(No Exception)               |
| When To Use                              | Legacy (Multiple)          | Single Thread Environment                | Multithreaded Environment                | Multithreaded Environment                |



###Difference Between Hashmap and ConcurrentHashMap

HashMap is a powerful data structure in Java used to store the key-pair values. It maps a value by its associated key.. Whereas, ConcurrentHashMap is introduced as an alternative to the HashMap. The [ConcurrentHashMap](https://www.javatpoint.com/java-concurrenthashmap) is a synchronized collection class.

|                 HashMap                  |            ConcurrentHashMap             |
| :--------------------------------------: | :--------------------------------------: |
| The [HashMap](https://www.javatpoint.com/java-hashmap) is non-thread-safe and can not be used in a Concurrent multi-threaded environment. | ConcurrentHashMap is a thread-safe and specially designed for use in multi-threaded and Concurrent environment. |
| It allows us to store the null values and null keys. | It dose not allows us to store the null values and null keys. |
| It is a non-synchronized class of Java collection | It is a synchronized class of Java collection |

- As discussed above, the HashMap is a non-synchronized and non-Thread safe, while the ConcurrentHashMap is a synchronized and Thread-safe collection class. Though the ConcurrentHashMap can not match the synchronization level of Hashtable, it performs well for most of the practical cases.
- The HashMap can be synchronized using the **Collection.syncronizedMap;** It returns a collection that is almost equal to Hashtable.
- The synchronized HashMap is less scalable than the ConcurrentHashMap.
- In the multi-threaded environment, The ConcurrentHashMap has improved performance than Synchronized HashMap.
- In the single-threaded environment, The HashMap is slightly better than ConcurrentHashMap.
- In HashMap, if one thread is iterating the object and the other thread wants to modify the objects, we will get a **ConcurrentModificationException** runtime exception. But, in ConcurrentHashMap, one thread can perform modification while the other thread is running.
- The HashMap is introduced in Java 2 (JDK 1.2) & ConcurrentHashMap is introduced in Java 5 (JDK 1.5).

## Difference Between ConcurrentHashMap and SynchronizedHashMap

> SynchronizedMap and ConcurrentHashMap are **both thread safe class** and can be used in multithreaded application, the main difference between them is regarding how they achieve thread safety.
>
> 

 **ConcurrentHashMap** is thread-safe therefore multiple threads can operate on a single object without any problem. In ConcurrentHashMap, the Object is divided into a number of segments according to the concurrency level. By default, it allows 16 thread to read and write from the [Map](https://www.geeksforgeeks.org/map-interface-java-examples/) without any synchronization. In ConcurrentHashMap, at a time any number of threads can perform retrieval operation but for updating in the object, the thread must lock the particular segment in which the thread wants to operate. This type of locking mechanism is known as **Segment locking or bucket locking**. Hence, at a time16 update operations can be performed by threads.

```java
HashMap<Integer, String> hmap = new HashMap<Integer, String>(); 
        // Adding the elements using put method
        hmap.put(10, "Geeks");        hmap.put(20, "for");
        hmap.put(30, "Geeks");        hmap.put(25, "Welcome");
        hmap.put(40, "you"); 
        // Creating a synchronized map
        Map map = Collections.synchronizedMap(hmap);
        Set set = map.entrySet();

```

| ConcurrentHashMap                        | Synchronized HashMap                     |
| ---------------------------------------- | ---------------------------------------- |
| ConcurrentHashMap is a class that implements the ConcurrentMap and [serializable](https://www.geeksforgeeks.org/serializable-interface-in-java/) interface. | We can synchronize the HashMap by using the **synchronizedMap() **method of java.util.Collections class. |
| It locks some portion of the map.        | It locks the whole map.                  |
| ConcurrentHashMap allows performing concurrent read and write operation. Hence, performance is relatively better than the Synchronized Map. | In Synchronized HashMap, multiple threads can not access the map concurrently. Hence, the performance is relatively less than the ConcurrentHashMap. |
| ConcurrentHashMap doesn’t allow inserting null as a key or value. | Synchronized HashMap allows inserting null as a key. |
| ConccurentHashMap doesn’t throw ConcurrentModificationException. | Synchronized HashMap throw **ConcurrentModificationException**. |

### HashMap vs HashTable
- HashMap is non-synchronized. It is not thread-safe and can’t be shared between many threads without proper synchronization code whereas Hashtable is synchronized. It is thread-safe and can be shared with many threads.
- HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.
- HashMap is generally preferred over HashTable if thread synchronization is not needed



| Property                                 | HashSet                                  | LinkedHashSet                            |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| **Data structure**                       | It uses a Hashtable to store the elements. | It uses a HashTable and doubly linked list to store and maintain the insertion order of the elements. |
| **Technique to store the elements**      | Hashing                                  | Hashing                                  |
| **Insertion Order**                      | It does not provide any insertion order. We can not predict the order of elements. | It provides an insertion order; we can predict the order of elements. |
| **Null elements**                        | It allows only one null element.         | It also allows only one null element.    |
| **Memory**                               | It requires less memory.                 | It requires more memory than HashSet.    |
| **Performance**                          | It provides slightly faster performance than LinkedHashSet | It provides low performance than HashSet |
| **Synchronized**                         | Non-synchronized                         | Non-synchronized                         |
| **Complexity for the insertion, removal, retrieval operations** | O (1)                                    | O (1)                                    |
| **Declaration**                          | HashSet obj = new HashSet();             | LinkedHashSet obj = new LinkedHashSet(); |
| **Extends**                              | AbstractSet class                        | HashSet class                            |
| **Implements**                           | Set interface                            | Set interface                            |
| **Initial Capacity**                     | 16                                       | 16                                       |
| **Package**                              | java.util                                | Java.util                                |

## When to use HashSet and LinkedHashSet

If we are required to maintain the insertion order, then the LinkedHashSet will be useful. But, when maintaining the insertion order of the elements is not our priority, the HashSet will be useful and provide improved performance.



| ArrayList                                | LinkedList                               |
| ---------------------------------------- | ---------------------------------------- |
| 1) ArrayList internally uses a **dynamic array** to store the elements. | LinkedList internally uses a **doubly linked list** to store the elements. |
| 2) Manipulation with ArrayList is **slow** because it internally uses an array. If any element is removed from the array, all the bits are shifted in memory. | Manipulation with LinkedList is **faster** than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory. |
| 3) An ArrayList class can **act as a list** only because it implements List only. | LinkedList class can **act as a list and queue** both because it implements List and Deque interfaces. |
| 4) ArrayList is **better for storing and accessing** data. | LinkedList is **better for manipulating** data. |

## Overriding vs Overloading

1. Overriding implements **Runtime** Polymorphism whereas Overloading implements **Compile** time polymorphism.
2. The method Overriding o<u>ccurs between superclass and subclass</u>. Overloading occurs <u>between the methods in the same class.</u>
3. Overriding methods have the same signature i.e. same name and method arguments. Overloaded method names are the same but the parameters are different.
4. With Overloading, the method to call is determined at the compile-time. With overriding, the method call is determined at the runtime based on the object type.
5. If overriding breaks, it can cause serious issues in our program because the effect will be visible at runtime. Whereas if overloading breaks, the compile-time error will come and it’s easy to fix.



| Overloading                              | Overriding                               |
| :--------------------------------------- | ---------------------------------------- |
| based on Object Reference                | based on Object type                     |
| Parent P = new Child(); P.show()-:>Parent | Parent P = new Child(); P.show()-:>Child |
| Child P = new Child(); P.show()-:>Child  | Child P = new Child(); P.show()-:>Child  |
| Compile Time Polymorphism                | Runtime Time Polymorphism                |
| Occur between methods of same class      | Occur between the methods of superclass and subclass |
|                                          |                                          |
|                                          |                                          |

