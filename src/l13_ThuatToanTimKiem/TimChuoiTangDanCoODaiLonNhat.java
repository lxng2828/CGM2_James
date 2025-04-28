package l13_ThuatToanTimKiem;

// File: LongestAscendingSubstring.java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class TimChuoiTangDanCoODaiLonNhat {


    public static String findLongestAscendingSubstring(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        ArrayList<String> ascendingSubstrings = new ArrayList<>();
        String currentSubstring = "";

        for (int i = 0; i < input.length(); i++) {
            if (currentSubstring.isEmpty()
                    || input.charAt(i) > currentSubstring.charAt(currentSubstring.length() - 1)) {
                currentSubstring += input.charAt(i);
            } else {
                ascendingSubstrings.add(currentSubstring);
                currentSubstring = "" + input.charAt(i);
            }
        }
        ascendingSubstrings.add(currentSubstring);

        String longestSubstring = "";
        for (String sub : ascendingSubstrings) {
            if (sub.length() > longestSubstring.length()) {
                longestSubstring = sub;
            }
        }
        return longestSubstring;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi bat ky: ");
        String inputString = scanner.nextLine();
        scanner.close();

        String longestAscending = findLongestAscendingSubstring(inputString);
        System.out.println("Chuoi tang dan lon nhat la: " + longestAscending);
    }
}