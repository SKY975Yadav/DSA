import java.util.*;

public class StringBuilderAndStringBuffer {
    public static void main(String[] args) {
        //String Builder are mutable
//        StringBuilder st1 = new StringBuilder("Apple");
//        StringBuilder st2 = st1; // Both refers to the same location
//        System.out.println(st2==st1); //True because both are refers to same location
//        System.out.println(st2.equals(st1)); // True because both values are same
//        st1.append(" Fruit");//Won't create a new memory instead update the old value, so still old string (st2) is refers to st1
//        System.out.println(st2==st1);//True no memory created for st1
//
//
        //String Builder Methods
        StringBuilder stringBuilder = new StringBuilder("Sai Krishna");
        //Append And Insert on String Builder
        System.out.println(stringBuilder.append(56.34));
        System.out.println(stringBuilder.insert(3,3487));
        System.out.println(stringBuilder.insert(3,"King"));
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(34,34,234,23,423,4,234,34));
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(34,"Hello");
        tm.put(31,"Hi");
        tm.put(33,"Madam");
        tm.put(39,"Harry");
        tm.put(36,"Krishna");
        tm.put(38,"Ram");
        System.out.println(stringBuilder.insert(4,tm));
        System.out.println(stringBuilder.insert(7,al));
        CharSequence ch = new StringBuilder("Hello World");
        System.out.println(stringBuilder.insert(2,ch));
        System.out.println(stringBuilder.insert(2,ch,2,4));
        char [] ch2 ={'d','e','r','t','y',' ','m','i','n','d'};
        System.out.println(stringBuilder.insert(20,ch2));
        System.out.println(stringBuilder.insert(1,ch2,4,5));
        stringBuilder.setCharAt(4,'r');
        System.out.println(stringBuilder.replace(32,32,"Hello"));

        //Get String
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.charAt(5));
        System.out.println(stringBuilder.substring(56,84));
        System.out.println(stringBuilder.subSequence(23,55));
        System.out.println(stringBuilder.indexOf("m"));
        System.out.println(stringBuilder.indexOf("m",10));
        System.out.println(stringBuilder.lastIndexOf("i"));
        System.out.println(stringBuilder.lastIndexOf("i",132));
//        String temp ="Hello Moto";
//        System.out.println();
//        StringBuilder stme = new StringBuilder("Hello Moto");
//        StringBuilder stm = new StringBuilder("Hello Moto");
//        System.out.println(stm.compareTo(stme));
//        System.out.println(stm.toString().contentEquals(stme));
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.delete(2,9));
        System.out.println(stringBuilder.deleteCharAt(8));
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.codePointAt(1));
        System.out.println(stringBuilder.codePointBefore(4));
        System.out.println(stringBuilder.codePointCount(67,110));
        System.out.println(stringBuilder.isEmpty());
        System.out.println(stringBuilder.offsetByCodePoints(5,23));
        StringBuilder sb = new StringBuilder("Hello \uD83D\uDE00 World"); // Includes a smiley emoji (surrogate pair)
        System.out.println(sb.codePointCount(0,sb.length()));
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(3);
        System.out.println(sb.capacity());
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.capacity());
        stringBuilder.ensureCapacity(165);
        System.out.println(stringBuilder.capacity());
        char [] chStr = new char[10];
        stringBuilder.getChars(0,10,chStr,0);
        System.out.println(Arrays.toString(chStr));
        System.out.println(stringBuilder.capacity());
        stringBuilder.trimToSize();
        System.out.println(stringBuilder.capacity());
        stringBuilder.append(34);
        System.out.println(stringBuilder.capacity());


        //Streams in string
        System.out.println(stringBuilder.chars().count());
        System.out.println(stringBuilder.chars().anyMatch(Character::isAlphabetic));
        System.out.println(stringBuilder.chars().allMatch(Character::isAlphabetic));
        System.out.println(stringBuilder.chars().anyMatch(Character::isLowerCase));
        System.out.println(stringBuilder.chars().allMatch(Character::isLowerCase));
        System.out.println(stringBuilder);
        OptionalInt in =  stringBuilder.chars().max();
        if (in.isPresent()) System.out.println(in.getAsInt());
        OptionalInt ins =  stringBuilder.codePoints().max();
        if (in.isPresent()) System.out.println(in.getAsInt());
        System.out.println(stringBuilder);
    }
}