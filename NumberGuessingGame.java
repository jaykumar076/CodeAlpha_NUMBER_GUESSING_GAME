import javax.swing.JOptionPane;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;

        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        JOptionPane.showMessageDialog(null, "Welcome to the Number Guessing Game!");

        while (!hasGuessedCorrectly) {
            String input = JOptionPane.showInputDialog("Enter your guess (1-100):");

            try {
                int userGuess = Integer.parseInt(input);
                attempts++;

                if (userGuess < targetNumber) {
                    JOptionPane.showMessageDialog(null, "The target number is higher.");
                } else if (userGuess > targetNumber) {
                    JOptionPane.showMessageDialog(null, "The target number is lower.");
                } else {
                    hasGuessedCorrectly = true;
                    JOptionPane.showMessageDialog(null, "Congratulations! You've guessed the correct number: " + targetNumber + "\nIt took you " + attempts + " attempts.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number.");
            }
        }
    }
}
