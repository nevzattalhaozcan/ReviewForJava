package $0TrialAndError;

import java.util.Arrays;

public class Tasks {

    public static void main(String[] args) {

        


        System.out.println("---> Write a program that can find the character that has the highest frequency from a string");
        String str = "aaabbbcssseeeeeee";
        highestChar(str);

        System.out.println("---> Write a program that can swap first name with last name in the email (Seperated by an underscore)");
        String email = "mike_tyson@gmail.com";
        swapFirstLastName(email);

        System.out.println("---> Write a program that can return the frequency of the a word from the sentence");
        String sentence = "java Java JaVa pYthon PyThon";
        String word = "java";
        frequencyOfWord(sentence,word);

        System.out.println("---> Write a program that can move all the zeros to the end of the array");
        int[] arr = {10,0,5,0,1,0};
        allZerosRight(arr);



    }

    public static void allZerosRight(int[] array) {

        int[] zero = new int[array.length];

        for(int i = 0, k = 0, j = zero.length-1; i < array.length; i++){

            if(array[i] != 0){
                zero[k++] = array[i];
            }else{
                zero[j--] = 0;
            }

        }

        System.out.println(Arrays.toString(zero));

    }

    public static void frequencyOfWord(String sentence, String word) {

        int frequency = 0;

        for (int i = 0; i <= sentence.length()-word.length(); i++) {

            if(sentence.substring(i,i+word.length()).equalsIgnoreCase(word)){
                frequency++;
            }

        }
        System.out.println(frequency);
    }

    public static void swapFirstLastName(String email) {

        if(email.contains("_"))
            System.out.println(email.substring(email.indexOf("_")+1,email.indexOf("@")) + "_" + email.substring(0,email.indexOf("_")) + "@gmail.com");
        else
            System.out.println(email);
    }

    public static void highestChar(String str){

        char highest = 'a';
        int max = 0;

        for (int i = 0; i < str.length(); i++) {

            int count = 0;
            char ch = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {

                char each = str.charAt(j);

                if(ch == each){
                    count++;
                }

            }

            if(count > max){
                max = count;
                highest = ch;
            }

        }

        System.out.println("Highest character is: " + highest);

    }







}


