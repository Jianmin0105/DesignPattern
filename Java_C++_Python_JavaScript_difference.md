### 1. Compile language vs. Interpreted language
  - Compile: C++
    - write once, complie everywhere
  - Compile and Interpreted: Java
    - write once, complie once, run everywhere on JVM
  - Interpreted: Python, Javascript
    - Interpreter executes program directly
    ```
    In general, interpreted language runs slower than compile language.
    Interpreted language is friendly to software development productivity.
    ```
### 2. Procedure oriented vs. Object oriented 
  - Procedure oriendted: C, 
  - Object Oriented: C++, Java, Python, JavaScript
    ```
    Object Oriented programming characteristics:
      - Encapsulation
        - wrapping object fileds and methods into a single unit with proper access control. If you are creating a class, you are doing encapsulation.
      - Inheritance
        - one class aquires the properties and functionality of another class is called inheritance. Inheritance provides the idea of reusability of code and each subclass defines only thos features that are unique to it, the rest of the feature can be inherited from the parent class. 
        - single inheritance for Java: one class can extend from only one class, but can implements multiple interfaces.
        - C++ supports multi-inheritance.
      - Polymorphysim
        - it performs a single action in different ways.
      - Abstraction
        - Design level: abstract class and interface.
    ```
### 3. Strongly typed vs. weakly typed, Static typed vs. dynamic typed
  - Strongly typed: Java, C++, Python
  - weakly typed: JavaScript
  ```
    Weakly typed language allowed an implicit conversion between family-related data types (from a double to an int) but with potential data loss (since a double cannot fit into an int). 
  ```
  - Static typed: Jave, C++
  - dynamic typed: Python
  ```
  Dynamic type, all type checking is deferred until runtime where the actual types are discovered and subsequently the operation is checked for its validity.
  Static type checking is at compile time.
  ```
### 4. Garbage Collection
  - Java: deallocating memory is handled automatically by gabage collector
  - C, C++: allocating and deallocating memory is a manual process.
