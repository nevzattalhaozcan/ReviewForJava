package $3ScannerAndString;

import java.util.Scanner;

public class $1ScannerReview {

    public static void main(String[] args) {

        /**
         * SCANNER
         * - The Scanner class provides methods to get inputs. It is presented in "java.util" package. It needs to be imported.
         * - A Scanner object must be instantiated before using any method of it. The parameter "System.in" is passed to
         * the Scanner's constructor to connect the scanner to the keyboard.
         * - nextLine() reads the entire input until the new line, including the "enter". Since the other methods cannot read
         * the "enter", the "enter" remains in the Scanners memory. If this method follows the others, it reads the "enter" in the
         * memory and closes.
         */

        String str = "Wooden";

        StringBuilder str2 = new StringBuilder("Wooden");
        str2.append(" Spoon");

        System.out.println(str2);

        str = str.concat("Spoon");

        System.out.println(str);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        scanner.nextLine();

        System.out.print("Enter your age: ");
        scanner.next();

        System.out.println("Enter your field: ");
        System.out.println(scanner.nextLine());

        scanner.close();
    }
}
