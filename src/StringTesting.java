import java.util.*;
public class StringTesting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Any String");
        String str = input.nextLine();
        StringBase s1 = new StringBase(str);
        s1.reverseString();
        s1.removeAllSpaces();
        s1.replaceCharFromString('a','z');
        s1.isStringEmpty();
        s1.checkStringLength();
        s1.getIndexOfChar('a');
        s1.getIndexOfSubString("akshat");
        s1.removeCharFromString('a');
        s1.replaceAllLowerCase("*");
        s1.replaceAllLowerToUpperCase();
        s1.removeSpacesFromStart();
        s1.removeSpacesFromEnd();
        s1.replaceALLUpperToLowerCase();
    }

}
