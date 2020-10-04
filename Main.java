import java.util.Scanner;
/**
 * if the number is divisible by 3 you say Fizz, if it is divisible by 5 you say Buzz, and *  if it is divisible by both you say FizzBuzz.
 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create the Scanner
    Scanner input = new Scanner(System.in);
		//prompt user for input 
		System.out.println("Please enter a positive integer to see the FizzBuzz numbers");
		//get input form user
		int fizzbuzzNumber = input.nextInt();
		//set count as 0
		int count=0;
		//only works while count is less than the input number
		do {
			//increases count variable everytime the loop restarts
			count = count + 1;
			//iuf the number is divisble by both 5 & 3 say fizzbuzz
			if (count % 5 == 0 && count % 3 == 0){
				System.out.println("FizzBuzz");
				//if only divfisble by 5 say buzz
			} else if (count % 5 == 0){
				System.out.println("Buzz");
				//if only divisble by 3 say fizz
			} else if (count % 3 == 0){
				System.out.println("Fizz");
			} else {
				//if not divisble by any number say the number
				System.out.println(count);
			}
			//only works while fizzbuzznumber is greater than count
		}while (fizzbuzzNumber > count);
  }
}
