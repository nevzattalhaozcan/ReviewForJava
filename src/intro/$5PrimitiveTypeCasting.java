package intro;

public class $5PrimitiveTypeCasting {

    public static void main(String[] args) {

        /**
         * PRIMITIVE TYPE CASTING
         * Allows us to assign one primitive type to another
         * Only used among integers and float-point numbers
         * There are two types:
         *     Implicit Casting
         *         To cast the smaller data type to the larger
         *         It is done by compiler implicitly. No need to casting operator.
         *         byte > short > int > long > float > double
         *     Explicit Casting
         *         To cast the larger data type to the smaller
         *         It must be done explicitly, and it requires casting operator.
         *         double > float > long > int > short > byte
         *         It may cause data loss
         */

        int myInt = 1000;

        // Implicit Casting
        long myLong = myInt;
        double myDouble = (double) myInt;

        System.out.println("myLong = " + myLong);
        System.out.println("myDouble = " + myDouble);

        // Explicit Casting
        byte myByte = (byte) myInt;
        short myShort = (short) myInt;

        System.out.println("myByte = " + myByte);
        System.out.println("myShort = " + myShort);

    }
}
