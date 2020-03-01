import java.lang.Math;
public class diagonaldiffrence{
      public static void main(String []args){
      
      
      int[][] matrix =  { {1,2,3},{4,5,6},{7,8,9} };
      int left_diagonal = 0;
      for(int i = 0; i<matrix.length;i++){
        //System.out.println(matrix[i][i]);
        left_diagonal =+ matrix[i][i];
        
        }
      int right_diagonal = 0; 
      for (int j = 0; j<matrix.length;j++){
        //System.out.println(matrix[j][matrix.length -j -1]);
        right_diagonal =+ matrix[j][matrix.length -j -1];
      
      }
      
      System.out.println(Math.abs(left_diagonal - right_diagonal));
            
            
         
         
         
      
      
      
      
      
      
      
      
      }





}