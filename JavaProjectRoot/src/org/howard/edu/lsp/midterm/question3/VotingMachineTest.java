/**
 * The VotingMachineTest class is used to test the functionality of the VotingMachine class.
 * It simulates an election with multiple candidates, casting votes, and displaying the winner.
 */
public class VotingMachineTest {

    /**
     * Main method to run the test case for the VotingMachine.
     * 
     * @param args Command line arguments (not used in this case).
     */
    public static void main(String[] args) {
        // Create an instance of VotingMachine
        VotingMachine vm = new VotingMachine();
        
        // Add candidates to the voting system
        vm.addCandidate("Alice");
        vm.addCandidate("Bob");
        vm.addCandidate("Charlie");

        // Cast votes for candidates
        vm.castVote("Alice");
        vm.castVote("Alice");
        vm.castVote("Bob");
        vm.castVote("Charlie");
        vm.castVote("Charlie");
        vm.castVote("Charlie");

        // Attempt to vote for a non-existent candidate
        boolean success = vm.castVote("Eve");
        System.out.println("Vote for Eve successful? " + success);

        // Display the winner of the election
        System.out.println("Winner: " + vm.getWinner());
    }
}
