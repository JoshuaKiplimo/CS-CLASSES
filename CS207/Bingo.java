import java.util.Scanner;
import java.util.Random;

public class Bingo{

           
            
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
        
         
         
         
         
        
         
         
         
         
         for(int k = 0; k <= 4; k++){
            System.out.print("Give a number to input: ");
            int in = input.nextInt();
            
            for(int z = 0; z<card.length-1; z++)
             {
               for(int j = 0; j<card[i].length-1; j++)
                {
                          if (card[z][j] == in ){
                          card[z][j] = 0;
                          }
                       
                }
                }
            
          }
          }
          
           ///METHOD TO CHECK IF PLAYER HAS WON
           
                  
           //To check left diagonal
           
           boolean [] checker = {false, false, false, false, false};
           for(int i = 0; i<card.length; i++){
              if (card[i][i] == 0){
                  checker[i] = true;
                                    
                
                }
                }
                
               
                
           //check for win
           System.out.println("Left diagonal "+ WIN(checker));
           //if loss check for the other diagonal
           
           boolean [] checker2 = {false,false,false,false,false};
           
           for (int j = 0; j<card.length; j++){
               if (card[j][card.length-1-j] == 0){
                  checker2[j] = true;
                  }
              }
            
              
           // create method to check for win
           System.out.println("Right diagonal "+ WIN(checker2));

           
           
              
              
              //}
           
           
               //}
           //if loss check for rows
           
             
          boolean [] checker3 = {false,false,false,false,false};
           for(int i = 0; i<card.length; i++){
                for (int j = 0; j<card[i].length-1; j++){
                    //for row 1
                    if (card[i][j] == 0 && i == 0){
                        checker3[j] = true;

                    }
                    System.out.println("Row 1"+ WIN(checker3));

                    //for row 2
                    if (card[i][j] == 0 && i == 1){
                        checker3[j] = true;

                    }
                    System.out.println("Row 2"+ WIN(checker));

                    //for row 3
                    if (card[i][j] == 0 && i == 2){
                        checker3[j] = true;

                    }
                    System.out.println("Row 3 "+ WIN(checker));

                    //for row 4
                    if (card[i][j] == 0 && i == 3){
                        checker3[j] = true;

                    }
                    System.out.println("Row 4 "+ WIN(checker));

                    //for row5
                    if (card[i][j] == 0 && i == 4){
                        checker3[j] = true;

                    }




                }
                 
                

  }
                
   }             
               





         public static String WIN(boolean [] array){
              
              for (int i =0; i<array.length; i++){
                  if(array[i] == false){
                   return "No matches";
                  }
                  return "Matches! You win!";
           
            }
            return "Matches! You win!";

}




}