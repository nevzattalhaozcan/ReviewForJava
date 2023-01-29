package $2ControlFlowStatements;

public class $3BranchingStatements {

    public static void main(String[] args) {

        /**
         * BRANCHING STATEMENTS
         * Break:
         *     Causes the termination of the loop and switch statement. Tells the interpreter to go onto the next
         *     statement of code outside the loop.
         * Continue:
         *      Skips the current iteration of the loop and jumps to the next iteration
         */

        for (int i = 0; i < 10; i++) {

            if(i == 5){
                break;
            }

            System.out.println("Count is: " + i);

        }

        int a = 0;
        while (a < 5){

            if(a == 3){
                continue;
            }

            System.out.println("Number: " + a++);

        }


    }
}
