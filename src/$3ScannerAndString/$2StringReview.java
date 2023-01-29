package $3ScannerAndString;

public class $2StringReview {

    public static void main(String[] args) {

        /**
         * STRING CLASS
         * - It is an object that represents sequence of characters.
         * - String is immutable. Once the object is created, it can't be modified. The changes will be done to a new object.
         * - There are two ways to create a String object:
         *     - String literal
         *         Created by using double quotes. The object is created in the String Pool.
         *         String Pool:
         *             An allocation of memory in Java heap memory. If the String object already exists in the pool, a reference to
         *             the pooled instance is returned
         *     - new Keyword
         *         Creates a new different object in the heap
         * - Every character in the String has an index number. Index numbers start from zero.
         */

                   // 01234567890123
        String str = "String Literal";

                                   // 012345678901234567890123456
        String s = new String("  String with new keyword  ");

        str.toLowerCase();

        System.out.println(str);

        str = str.toLowerCase();

        System.out.println(str);

        /**
         * String Methods
         */

        // charAt(index): returns the character at given index as char
        System.out.println(s.charAt(4));

        // length(): returns the length of the string as int
        System.out.println(s.length());

        // toLowerCase(): makes all characters of the string lower case, returns String
        System.out.println(s.toLowerCase());

        // toUpperCase(): makes all characters of the string upper case, returns String
        System.out.println(s.toUpperCase());

        // trim(): removes the leading and trailing spaces in the string, returns String
        System.out.println(s.trim());

        // indexOf(sequenceOfChars): returns the index that the given sequence of characters occurs for the first time as int
        System.out.println(s.indexOf("n")); // returns -1, if no such value exists in the string

        // lastIndexOf(sequenceOfChars): returns the index that the given sequence of characters occurs for the last time as int
        System.out.println(s.lastIndexOf("n")); // returns -1, if no such value exists in the string

        // replace(old,new): replaces all matching characters with the new value, returns String
        System.out.println(s.replace("a","o"));

        // replaceFirst(old,new): replaces first matching characters with the new value, returns String
        System.out.println(s.replaceFirst("a","o"));

        // substring(beginIndex,endIndex): returns the substring between begin and end index(excluding) as String
        System.out.println(s.substring(5));
        System.out.println(s.substring(5,7));

        // repeat(count): returns the string concatenating given times as String
        System.out.println(s.repeat(3));

        // isEmpty(): returns "true" if the length is zero, otherwise "false" ,as boolean
        System.out.println(s.isEmpty());

        // isBlank(): returns "true" if the string is consists of only spaces, otherwise "false" ,as boolean
        System.out.println(s.isBlank());

        // equals(string): returns if the string is equals with the given string or not as boolean
        System.out.println(s.equals("abc"));

        // equalsIgnoreCase(string): returns whether the string is equals with the given string ignoring as boolean
        System.out.println(s.equals("abc"));

        // contains(string): returns whether the string contains the given string or not as boolean
        System.out.println(s.contains("with"));

        // startsWith(string): returns whether the string starts with the given string or not as boolean
        System.out.println(s.startsWith("Java"));

        // endsWith(string): returns whether the string ends with the given string or not as boolean
        System.out.println(s.endsWith("Java"));

    }
}
