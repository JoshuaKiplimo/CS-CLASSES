
import java.util.*; // among others this is to import scanner, exeptions and random
class GameArr{
    //UNIVERSAL VARIABLES
       static int r = 0; //row   
       static int c = 0; //column
       static String [][] arr = {{"_","_","_","_","_","_","_","_","_","_","_","_","_","_","_"},{"_","_","_","_","_","_","_","_","_","_","_","_","_","_","_"},{"_","_","_","_","_","_","_","_","_","_","_","_","_","_","_"},{"_","_","_","_","_","_","_","_","_","_","_","_","_","_","_"},{"_","_","_","_","_","_","_","_","_","_","_","_","_","_","_"},{"_","_","_","_","_","_","_","_","_","_","_","_","_","_","_"}};
       static boolean condition = false;
       static int count = 0;//to count moves
  public static void main(String[] args) {
      RefreshScreen();//to print new lines
      StartGame();
    //INCASE OF FAILURE, THESE WILL ALWAYS BE THE DEFAULT OBSTACLES. THESE ARE OBSTACLES GENERATED ONLY DURING THE FIRST GAME, REST WILL BE RANDOM.
    arr[0][10] = "|"; arr[3][5] = "|"; arr[5][5] = "|"; arr[1][5] = "|";arr[4][1] = "|";
    condition = false;
    //TO CREATE FIRST GAME..
     RefreshScreen();//to always make the board appear in one line
     CreateArray(arr);
     while (condition == false){ //RUN UNTIL CONDITION BECOMES TRUE
     moveplayer(arr);
     //CreateArray(arr);
     }
  } //MAIN METHOD
    public static void CreateArray(String[][]arr){
        System.out.println("-----------------------");
        System.out.println("    BOARD GAME         ");
        System.out.println("-----------------------");
        System.out.print( "Spawning...");
        System.out.print( "\n\n");
        arr[r][c] = "X";
        arr[5][10] = "O";
        //CREATE A LOOP THAT WILL STOP ONCE OBSTACLES ARE PLACED IN THE RIGHT RANDOM PLACES
            for(int i= 0;i<arr.length;i++){
                for (int j = 0; j < arr[i].length; j++)
                if(j == (arr[i].length-1)){
                    System.out.println("\n");//Print a new line whenever we reach the end of the array
                }
                else{
                    System.out.print(arr[i][j]);
                }
            }
        }//printarray method
    public static void moveplayer(String[][]arr){
            Scanner input = new Scanner(System.in);
            arr[r][c] = "X";
            System.out.println("CURRENT POINTS: "+ count);
            System.out.print("4 for left, 8 for up, 6 for right, 2 for down: ");
        try{
            int num = input.nextInt();
             //to find cases where the user gets out of bounds
            if(num == 4){ //to make sure that the player does not go past the left limit
                try{
                arr[r][c] = "_";
                c--;
                CheckObstacles(arr);
                arr[r][c] = "X"; 
                RefreshScreen();}
               catch(Exception e) {
               c++;//recreate original board
               arr[r][c] = "X";
               RefreshScreen();
               System.out.println("YOU WENT OUT OF THE LEFT BOUND!");
               }  
            }
            else if(num == 8){
                try{
                arr[r][c] = "_";
                r--;
                CheckObstacles(arr);
                arr[r][c] = "X";
                RefreshScreen();}
                catch(Exception e){
                   r++;//reverse back to original
                   arr[r][c] = "X";
                   RefreshScreen();
                   System.out.println("YOU WENT OUT OF TOP BOUND!"); 
                }
            }
            else if(num == 6){ 
                try{
               arr[r][c] = "_";
               c++;
               CheckObstacles(arr);
               arr[r][c] = "X";
               RefreshScreen();
                }
                catch(Exception e){
                   c--;//reverse back to original
                   arr[r][c] = "X"; 
                   RefreshScreen();
                   System.out.println("YOU WENT OUT OF RIGHT BOUNDS!"); 
                } 
            }
            else if(num == 2){
              try{
              arr[r][c] = "_";
              r++;
              CheckObstacles(arr);
              arr[r][c] = "X";
              RefreshScreen();//to always make one board appear at a given time
              }
              catch(Exception e){
                   r--;//reverse back to original
                   arr[r][c] = "X"; 
                    RefreshScreen();//to always make the board appear in one line
                    System.out.println("YOU WENT OUT OF BOTTOM BOUNDS!");
                }
            }
            else{
                try{
                RefreshScreen();
                System.out.println("THATS A WRONG INPUT");
                arr[r][c] = "X";}
                catch(InputMismatchException f) {
                 System.out.print("yeet"); //try to find out specific reason.
                 }                    
            } 
            }//try
            catch(InputMismatchException exception){
                RefreshScreen();//////
                System.out.println("ILLEGAL INPUT. ENTER A NUMBER!");
            }
           if (condition == true){
               System.out.println("CHECK YOUR MOVES!");
               System.out.println("DO YOU WANT TO PLAY AGAIN? Enter 1 for yes or 2 for no");
               int yesno = input.nextInt();
               if(yesno == 1){
                   ResetBoard(arr);
                   CreateArray(arr);
                   while (condition == false){
                    moveplayer(arr);
                    //CreateArray(arr);
                        }  
               }
               else{
                   System.out.println("Goodbye! see you later!");
               }
               //create a way to create a new game....
           }
           else{
           count++; //count the players moves
           CreateArray(arr);
           CheckWin(arr);
           if (condition == true){
               System.out.println("DO YOU WANT TO PLAY AGAIN? Enter 1 for yes or 2 for no");
               int yesno = input.nextInt();
               if(yesno == 1){
                   ResetBoard(arr);
                   CreateArray(arr);
                   while (condition == false){
                    moveplayer(arr);
                    //CreateArray(arr);
                        }  
               }
               else{
                   System.out.println("Goodbye! see you later!");
               }
               //create a way to create a new game....
           }
           }
           }
    public static void CheckWin(String [][]arr){///to check for win
         if(r== 5 && c == 10){
              System.out.println("YOU WIN!!!! YOU WON AFTER "+ count + " moves");
              condition= true;
           }}
    public static void CheckObstacles(String [][]arr){
        if(arr[r][c] == "|"){
            System.out.println("YOU HIT A OBSTACLE AFTER "+ count +" moves. YOU ARE OUT!!!");
            condition = true;
        } 
    }
    public static void StartGame(){
        System.out.println("HELLO! THIS IS A GAME TO TEST HOW FAST YOU CAN MOVE WITHOUT HITTING THESE OBSTACLES '|'\n\nX IS THE PLAYER, O IS THE GOAL.\n\nEVERY MOVE YOU MAKE IS 1 POINT.\n\nTRY HAVING AS FEW COUNTS AS POSSIBLE\n\nHITTING EXTREME EDGES CONTS AGAINST YOU.\n\n4 IS FOR LEFT, 8 IS FOR UP, 6 IS FOR RIGHT, 2 IS FOR DOWN\n\n");
        boolean y = true;
        while(y){
        Scanner in = new Scanner(System.in);
        System. out.print("ARE YOU READY? 1 for yes or 2 for no: ");
        int yn = in.nextInt();
        if(yn == 1){
            y= false;
        }
        else{
            System.out.println("Okay..waiting");
            y= true;
        }    
        }
    }
    public static void RefreshScreen(){
        System.out.print( "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    public static void ResetBoard(String[][] arr){
          r = 0; c = 0; count = 0;
          arr[r][c] = "X";
          Random rand = new Random(); //INSTANCE OF RANDOM...
          for(int i = 0; i <=3 ;i++){
          int r1 = rand.nextInt(5);//random position in outer row...
          int r2 = rand.nextInt(14); //create a random position in the outer row..
        //The random position should not be in BEGINNING and TARGET AS IN [0][0] AND [5][10]
        if ((r1 != 0 && r2 != 0) || (r1 != 5 && r2 != 10) ){ //To make sure we do not add obstacles where the begining and target is...
            arr[r1][r2] = "|";
            //change obstacles after changing the condition
        }
        else{ //if these obstacles are in TARGET and POSITION, create default positions
            arr[0][10] = "|";
            arr[3][5] = "|";
            arr[5][14] = "|";
           //change obstacles after changing the condition 
        }//else
        }//for 
    }
}