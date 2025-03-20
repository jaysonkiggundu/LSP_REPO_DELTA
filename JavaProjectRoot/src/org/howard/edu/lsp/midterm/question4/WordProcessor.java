import java.util.ArrayList;
import java.util.List;

/**
 * WordProcessor class processes a sentence and returns all the longest words.
 * It handles various whitespace scenarios and returns the longest words in the order
 * they appear in the sentence.
 */
public class WordProcessor {
    
    // The sentence to be processed
    private String sentence;

    /**
     * Constructor to initialize the WordProcessor with a sentence.
     *
     * @param sentence The sentence to be processed.
     */
    public WordProcessor(String sentence) {
        this.sentence = sentence;
    }

    /**
     * Finds and returns all the longest words in the sentence.
     * 
     * It first splits the sentence by whitespace, finds the maximum word length,
     * and then returns all words of that length in the order they appear in the sentence.
     * If the input is empty or contains no words, it returns an empty list.
     *
     * @return A list of longest words found in the sentence.
     */
    public List<String> findLongestWords() {
        // List to store longest words
        List<String> longestWords = new ArrayList<>();
        
        // If the sentence is null or empty after trimming, return an empty list
        if (sentence == null || sentence.trim().isEmpty()) {
            return longestWords;
        }

        // Split sentence into words using regular expression to handle multiple spaces
        String[] words = sentence.trim().split("\\s+");
        
        // Variable to keep track of the maximum word length
        int maxLength = 0;

        // Find the length of the longest word
        for (String word : words) {
            maxLength = Math.max(maxLength, word.length());
        }

        // Collect all words that have the maximum length
        for (String word : words) {
            if (word.length() == maxLength) {
                longestWords.add(word);
            }
        }

        return longestWords;
    }
}
