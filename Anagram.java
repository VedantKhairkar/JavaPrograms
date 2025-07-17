import java.util.Scanner;
import java.util.Arrays;

class An {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        s1 = s1.replaceAll("\\s", "");  
        s2 = s2.replaceAll("\\s", "");

        if (s1.length() == s2.length()) {

            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();

            char ch1[] = s1.toCharArray();
            char ch2[] = s2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            boolean f = true;

            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] != ch2[i]) {
                    f = false;
                    break;
                }
            }

            if (f) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }

        } else {
            System.out.println("Not Anagram");
        }
    }
}
