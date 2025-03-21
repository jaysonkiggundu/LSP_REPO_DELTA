package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

/**
 * The VotingMachine class simulates a simple electronic voting machine. It allows adding candidates,
 * casting votes for valid candidates, and determining the winner based on votes.
 */
public class VotingMachine {
    
    // A map to store candidates' names and their corresponding vote count.
    private Map<String, Integer> candidatesVotes;

    /**
     * Constructor to initialize the voting machine.
     * Initializes the map to hold candidate names and their vote counts.
     */
    public VotingMachine() {
        candidatesVotes = new HashMap<>();
    }

    /**
     * Adds a new candidate to the voting system. If the candidate already exists, the method does nothing.
     * 
     * @param candidateName The name of the candidate to be added.
     */
    public void addCandidate(String candidateName) {
        // Only add the candidate if not already present
        if (!candidatesVotes.containsKey(candidateName)) {
            candidatesVotes.put(candidateName, 0); // Initialize vote count to 0
        }
    }

    /**
     * Casts a vote for a given candidate. If the candidate does not exist, it returns false.
     * 
     * @param candidateName The name of the candidate for whom the vote is being cast.
     * @return true if the vote is successfully cast, false if the candidate doesn't exist.
     */
    public boolean castVote(String candidateName) {
        if (candidatesVotes.containsKey(candidateName)) {
            candidatesVotes.put(candidateName, candidatesVotes.get(candidateName) + 1);
            return true;
        }
        return false; // If the candidate doesn't exist, return false
    }

    /**
     * Determines and returns the winner of the election, who is the candidate with the most votes.
     * 
     * @return A string stating the winner and their total number of votes.
     */
    public String getWinner() {
        String winner = null;
        int maxVotes = 0;

        // Iterate through the candidates' votes to find the one with the highest number of votes
        for (Map.Entry<String, Integer> entry : candidatesVotes.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        return winner + " WINS with " + maxVotes + " votes!!"; // Format the result string
    }
}
