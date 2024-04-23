import java.util.Arrays;

public class StringCompilationProcess {
    //String -> characters -> bytes -> binary values -> bytes -> characters -> String
    public static void main(String[] args) {
        //String to Binary
        String text = "Hello, world!"; // Initialize of String
        byte[] binaryData = text.getBytes(); //store the bytes of each individual characters of string in an array
        String [] binaryString = new String[text.length()]; //Initialize the String array for storing binary numbers of each character
        int i=0;
        for (byte b : binaryData) {
            //Conversion of byte number to Binary number and store in that array
            String binaryStringOfData = String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
            binaryString[i] = binaryStringOfData;
            i++;
        }
        System.out.println();
        //Binary to String
        //Initialize the array for storing the bytes values of all binary values
        int [] intValue = new int[text.length()];
        int j =0;
        for (String x : binaryString){
            //Storing all bytes values of binary values
            intValue[j] = Integer.parseInt(x,2);
            j++;
        }
        System.out.println(Arrays.toString(intValue));
        //Create a string for result
        String stringValue = "";
        for (int x : intValue){
            //Convert byte value to char
            char c = (char) (x);
            //Add all characters to string
            stringValue += String.valueOf(c);
        }
        System.out.println("String value: " + stringValue);



        //Simple int to binary values
//        int b = -1;
//        String binaryStringOfData = String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
//        System.out.println(binaryStringOfData);

        //Simple String to Binary process
//        String text = "Hello, world!"; // Initialize of String
//        byte[] binaryData = text.getBytes(); //store the bytes of each individual characters of string in an array
//        String [] binaryString = new String[text.length()]; //Initialize the String array for storing binary numbers of each character
//        int i=0;
//        for (byte b : binaryData) {
//            //Conversion of byte number to Binary number and store in that array
//            String binaryStringOfData = String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
//            binaryString[i] = binaryStringOfData;
//            i++;
//        }
//        System.out.println(Arrays.toString(binaryString));

        //Simple binary to char/String
//        String binaryString = "01001000";
//        int intValue = Integer.parseInt(binaryString, 2);
//        char charValue = (char) intValue;
//        String stringValue = String.valueOf(charValue);
//        System.out.println(stringValue);

        //Total Binary to String
//        String [] binaryString = {"001110011","01100101", "01101100", "01101100", "01101111"};
//        int [] intValue = new int[binaryString.length];
//        int j =0;
//        for (String x : binaryString){
//            //Storing all bytes values of binary values
//            intValue[j] = Integer.parseInt(x,2);
//            j++;
//        }
//        System.out.println(Arrays.toString(intValue));
//        //Create a string for result
//        String stringValue = "";
//        for (int x : intValue){
//            //Convert byte value to char
//            char c = (char) (x);
//            //Add all characters to string
//            stringValue += String.valueOf(c);
//        }
//        System.out.println("String value: " + stringValue);

        //About code points in java
//        for (int codePoint = 0; codePoint <= 0xFFFF; codePoint++) {
//            char[] chars = Character.toChars(codePoint);
//            String character = new String(chars);
//            System.out.printf("Code Point: U+%04X, Character: %s%n", codePoint, character);
//        }
        int a = 'a'-'a';
        System.out.println(a);
    }
}
