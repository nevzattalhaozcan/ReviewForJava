package intro;

public class $3Variables {

    public static void main(String[] args) {

        /**
         * VARIABLES:
         * $4Variables are containers that stores data. They improve the re-usability of the data.
         *
         * DATA TYPES
         *   Primitive:
         *      Integer:
         *          byte
         *          short
         *          int
         *          long
         *      Float-Point:
         *          float
         *          double
         *      Characters:
         *          char
         *      Boolean:
         *          boolean
         *   Non-Primitive:
         *      String
         *      Array
         *      Classes
         */

        /**
         * VARIABLE DECLARATION
         * "int" is default data type for integer numbers
         * "double" is default data type for floating numbers
         * For long, add "L" at the end of the value
         * For float, add "F" at the end of the value
         */

        byte number;
        number = 10;

        short num = 10;

        long myLong = 100000000021L;

        float myFloat = 12.232323F;

        /**
         * RULES FOR VARIABLE NAMES
         * - Readable
         * - If the name contains more than one word, camelCase is used
         * - The first character of the name must be a letter "a-z" or "A-Z", an underscore "_", or a dollar sign "$"
         * - After the first character, digits can be also used.
         * - Can not include space
         * - Can not be a Java-reserved word
         */

        // int new = 10; COMPILER ERROR because "new" is a Java-reserved word

        int myNumber = 10;

        //long if = 12; COMPILER ERROR because "if" is a Java-reserved word

    }
}
