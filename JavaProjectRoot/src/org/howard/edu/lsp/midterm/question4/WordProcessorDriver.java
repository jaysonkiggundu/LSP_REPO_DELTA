package org.howard.edu.lsp.midterm.question4;

/**
 * Driver class to test the functionality of the WordProcessor class.
 * This class runs multiple test cases to ensure the correctness of the findLongestWords method.
 */
public class WordProcessorDriver {

    /**
     * Main method to test different cases of the WordProcessor class.
     * It tests sentences with different configurations, including multiple spaces, single words, and empty strings.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        
        // Test case 1: Sentence with a single longest word
        WordProcessor wp4 = new WordProcessor("This is a test with amazing results, amazing achievements!");
        List<String> longestWords4 = wp4.findLongestWords();
        System.out.println("Test 4 - Longest words: " + longestWords4);
        // Expected Output: ["achievements"]

        // Test case 2: Sentence with multiple occurrences of the same longest word and length
        WordProcessor wp2 = new WordProcessor("Java is a powerful tool!");
        List<String> longestWords2 = wp2.findLongestWords();
        System.out.println("Test 2 - Longest words: " + longestWords2);
        // Expected Output: ["powerful"]

        // Test case 5: Sentence with single character words
        WordProcessor wp5 = new WordProcessor("A B C D E");
        List<String> longestWords5 = wp5.findLongestWords();
        System.out.println("Test 5 - Longest words: " + longestWords5);
        // Expected Output: ["A", "B", "C", "D", "E"]

        // Test case 6: Empty string input
        WordProcessor wp6 = new WordProcessor("");
        List<String> longestWords6 = wp6.findLongestWords();
        System.out.println("Test 6 - Longest words: " + longestWords6);
        // Expected Output: []
    }
}
