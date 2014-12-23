import javax.swing.JOptionPane;

/**
 * This simple program will ask a user to enter a number
 * seven times using a for loop.
 * The sum of the numbers entered will then be displayed using 
 * an accumulator variable.
 */

public class forLoopRunningTotal
{
  public static void main(String[] args)
  {
    int number;           // Entered number.
    int totalNumber = 0;  // Accumulator initialized to zero.
    int counter;          // For loop counter.
    String keyboardInput; //  
    
    for (counter = 1; counter <= 6; counter++)
    {
      // Prompt user to enter a number.
      keyboardInput = JOptionPane.showInputDialog("Enter a number.");
      number = Integer.parseInt(keyboardInput);
            
      // Add number to accumulator.
      totalNumber += number;      
    }
    
    // Display the sum of the numbers.
    JOptionPane.showMessageDialog(null, "The sum of the numbers entered is " + totalNumber + ".");
    
    System.exit(0);
    
  }
}
