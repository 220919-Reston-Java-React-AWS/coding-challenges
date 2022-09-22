## Duration
30 minutes

## Challenge
Given a int n, write a conditional block that will return
- "Weird" if n is odd
- "Not Weird" if n is even AND between 2 and 5 (inclusive)
- "Weird" if n is even AND between 6 and 20 (inclusive)
- "Not Weird" if n is even AND greater than 20

## Code Template
```java
public static void main(String[] args) {
    String output1 = weirdOrNotWeird(101); // Weird
    String output2 = weirdOrNotWeird(2); // Not Weird
    String output3 = weirdOrNotWeird(14); // Weird
    String output4 = weirdOrNotWeird(32); // Not Weird

    // ...
}

public static String weirdOrNotWeird(int n) {
    // ...
}
```
  
## Examples
```java
//Sample Input
int n = 101;

//Expected Output
Weird
```

```java
//Sample Input
int number = 2;

//Expected Output
Not Weird
```

```java
//Sample Input
int number = 14;

//Expected Output
Weird
```

```java
//Sample Input
int number = 32;

//Expected Output
Not Weird
```