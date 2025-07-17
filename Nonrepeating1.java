import java.util.Scanner;

public class FirstNonRepeatingCharBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        str = str.toLowerCase();  // Optional: ignore case

        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
                System.out.println("First non-repeating character: " + currentChar);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating character found.");
        }
    }
}
