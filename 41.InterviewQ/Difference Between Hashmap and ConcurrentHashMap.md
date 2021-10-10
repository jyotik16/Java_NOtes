## Difference Between Hashmap and ConcurrentHashMap

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

 **ConcurrentHashMap** is thread-safe therefore multiple threads can operate on a single object without any problem. In ConcurrentHashMap, the Object is divided into a number of segments according to the concurrency level. By default, it allows 16 thread to read and write from the [Map](https://www.geeksforgeeks.org/map-interface-java-examples/) without any synchronization. In ConcurrentHashMap, at a time any number of threads can perform retrieval operation but for updating in the object, the thread must lock the particular segment in which the thread wants to operate. This type of locking mechanism is known as **Segment locking or bucket locking**. Hence, at a time16 update operations can be performed by threads.

```
HashMap<Integer, String> hmap = new HashMap<Integer, String>(); 
        // Adding the elements using put method
        hmap.put(10, "Geeks");
        hmap.put(20, "for");
        hmap.put(30, "Geeks");
        hmap.put(25, "Welcome");
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