package $1Intro;

public class $6Operators {

    public static void main(String[] args) {

        /**
         * ARITHMETIC OPERATORS
         * Addition: +
         * Subtraction: -
         * Division: /
         * Multiplication: *
         * Modulus(Remainder): %
         */

        System.out.println("ARITHMETIC OPERATORS");

        System.out.println(3 + 5);

        System.out.println("3 + 5 = " + 3 + 5);
        System.out.println("3 + 5 = " + (3 + 5));

        double x = 5 / 3;
        System.out.println(x);

        int y = (int)( 5 / 3.0);

        System.out.println(y);


        System.out.println(5 / 3);

        System.out.println(5 / 3.0);
        System.out.println(5.0 / 3.0);
        System.out.println(5.0 / 3);

        System.out.println(5 % 3);


        /**
         * UNARY OPERATORS
         * Plus: +
         * Minus: -
         * Increment: ++
         *     Post-increment: a++
         *         It increases value by 1 after using it
         *     Pre-increment: ++a
         *         It increases value. Then, it uses the increased value
         * Decrement: --
         *     Post-decrement: a--
         *         It decreases value by 1 after using it
         *     Pre-decrement: --a
         *         It decreases value. Then, it uses the increased value
         */

        System.out.println("UNARY OPERATORS");

        System.out.println(+5 - -3);

        int a = 5;
        int b = 5;
                        // 5       4   6   4
        System.out.println(a++ + --b + a - b);


        /**
         *  SHORTHAND OPERATORS
         *  Assignment: =
         *  Addition Assignment: +=
         *  Subtraction Assignment: -=
         *  Multiplication Assignment: *=
         *  Division Assignment: /=
         *  Remainder Assignment: %=
         */

        System.out.println("SHORTHAND OPERATORS");

        int x1 = 5;

        x1 += 5; // x1 = x1 + 5;

        System.out.println(x1);

        x1 %= 5;

        System.out.println(x1);


        /**
         * RELATIONAL OPERATORS
         * !!! All relational operators return "boolean", they are treated as boolean !!!
         * Greater than: >
         * Greater than or equal: >=
         * Less than: <
         * Less than or equal: <=
         * Equal: ==
         * Not equal: !=
         */

        System.out.println("RELATIONAL OPERATORS");

        boolean result = 3 <= 4;

        System.out.println(result);

        System.out.println(5 > 3); // return 4 < 3;

        int c = 2;
        int d = 5;

        System.out.println(c != d);


        /**
         * LOGICAL OPERATORS
         * !!! All logical operators return "boolean", they are treated as boolean !!!
         * Logical And: &&
         *     When one of the statements is "false", it doesn't check the rest and returns "false" a > b & --a
         *     Only if all of them are "true", it returns "true"
         * Logical Or: ||
         *     When one of the statements is "true", it doesn't check the rest and returns "true"
         *     Only if all of them are "false", it returns "false"
         * Logical Not: !
         *     Makes a statement its opposite
         * Bitwise And: &
         *     Checks all the statements, the result is the same as the logical and
         * Bitwise Or: |
         *     Checks all the statements, the result is the same as the logical or
         */

        System.out.println("LOGICAL OPERATORS");

        System.out.println(true && true);
        System.out.println(true & true);

        boolean b1 = false;
        boolean b2 = true;

        System.out.println(b1 || b2);
        System.out.println(b1 | b2);

        System.out.println(!b2);

        System.out.println(b1 && b2 || true && b2);

        /**
         * PRECEDENCE OF OPERATORS
         * 1. - !
         * 2. * / %
         * 3. + -
         * 4. < > <= >=
         * 5. == !=
         * 6. &&
         * 7. ||
         * 8. = += -= *= /= %=
         */



    }
}
