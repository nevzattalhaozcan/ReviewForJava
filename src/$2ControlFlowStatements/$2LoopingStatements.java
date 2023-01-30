package $2ControlFlowStatements;

public class $2LoopingStatements {

    public static void main(String[] args) {

        /**
         * LOOPS
         * Loops check a condition. If the condition is true, the code block gets executed. Then, the condition is
         * checked again. It repeats until the condition returns false
         * There are three types of loops:
         *     For Loop:
         *         Runs the given code a specific number of times. Initialization is the starting point. Condition is
         *         the ending point. Iterator is responsible for making the condition false
         *     While Loop:
         *         It is like repeated if statement. Condition is checked before the loop starts. Loop gets terminated
         *         if the condition is evaluated as false.
         *     Do While Loop:
         *         Runs the code block first, then checks the condition. If it is true, runs again. So, the code block
         *         gets executed at least one time.
         *
         * If the number of repetition is known, for loop is used
         * If the number of repetition is not known, while loop is used
         * If the code is needed to be got executed at least one time, do while loop is used
         *
         *     Nested Loop:
         *         In short, loop inside another loop. For each iteration of the outer loop, the inner loop iterates from
         *         beginning to the end till the outer loop ends.
         */

        System.out.println("---For Loop---");
        for(int i = 0; i < 5; i++){
            System.out.println("Count is: " + i);
        }


        System.out.println("---While Loop---");
        int a = 0;
        while (a++ < 5){
            System.out.println("Count is: " + a);
        }


        System.out.println("---Do While Loop---");
        int b = 0;
        do {
            System.out.println("Count is: " + b++);
        }while (b < 5);


        System.out.println("---Nested Loop---");
        int c = 0;
        for (int i = 0; i < 5; i++) {

            while (c++ < 5){
                System.out.println(i + " : " + c);
            }

        }



    }
}

class Tasks{

    public static void main(String[] args) {

        /*
        Ex: cat 2 dog 2
	            sentence = "caT dog doG cAt"

	            output:
	                true
         */



        /*
        EX:
	       input: 100

	       Output:
	       Divisible By 15: 15 30 45 60 75 90
	       Divisible By 5: 5 10 20 25 35 40 50 55 65 70 80 85 95 100
	       Divisible By 3: 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
         */



        /*
        Write a program that can display the multiplication table
         */



        /*
        Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1

         */



        /*
        Ex:
                        str = "aabccdeef";

                        output:
                                bdf
         */



        /*

        *
        * *
        * * *
        * * * *
        * * * * *

         */

    }
}