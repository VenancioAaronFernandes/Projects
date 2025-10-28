import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
	public static void main(String[] args) {
		try{
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter first number:");
    	     int num1 = sc.nextInt();
    	     System.out.println("Enter second number");
    	     int num2 = sc.nextInt();
    	     System.out.println("Enter operator:");
    	     char operator = sc.next().charAt(0);
    	     switch(operator) {
    	         case '+':
    	             System.out.println("Result:"+(num1+num2));
    	             break;
    	         case '-':
    	             System.out.println("Result:"+(num1-num2));
    	             break;
    	         case '×':
    	             System.out.println("Result:"+(num1*num2));
    	             break;
    	         case '÷':
    	             if (num2 == 0){
    	                 throw new ArithmeticException("Division by Zero");
    	             }
    	             System.out.println("Result:"+((float)num1/num2));
    	             break;
    	         case '^':
    	             System.out.println("Result:"+(int)Math.pow(num1,num2));
                     break;
                 case '%':
                     System.out.println("Result:"+num1%num2);
                     break;
                 case 's':
                     System.out.println("Result:"+Math.sqrt(num1));
                     break;
    	 	    default:
    	             System.out.println("Invalid operator");
    	     }
		}catch (InputMismatchException e){
		    System.out.println("Invalid Input Format");
		}catch(ArithmeticException e){
		    System.out.println("Cannot Divide by zero");
		}
	}
}