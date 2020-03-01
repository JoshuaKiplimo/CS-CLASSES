import java.util.Scanner;
public class helloworld{
  public static void main(String[]args){
   Scanner input = new Scanner(System.in);
   System.out.println("Enter a number n");
   int n = input.nextInt();
   char dash = '-';
     
     for(int i = 0; i <= n; i++){
     
       if(i==n-1){
           dash = ' ';
       }
       
       else{
        System.out.print("HelloWorld"+ dash);
        }
        
        
        
        
        
        }
  
  
  
  
  
  } 

}