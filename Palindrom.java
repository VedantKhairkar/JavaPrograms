import java.util.Scanner;

class ArrayPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int[] a = new int[size];
        int start = 0, end = a.length - 1;
        boolean isPalindrome = true;

        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        while (start < end) {
            if (a[start] != a[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("number is a palindrome.");
        } else {
            System.out.println("number is not a palindrome.");
        }

        sc.close();
    }
}

