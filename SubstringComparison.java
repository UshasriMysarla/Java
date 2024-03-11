package jp;
import java.util.Scanner;

public class SubstringComparison {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String words[] = new String[s.length()-k+1];
        String w,m,temp;
        for (int i=0;i<s.length()-k+1;i++)
        {
            w = s.substring(i,k+i);
            words[i] = w;
        }
        for (int i = 0; i < words.length; i++) {
    for (int j = 0; j < words.length - i - 1; j++) {
        if (words[j].compareTo(words[j + 1]) > 0) {
            temp = words[j];
            words[j] = words[j + 1];
            words[j + 1] = temp;
        }
    }
}
        smallest = words[0];
        largest = words[words.length-1];
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}