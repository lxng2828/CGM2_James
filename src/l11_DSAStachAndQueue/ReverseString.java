package l11_DSAStachAndQueue;

import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {
        String originalString = "Xin chao the gioi lap trinh";
        Stack<String> wordStack = new Stack<>();

        System.out.println("Chuoi ban dau: " + originalString);

        String[] words = originalString.split(" ");
        for (String word : words) {
            wordStack.push(word);
        }

        StringBuilder reversedStringBuilder = new StringBuilder();
        while (!wordStack.isEmpty()) {
            reversedStringBuilder.append(wordStack.pop());
            if (!wordStack.isEmpty()) {
                reversedStringBuilder.append(" ");
            }
        }

        String reversedString = reversedStringBuilder.toString();
        System.out.println("Chuoi sau khi dao nguoc: " + reversedString);
    }
}