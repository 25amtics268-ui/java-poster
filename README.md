# Passing and Returning Objects in Java

A simple Java OOP example showing how to pass an object to a method, modify its fields, and return the object reference.

## Concepts covered

- Classes and objects
- Constructors
- Passing an object as a method argument
- Returning an object with `return`
- Object references in Java

## Project files

- `Student.java` — defines the `Student` class.
- `StudentDemo.java` — contains the `process()` method and `main()` method.

## Requirements

- Java JDK 17 or later (Java 8+ should also work).

## How to run

Open a terminal in this folder and run:

```bash
javac Student.java StudentDemo.java
java StudentDemo
```

## Expected output

```text
Name: Aman
Marks: 85
```

## How it works

1. `main()` creates a `Student` object with the name `Aman` and 80 marks.
2. `process(s1)` receives a copy of the reference to that object.
3. The method adds 5 to the object's marks.
4. `return student` returns a reference to the same object.
5. `s2` refers to that object, so the displayed marks are 85.

**Important:** Java is pass-by-value. When an object is passed to a method, the value copied is the object reference. A method can modify the referenced object's fields, but reassigning its parameter does not reassign the caller's variable.
