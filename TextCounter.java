import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextCounter {
    public static void main(String[] args) {
        String filePath = "/Users/natthapoom/Downloads/input1.txt";

        long startTime = System.currentTimeMillis();

        int characterCount = 0;
        int palindromeCount = 0;
        int tokenCount = 0;
        int newLineCount = 0;
        int longestTokenSize = 0;
        int totalTokenLength = 0;
        int emoticonCount = 0;

        List<String> tokens = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                newLineCount++;
                characterCount += line.length();

                String[] words = line.split("\\s+");
                for (String word : words) {
                    tokens.add(word);
                    tokenCount++;
                    totalTokenLength += word.length();
                    longestTokenSize = Math.max(longestTokenSize, word.length());
                    if (isPalindrome(word)) {
                        palindromeCount++;
                    }
                    if (isEmoticon(word)) {
                        emoticonCount++;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }

        double averageTokenSize = (tokenCount > 0) ? (double) totalTokenLength / tokenCount : 0.0;
        long endTime = System.currentTimeMillis();
        double executionTime = (endTime - startTime) / 1000.0;

        printResults(characterCount, palindromeCount, tokenCount, newLineCount,
                longestTokenSize, averageTokenSize, emoticonCount, executionTime);
    }

    private static boolean isPalindrome(String word) {
        if (word.isEmpty()) return false;
        int left = 0, right = word.length() - 1;
        while (left < right) {
            if (Character.toLowerCase(word.charAt(left)) != Character.toLowerCase(word.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isEmoticon(String word) {
        return word.matches("[:;][)-D(]");
    }

    private static void printResults(int charCount, int palindromeCount, int tokenCount,
                                     int newLineCount, int longestToken, double avgTokenSize,
                                     int emoticonCount, double executionTime) {
        System.out.println("Program start:");
        System.out.println("Total character count: " + charCount);
        System.out.println("Total palindrome count: " + palindromeCount);
        System.out.println("Total number of tokens: " + tokenCount);
        System.out.println("Total number of emoticons: " + emoticonCount);
        System.out.println("Total number of new lines: " + newLineCount);
        System.out.println("Longest token size: " + longestToken);
        System.out.printf("Average token size: %.2f%n", avgTokenSize);
        System.out.printf("Execution time: %.2f seconds%n", executionTime);
        System.out.println("Program terminated properly!");
    }
}
