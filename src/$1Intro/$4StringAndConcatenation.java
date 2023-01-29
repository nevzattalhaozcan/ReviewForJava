package $1Intro;

public class $4StringAndConcatenation {

    public static void main(String[] args) {

        /**
         * STRING
         * It is a sequence of characters.
         */

        System.out.println("This is a String");

        String str = "This is also a String";

        /**
         * STRING CONCATENATION
         * The action of linking things together by using "+" operator
         * The statement must include at least one String
         * Be careful about the work order of the compiler in concatenation: Top to bottom, left to right.
         * In concatenation, everything turns into a String at the end of the process.
         */

        System.out.println("My number is: " + 12);

        int age = 26;

        System.out.println("My age is: " + age);

        System.out.println( ("Age: " + age).toUpperCase() );

    }
}
