import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
	public static void main(String[] args) {
		//Number guess game
		System.out.println("--Number Guessing Game (1 to 100)--") ;
		int number = (int) (Math.random()*100);
		boolean guess = false;
		Scanner sc = new Scanner(System.in);
		int attempts = 0;
		while (!guess){
		    try{
		        System.out.println("Enter your number:");
    		    int userguess = sc.nextInt();
    		    if (userguess == number){
    		        System.out.println("You guessed the number correctly");
    		        System.out.println("Number guessed in "+attempts+" tries!");
    		        guess = true;
    		    }
    		    else{
    		        if (userguess < number){
    		            System.out.println("Your guess is too small!");
    		            attempts+=1;
    		        }
    		        else{
    		            System.out.println("Your guess is too large");
    		            attempts+=1;
    		        }
    		    }
    		}
    		catch(InputMismatchException e){
    		    System.out.println("You have to enter a number!");
    		    sc.next();
    		}
		}


		    
		
	}
}