package $4Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $1ArrayReview {

    public static void main(String[] args) {

        /**
         * ARRAY
         * It is special type of variable. Array can hold multiple values of the same data type. Size is fixed.
         * Supports both primitives and non-primitives. Every element in an Array has index number.
         */

        // Declaring
        int[] scores;
        String[] names;

        // Instantiating
        scores = new int[5];
        names = new String[3];

        // Assigning value
        scores[0] = 30;
        scores[1] = 60;
        scores[2] = 90;
        scores[3] = 20;
        scores[4] = 100;
        for (int i = 0; i < names.length; i++) {
            names[i] = "name";
        }

        // Accessing elements
        System.out.println(scores[3]);
        System.out.println(names[2]);

        // Initialization
        int[] myScores = {100,60,40,86,43};

        // Printing
        System.out.println(Arrays.toString(myScores));

        /**
         * Multi Dimensional Array
         * It's array of arrays. N dimensional array is a container for N-1 dimensional arrays.
         */

        int[][] array2D = new int[3][0];

        for (int i = 0; i < array2D.length; i++) {

            array2D[i] = new int[]{1, 2, 3};

        }

        System.out.println(Arrays.deepToString(array2D));

        /**
         * Arrays Utility Class
         */

        int[] arr = {14,2,32,4,56,6};
        int[] arr2 = {14,2,32,4,56,6};

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.equals(arr,arr2));

        int[] copy = Arrays.copyOf(arr,arr.length);

        System.out.println(Arrays.toString(copy));

        int[] newCopy = Arrays.copyOfRange(arr,1,3);

        System.out.println(Arrays.toString(newCopy));


        /**
         * String Methods returning Array
         */

        String str = "Java Programming Language";

        String[] strings = str.split(" ");
        System.out.println(Arrays.toString(strings));

        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));


    }
}

class Tasks {

    public static void main(String[] args) {

        /*
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
         */
        int[] array1 = {10, 0, 5, 0, 1, 0};

        int aaa = 0;

        for (int i = 0; i < array1.length; i++) {

            for (int j = i+1; j < array1.length ; j++) {

                if(array1[i] > array1[j]){
                    aaa = array1[i];
                    array1[i] = array1[j];
                    array1[i] = aaa;
                }

            }

        }
        System.out.println(Arrays.toString(array1));

//        int[] zeroRight = new int[array1.length];
//
//        for (int i = 0,k = 0; i < array1.length; i++) {
//
//            if(array1[i] != 0)
//              zeroRight[k++] = array1[i];
//
//        }
//        System.out.println(Arrays.toString(zeroRight));


        /*
        Ex:
            {"anna", "level", "Java"};

            output:
                2
         */

        String[] array2 = {"anna", "level", "Java"};

//        int count = 0;
//        for(String each : array2){
//
//            String reversed = "";
//
//            for (int i = each.length()-1; i >= 0; i--) {
//                reversed += each.charAt(i);
//            }
//
//            if(each.equalsIgnoreCase(reversed)) count++;
//
//        }
//        System.out.println(count);

        /*
        Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1}};
         */

        int[][] array3 = { {1,2,3}, {4,5,6} };

//        int[][] reversed = new int[array3.length][];
//
//        for (int i = 0,l=1; i < array3.length; i++,l--) {

//            reversed[i] = new int[array3[i].length];

//            for (int j = 0, k= 2,m=0; j < array3[i].length; j++) {
//
//                reversed[i][m++] = array3[l][k--];
//
//            }
//
//        }
//        System.out.println(Arrays.deepToString(reversed));

        /*

        Interview Question 1

         */

        int[] ints = {1,1,3,4,4,4};

        for(int each : ints){
            int count = 0;

            for(int i : ints){

                if(each == i){
                    count++;
                }

            }
            count--;
            if(each == count){

            }

        }


    }


}