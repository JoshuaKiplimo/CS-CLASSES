import java.util.Scanner;

public class methods2{
   public static void main(String[]args){
   Scanner input  = new Scanner(System.in);
   System.out.println("Enter your first number: ");
   int num1 = input.nextInt();
   
   System.out.println("Enter your second number: ");
   int num2  =input.nextInt(); 
   
   
   
   System.out.println("The product of "+ num1 + " and " + num2 + " is: " + multiply2numbers(num1, num2) );
  
   }
   
   // Create a method that takes two integers and multiplies them.
   
   public static int multiply2numbers(int num1, int num2){
   
     int answer = 0;
     answer  = num1 * num2;
     return answer;
     
   }
    


}