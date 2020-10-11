 1. syntax
 ```java
  FC: plain javascript function which accepts props as argument and returns a React element
  CC: extends from React.Component, create a render function which returns a React element.
 ```
 2. state
 ```java
  FC: stateless, if you need a state, either use a class component, or use FC with providing state through props
 ```
 3. lifecycle hooks
 ```java
 FC: cannot use lifecycle hooks
 ```
 
 4. conclusion
 ```
  4.1 FC is easier to read and test
  4.2 FC is less code
  4.3 FC gets easier to separate container and presentational components
  4.4 There will be performance boost for FC in future React versions
 ```
