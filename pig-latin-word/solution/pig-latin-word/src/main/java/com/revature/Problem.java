package com.revature;

import java.util.HashSet;
import java.util.Set;

public class Problem {

    public static String pigLatin(String word) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        StringBuilder sb = new StringBuilder(word); // "Mutable String"

        // 1st Consonant + 2nd Vowel
        if (!vowels.contains(sb.charAt(0)) && vowels.contains(sb.charAt(1))) {
            char firstChar = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(Character.toUpperCase(firstChar) + "ay");
        } else if (!vowels.contains(sb.charAt(0)) && !vowels.contains(sb.charAt(1))) { // Two consonants
            char firstChar = sb.charAt(0);
            char secondChar = sb.charAt(1);

            sb.deleteCharAt(0);
            sb.deleteCharAt(0);

            sb.append(Character.toUpperCase(firstChar) + "" + secondChar + "ay");
        } else {
            sb.append("way");
        }

        return sb.toString(); // Take the characters in the StringBuilder object (mutable) and construct a String out of it
    }

    public static void main(String[] args) {
        System.out.println(pigLatin("kevin"));
        System.out.println(pigLatin("child"));
        System.out.println(pigLatin("awesome"));
    }

}
