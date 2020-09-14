#### 1. Django 
```
is a high-level Python Web framework that encourages rapid development and clean, pragmatic design.
Django uses Model View Template design pattern for organization. MVT organized all information within 
the framework itself, It's stateless and responds easier to new applications.

Django handles down for security.

Django usese an in-house template system that helps reduce the amount of time you spend choosing the 
right one. It gets you up and running pretty quickly with plenty of documentation to help you make those decisions.

Is friendly for beginners
```
#### 2. Node.js 

```
uses an event-driven, non-blocking I/O model that makes it lightweight and efficient, perfect for data-intensive real-time 
applications that run across distributed devices.

Node.js, developed primarily in JavaScript, uses an event-driven, single-threaded, non-blocking I/O model. This makes it 
incredibly efficient and lightweight. Perfect for very data-intensive applications that need to operate in real-time across 
distributed devices.

Non-blocking I/O: This is a very important concept to understand when learning about Node.js. This system allows a thread to 
work on another task while it is waiting for a different task to be completed. In other words, new tasks are not blocked while 
waiting for other tasks to finish. How is this accomplished? Node.js relies on asynchronous functions.

The benefit of this is that only one thread is being used, and as a result, we have low memory utilization. Node.js 
is single-threaded. Also, you don’t have to worry about the problems associated with managing multiple threads — whereas, 
in the Spring Boot world, Java web applications are used to running everything on multiple threads.

```

#### 3. Spring
```
A key element of Spring is infrastructural support at the application level: Spring focuses on the "plumbing" of enterprise 
applications so that teams can focus on application-level business logic, without unnecessary ties to specific deployment 
environments.

multi-threaded. This is very useful when dealing with long or repetitive operations. When the main thread is consumed, others 
are used concurrently.

```

#### conclusion:

```
 If I’m building an application that depends on a ton of I/O (FinTech, booking systems, media apps, etc.), I’ll use Node.js. 
 But if I need my application to do a crazy amount of computing (IoT, ecommerce platforms, Big Data), you better believe 
 I’m going with Spring Boot.
```
