package $2ControlFlowStatements;

public class $1DecisionMakingStatements {

    public static void main(String[] args) {

        /**
         * IF STATEMENTS
         * Single If
         *     The single if statement evaluates one condition. Only if the condition is true, the code block gets executed
         * If Else
         *     The if else statement also checks a condition. But if the condition is true, the code block under the if
         *     gets executed. If the condition is false, the code block under the else gets executed.
         * Multi-branch If
         *     The multi-branch if statement is used to make a decision among several alternatives. In addition to regular
         *     if statements, it consists else if statements as many times as we want. All conditions are checked and if one
         *     of them is true, its code block gets executed and the rest isn't checked. If none of them is evaluated as true,
         *     the else block gets executed.
         * Nested If
         *     This means if statement inside another if statement (or else statement). Nested if can be used for creating
         *     a pre-condition. Outer and inner if statements can be any type of if statements
         */

        System.out.println("IF STATEMENTS");

        int a = 8;
        int b = 5;

        if (a > b) {
            System.out.println(a + " is bigger than " + b);
        }

        if (a < b) {
            System.out.println(a + " is smaller than " + b);
        } else {
            System.out.println(a + " is bigger than " + b);
        }

        // If the statement is only one line, curly braces can be removed

        int testScore = 76;
        char grade;

        if (testScore >= 0 && testScore <= 100) {

            if (testScore >= 90)
                grade = 'A';
            else if (testScore >= 80)
                grade = 'B';
            else if (testScore >= 70)
                grade = 'C';
            else if (testScore >= 60)
                grade = 'D';
            else
                grade = 'F';

            System.out.println("Grade = " + grade);

        } else {
            System.err.println("Invalid test score");
        }


        /**
         * SWITCH STATEMENT
         * - Switch-case statement compares a value of a variable with multiple values and executes some statements based on the match.
         * - Switch condition can be char, byte, short, int, String, enum. The others(long, float, double, boolean) are not accepted.
         * - All the case blocks statements are optional, including default and break. Default can appear anywhere.
         * - Deciding whether to use if-then-else statements or a switch statement is based on readability and the expression that the
         * statement is testing. An if-then-else statement can test expressions based on ranges of values or conditions,
         * whereas a switch statement tests expressions based only on a single integer, enumerated value, or String object.
         */

        System.out.println("SWITCH STATEMENT");

        int month = 2;
        int year = 2000;
        int numDays = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }

        System.out.println("Number of Days = " + numDays);


    }
}

