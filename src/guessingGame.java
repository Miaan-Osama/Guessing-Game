
import javax.swing.*;

public class guessingGame {

    public static void main(String[] args) {
        int numberToGuess = (int) (Math.random()*100 + 1);
        int gussedNumber = 0;
        System.out.println("The correct guess would be " + numberToGuess);
        int count = 1;

        while (gussedNumber != numberToGuess)
        {
            String response = JOptionPane.showInputDialog(null,
                "Enter a guess between 1 and 100", "Guessing Game", 3);
            gussedNumber = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ determineGuess(gussedNumber, numberToGuess, count));
            count++;
        }  
    }

    public static String determineGuess(int gussedNumber, int numberToGuess, int count){
        if (gussedNumber <=0 || gussedNumber >100) {
            return "Your guess is invalid";
        }
        else if (gussedNumber == numberToGuess ){
            return "Correct!\nTotal Guesses: " + count;
        }
        else if (gussedNumber > numberToGuess) {
            return "Your guess is too high, try again.\nTry Number: " + count;
        }
        else if (gussedNumber < numberToGuess) {
            return "Your guess is too low, try again.\nTry Number: " + count;
        }
        else {
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
}
