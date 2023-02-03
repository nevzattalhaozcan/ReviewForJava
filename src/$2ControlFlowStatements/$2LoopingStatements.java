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
        int aa = 0;
        int ab = 0;
        System.out.println("---For Loop---");
        for(int i = 0; i < 5; i++){
            aa++;
            if(i == 3){
                continue;
            }
            ab++;
            System.out.println("Count is: " + i);
        }
        System.out.println("aa " + aa);
        System.out.println("ab " + ab);

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

        String str = "caT doga doGa cAt";
//        int cat = 0, dog = 0;
//
//        for (int i = 0; i <= str.length()-3; i++) {
//
//            if(str.substring(i,i+3).equalsIgnoreCase("dog")){
//                dog++;
//            } else if (str.substring(i,i+3).equalsIgnoreCase("cat")) {
//                cat++;
//            }
//
//        }
//
//        System.out.println(cat == dog);
        int doga = 0, cat = 0;

        for (int i = 0; i <= str.length()-4; i++) {

            if(str.substring(i,i+3).equalsIgnoreCase("cat")) {
                cat++;
            }else if(str.substring(i,i+4).equalsIgnoreCase("doga")){
                doga++;
            }

        }
        System.out.println("Dog: " + doga + " | Cat:" + cat);
        System.out.println(cat == doga);

        /*
        EX:
	       input: 100

	       Output:
	       Divisible By 15: 15 30 45 60 75 90
	       Divisible By 5: 5 10 20 25 35 40 50 55 65 70 80 85 95 100
	       Divisible By 3: 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
         */

        int input = 100;
//        String by15 = "", by5 = "", by3 = "";
//
//        for (int i = 1; i <= input; i++) {
//
//            if(i % 15 == 0){
//                by15 += i + " ";
//            }else  if (i % 5 == 0) {
//                by5 += i + " ";
//            }else if (i % 3 == 0) {
//                by3 += i + " ";
//            }
//
//        }
//
//        System.out.println("by15 = " + by15);
//        System.out.println("by5 = " + by5);
//        System.out.println("by3 = " + by3);

        /*
        Write a program that can display the multiplication table
         */

//        for (int i = 1; i <= 10; i++) {
//
//            for (int j = 1; j <= 10; j++) {
//
//                System.out.print(i*j + "\t");
//
//            }
//            System.out.println();
//        }

        /*
        Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1

         */

        String s = "aabcccd";

//        String result = "";
//
//        for (int i = 0; i < s.length(); i++) {
//
//            int count = 0;
//
//            for (int j = 0; j < s.length(); j++) {
//
//                if(s.charAt(i) == s.charAt(j)){
//                    count++;
//                }
//
//            }
//
//            if(!result.contains(""+s.charAt(i))){
//                result += ""+ s.charAt(i) + count;
//            }
//
//        }
//
//        System.out.println(result);

        /*
        Ex:
                        str = "aabccdeef";

                        output:
                                bdf
         */

        String string = "aabccdeef";
//        String uniques = "";
//
//        for (int i = 0; i < string.length(); i++) {
//
//            if(string.indexOf(i) == string.lastIndexOf(i)){
//                if(!uniques.contains(""+string.charAt(i))){
//                    uniques += string.charAt(i);
//                }
//            }
//
//        }
//
//        System.out.println(uniques);

        /*

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * *
        * * * *
        * * *
        * *
        *

         */

        for (int i = 1; i <= 5; i++) {
            System.out.println("* ".repeat(i));
        }


    }
}