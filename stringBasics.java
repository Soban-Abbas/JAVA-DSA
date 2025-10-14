import java.util.Scanner;;
public class stringBasics{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String sentence=sc.nextLine();
        String sentence1="soban";
        String sentence2= "   Soban Abbas   ";
        System.out.println("Your Input : " + sentence);
        // .length gives string length
         System.out.println("Lenght of string =" +sentence.length());
        // .charAt(i) or .charAt(2) gives char at index i
        System.out.println("Char at index 3 = " + sentence.charAt(3) ); 
        // .toLowerCase covert string to small letters
        System.out.println("string in small alphabats = " + sentence.toLowerCase());
        // .toUpperCase convert string to uppercase
        System.out.println("string in uppercase = " +sentence.toUpperCase());
        // .substring(i, j) gives part of string from i to j-1
        System.out.println("Part of string =" +sentence.substring(1, 4));
        // .equals(str2) compares 2 strings
        System.out.println("check 2 strings are equal or not = " + sentence.equals(sentence1));
        //.equalsIgnoreCase(str2) compares ignoring case
        System.out.println("check 2 strings bt ingonring case =" +sentence.equalsIgnoreCase(sentence1));
        //.contains(str) checks if part exists
        System.out.println("checking part exist =" +sentence.contains("sob"));
        // .indexOf(ch) gives index of first match
        System.out.println("index is " +sentence.indexOf("b"));
        // .trim remove extra spaces
        System.out.println("remove extra spaces " +sentence2.trim());
         sc.close();
    }
}