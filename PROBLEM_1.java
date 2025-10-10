package project;
import java.util.Scanner;
class PROBLEM_1 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        int countStar = 0;
        int countHash = 0;

        for (char ch : S.toCharArray()) {
            if (ch == '*') countStar++;
            else if (ch == '#') countHash++;
        }

        // Output positive if * > #, negative if # > *, 0 if equal
        int result = countStar - countHash;
        System.out.println(result);

        scanner.close();
    }
}


	