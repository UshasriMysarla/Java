package jp;
import java.util.*;
class AnagramChecker {

    public static boolean areAnagrams(String str1, String str2) {
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] charCount = new int[26]; 
        for (char c : str1.toCharArray()) {
            charCount[c - 'a']++;
        }
        for (char c : str2.toCharArray()) {
            charCount[c - 'a']--;
        }
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
}
}
class Anagram {
    public static void main(String[] args)
    {
        AnagramChecker obj = new AnagramChecker();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings");
        String a = sc.next();
        String b = sc.next();
        if (obj.areAnagrams(a,b))
        {
        	System.out.println("Strings are anagrams");
        }
        else
        {
        System.out.println("Strings are not anagrams");
        }
    }
}
