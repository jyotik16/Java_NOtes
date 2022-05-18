### Types of ClassLoaders in Java

Not all classes are loaded by a single ClassLoader. Depending on the type of class and the path of class, the ClassLoader that loads that particular class is decided. To know the ClassLoader that loads a class the **getClassLoader()** method is used. All classes are loaded based on their names and if any of these classes are not found then it returns a [**NoClassDefFoundError**](https://www.geeksforgeeks.org/classnotfoundexception-vs-noclassdeffounderror-java/) or [**ClassNotFoundException**](https://www.geeksforgeeks.org/classnotfoundexception-vs-noclassdeffounderror-java/).

A Java Classloader is of **three types**:

1. **BootStrap ClassLoader:** A Bootstrap Classloader is a Machine code which kickstarts the operation when the JVM calls it. It is not a java class. Its job is to load the first pure Java ClassLoader. Bootstrap ClassLoader loads classes from the location **rt.jar**. Bootstrap ClassLoader doesn’t have any parent ClassLoaders. It is also called as the **Primodial ClassLoader**.
2. **Extension ClassLoader:** The Extension ClassLoader is a child of Bootstrap ClassLoader and loads the extensions of core java classes from the respective JDK Extension library. It loads files from **jre/lib/ext** directory or any other directory pointed by the system property **java.ext.dirs**.
3. **System ClassLoader:** An Application ClassLoader is also known as a System ClassLoader. It loads the Application type classes found in the environment variable **CLASSPATH, -classpath or -cp command line option**. The Application ClassLoader is a child class of Extension ClassLoader.

![https://media.geeksforgeeks.org/wp-content/uploads/20190417144207/java_classloader.png]()



Delegation Model

: The Java Virtual Machine and the Java ClassLoader use an algorithm called the 

Delegation Hierarchy Algorithm

 to Load the classes into the Java file.

The ClassLoader works based on a set of operations given by the delegation model. They are:

- ClassLoader always follows the **Delegation Hierarchy Principle**.
- Whenever JVM comes across a class, it checks whether that class is already loaded or not.
- If the Class is already loaded in the method area then the JVM proceeds with execution.
- If the class is not present in the method area then the JVM asks the Java ClassLoader Sub-System to load that particular class, then ClassLoader sub-system hands over the control to **Application ClassLoader**.
- Application ClassLoader then delegates the request to Extension ClassLoader and the **Extension ClassLoader** in turn delegates the request to **Bootstrap ClassLoader**.
- Bootstrap ClassLoader will search in the Bootstrap classpath(JDK/JRE/LIB). If the class is available then it is loaded, if not the request is delegated to Extension ClassLoader.
- Extension ClassLoader searches for the class in the Extension Classpath(JDK/JRE/LIB/EXT). If the class is available then it is loaded, if not the request is delegated to the Application ClassLoader.
- Application ClassLoader searches for the class in the Application Classpath. If the class is available then it is loaded, if not then a **ClassNotFoundException** exception is generated.

### JUST IN TIME COMPILER

The Just-In-Time (JIT) compiler is a an essential part of the JRE i.e. Java Runtime Environment, that is responsible for performance optimization of java based applications at run time. Compiler is one of the key aspects in deciding performance of an application for both parties i.e. the end user and the application developer.

In order to improve performance, JIT compilers interact with the Java Virtual Machine (JVM) at run time and compile suitable bytecode sequences into native machine code. While using a JIT compiler, the hardware is able to execute the native code, as compared to having the JVM interpret the same sequence of bytecode repeatedly and incurring an overhead for the translation process. This subsequently leads to performance gains in the execution speed, unless the compiled methods are executed less frequently.

- At run time, the JVM loads the class files, the semantic of each is determined and appropriate computations are performed. The additional processor and memory usage during interpretation makes a Java application perform slowly as compared to a native application.
- The JIT compiler aids in improving the performance of Java programs by compiling bytecode into native machine code at run time.
- The JIT compiler is enabled throughout, while it gets activated, when a method is invoked. For a compiled method, the JVM directly calls the compiled code, instead of interpreting it.
- Bu using threshold value identify the most use Code in Program ,During run time directly call the complied code.