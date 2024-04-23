import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class AboutString {
    public static void main(String[] args) {
//        String st = "Sai Krishna";
//        System.out.println(st);
//        st = st.concat(" Yadav");
//        System.out.println(st);
//        System.out.println(st.length());
//        System.out.println(st.substring(0,5));
//        String ex1 = "ABCDE";
//        String ex2 = "abcde";
//        System.out.println(Arrays.toString(ex1.getBytes(StandardCharsets.UTF_8)));
//        System.out.println(Arrays.toString(ex2.getBytes(StandardCharsets.UTF_8)));
        // From 0 to 31 : nothing, we get all symbols of this : 
        // Start from 32 (32 == space)  up to 47 :   ! " # $ % & ' ( ) * + , - . /
        // from 48 : 57  are numbers : 0 1 2 3 4 5 6 7 8 9
        // Other Symbols from 58 to 64 : : ; < = > ? @
        // Uppercase Letters from 65 to 90 : A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
        // Other symbols from 91 to 96 : [ \ ] ^ _ `
        // Lowercase Letters from 97 to 122 : a b c d e f g h i j k l m n o p q r s t u v w x y z
        // Some more Symbols from 123 to 126 : { | } ~
        // From 127 to 159 again nothing, we get all symbols of this : 
        // For 160 it again space
        // From 161 we get all other Symbols
//        for (int i=32 ; i < 300;i++){
//            System.out.print((char)i + " ");
//            if(i==70 || i==130 || i ==200 || i ==270) System.out.println();
//        }
//        System.out.println();
//        System.out.println("sai"+(char)200+"krishna");
        // 1. charAt(int index)
        String str = "Hello";
//        char ch = str.charAt(1); // ch = 'e'
//        System.out.println("charAt(int index): " + ch);
//
//        // 2. length()
//        int length = str.length(); // length = 5
//        System.out.println("length(): " + length);
//
//        // 3. substring(int beginIndex)
//        String substr1 = str.substring(2); // substr1 = "llo"
//        System.out.println("substring(int beginIndex): " + substr1);
//
//        // 4. substring(int beginIndex, int endIndex)
//        String substr2 = str.substring(1, 4); // substr2 = "ell"
//        System.out.println("substring(int beginIndex, int endIndex): " + substr2);
//
//        // 5. toLowerCase()
//        String lower = str.toLowerCase(); // lower = "hello"
//        System.out.println("toLowerCase(): " + lower);

        // 6. toUpperCase()
//        String upper = str.toUpperCase(); // upper = "HELLO"
//        System.out.println("toUpperCase(): " + upper);
//
//        // 7. indexOf(String str)
//        int index = str.indexOf("l"); // index = 2
//        System.out.println("indexOf(String str): " + index);
//
//        // 8. startsWith(String prefix)
//        boolean startsWith = str.startsWith("He"); // startsWith = true
//        System.out.println("startsWith(String prefix): " + startsWith);
//
//        // 9. endsWith(String suffix)
//        boolean endsWith = str.endsWith("lo"); // endsWith = true
//        System.out.println("endsWith(String suffix): " + endsWith);
//
//        // 10. replace(char oldChar, char newChar)
//        String replaced = str.replace('l', 'w'); // replaced = "Hewwo"
//        System.out.println("replace(char oldChar, char newChar): " + replaced);

        //Special about String
        String st1 = "Apple";
        String st2 = st1; // Both are refers to same string
        String st3 = "Apple";
        String st4 = new String("Apple");
//        st1 += " Hello"; // New String has created and stored in st1 since Strings are immutable
        // '==' operator check whether both references are refer to same object or not
        System.out.println(st1==st2);//True because both strings are refers to same object
        System.out.println(st1==st3);//True even though we initialize separately their values are same so it's refers to same location
        System.out.println(st1==st4);//False even though we have same value, but we are using new key word so it create separate memory for this String
        System.out.println();
        // equals() method check whether the values of both strings are same or not
        //So Below all are true
        System.out.println(st1.equals(st2));
        System.out.println(st1.equals(st3));
        System.out.println(st1.equals(st4));
        System.out.println();
        st1 = st1 + " King";//It creates the new String and assigned to st1, now st2 and st3 are refers to old String i.e Apple
        System.out.println(st1==st2);//False because st1 is refers to new String Apple King   and st2 is currently refers to Apple
        System.out.println(st2 == st3);//True they are refers to same value
        System.out.println(st3.equals(st2));
    }
}
