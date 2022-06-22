import java.util.Scanner;
/**
 * A simple algorithm to display the Fibonacci Series with some basic explaination on how the
 * next values of the sequence are calculated
 * @author Gazi MD Wasi-UL-Hoque Eusha
 * @version 14 June 2022
 */
public class FibonacciSeries {

    /**
     * Brief fibonacci series explaination
     * @param in for user input
     */
    public static void fibonacciExplain(Scanner in) {
        
        System.out.println("----Fibonacci Explaination----");
        System.out.println("Fibonacci is a series of sequence, where the value of the next number can be found by adding " + 
        "the previus two nembers before it.");
        System.out.println("The sequence was first developed in the 13th century by an italian mathematican called " + 
        "Fibonacci");
        System.out.println("The series has several appilications in mathematics, computer science" + 
        " Nature, and is very significant because of the golden ratio(1.618 or its inverse 0.618).");
        System.out.println("In the sequence any given number is approximately 1.618 time the prior number except for the " +
        "first few numbers!");
        System.out.println("A working example of the series: ");
        fibonacciSeries(in);
        System.out.println();
        yesOrNoTribonacci(in);

    }

    /**
     * Method to calculate the Fibonacci series 
     * @param in for user input
     */
    public static void fibonacciSeries(Scanner in) {

        // variable declaration
        int limit;          // to stop till user selected number
        int previous = 0;   // to store the previous value of the series
        int next  = 1;      // to find the next value in the series
        int current = 0;    // to hold the current value of the series

        // input prompt
        System.out.print("How many values of the sequence you want to see? ");
        limit = in.nextInt();

        // loop for calculating fibonacci number
        for(int i = 0; i < limit; i++){
            
            System.out.print(next + " "); // display the series horizontally
            current = next;         // assigning the current number
            next = next + previous; // calculating the next number
            previous = current;     // assigning the current number of the iteration to hold for calculation
            
        }
        
    }

    /**
     * Method to calculate the Tribonacci series 
     * @param in for user input
     */
    public static void tribonacciSeries(Scanner in) {
        
        // variable declaration
        int number1 = 0, number2 = 0, number3 = 1;  // three numbers for series calculation
        int output = 0;                             // for displaying the numbers
        int limit;                                  // to stop till user selected number

        // input prompt
        System.out.print("How many values of the sequence you want to see? ");
        limit = in.nextInt();

        for(int i = 0; i < limit; i++ ){

            output = number1 + number2 + number3; // calculation
            System.out.print(output + " ");
            // replacing values after each iteration
            number3 = number2;
            number2 = number1;
            number1 = output;

        }

    }

    /**
     * to check whether or not the user wants to view Tribonacci sequence
     * @param in to take in user input
     */
    public static void yesOrNoTribonacci(Scanner in) {

        //variable declaration
        int userIn; // to know what choice user made
        boolean validChoice = false; // for validation if the user selects invalid options

        // message output
        System.out.println("Another sub branch of the fibonacci sequence is the tribonacci sequence");
        System.out.println("Very similar to fibonacci, this sequence uses three numbers to do the calculation!");
        System.out.print("Want to see the tribonacci sequence? (1. For YES/2. For NO): "); // user input prompt
        userIn = in.nextInt();

        // to validate user choice
        do {

            switch (userIn) {
                case 1:
                    tribonacciSeries(in);
                    validChoice = true;
                    break;
                case 2:
                    System.out.println("Will not display tribonacci series :(");
                    validChoice = true;
                    break;
                default:
                    System.out.println("1. For YES \n2. For NO");
                    System.out.print("Invalid Choice!!!\nRe enter your chice: ");
                    userIn = in.nextInt();
                    break;
            }       

        } while (validChoice == false);
                
    }

    public static void main(String[] args) {

        // variable declaration
        Scanner in = new Scanner(System.in);
        fibonacciExplain(in); // starter method for the fibonacci series
    }
}