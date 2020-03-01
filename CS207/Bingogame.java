import java.util.Scanner;
import java.util.Random;

public class Bingogame{

   public static void main(String[]args){
   
   int[][]card = {{0,0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
         //To fill out the card we use random 
    
         Random rand = new Random();
         Scanner input = new Scanner(System.in);
         
         //create random numbers to fill out the boxes 
         
         for(int i = 0; i <card.length; i++){
            for (int j = 0; j < card[i].length; j++){
              if(i == 0){
                 int rand_int = rand.nextInt((15 - 1) + 1) + 1;
                 card[0][j] = rand_int;
                 }
              else if (i == 1){
                 int rand0 = rand.nextInt((30 - 15) + 1) + 15;
                 card[1][j] = rand0;
                 }
              else if(i == 2){
                 int rand2 =rand.nextInt((45 - 30) + 1) + 30;
                 card[2][j] = rand2;
                 }
                 
              else if(i == 3){
                 int rand3 =rand.nextInt((60 - 45) + 1) + 45;
                 card[3][j] = rand3;
                 }
                 
                 
               else if(i == 4){
                 int rand4 = rand.nextInt((75 - 60) + 1) + 60;
                 card[4][j] = rand4;
                 }   
         }
         
         //ASK for a number and put it in the array 
         
            int in = 0;
            for(int h =0; h<=4; h++){
            System.out.print("Give a number to input: ");
            in = input.nextInt();
            check(in, card);
            }
            
            
            //inner for
           
   
   



























}//main method
}

         public static String WIN(boolean [] array){
              
              for (int i =0; i<array.length; i++){
                  if(array[i] == false){
                   return "No matches";
                  }
                  
           
            }
            return "Matches! You win!";
            }
            
            public static void check(int in, int[]card){
            for(int  z= 0; z<card.length-1; z++){
            
               for(int j = 0; j<card[i].length-1; j++){
                          if (card[z][j] == in ){
                          card[z][j] = 0;
                          }
                          }//innnermost core
                }
            
            }



}//out 
