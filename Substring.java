import java.util.*;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int maxLength = findLongestUniqueSubstring(str);

        System.out.println("Length of longest substring without repeating characters: " + maxLength);
    }

    public static int findLongestUniqueSubstring(String str) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < str.length(); right++) {
            char currentChar = str.charAt(right);

            while (set.contains(currentChar)) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
