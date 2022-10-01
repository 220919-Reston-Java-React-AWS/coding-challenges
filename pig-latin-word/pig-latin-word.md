## Duration
30 minutes

## Challenge
Write a method that will convert a word into pig latin.

## Examples
```
Sample Input: pigLatin("Kevin")

Sample Output: evinKay
```

## Starter Code
```java
public static String convertToPigLatin(String word) {
    // StringBuilder is essentially a mutable String (Strings themselves are not mutable)
    StringBuilder sb = new StringBuilder(word);

    // HINT: .append() and .deleteCharAt() may help to manipulate characters in the StringBuilder object

    return sb.toString();
}

```

## Topics Related To This Challenge
- String Manipulation
- StringBuilder