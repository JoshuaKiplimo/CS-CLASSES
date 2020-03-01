public class AverageGrades{
      public static void main(String[]args){
      
      int[] grades = {90, 80, 70, 60, 50, 40, 10};//initialize the list
      
      //Alternatively, int [] numbers = new int[7], int[7] is the size of the array
      
      //finding the average of the array..
         int sum  = 0;
         for(int i=0; i<grades.length; i++){
            sum = sum + grades[i];
            
          }
         System.out.println("The average of the grades in the array is: " + sum/grades.length);
      
      
      // finding the minimum number in the array 
      
      int temp_min = 1000;
      for(int i = 0; i < grades.length; i++){
          if (grades[i] < temp_min){
             temp_min = grades[i];
             System.out.println("The minimum value is "+ temp_min);
          
          
          }
          
     
     
           
      }
      
      //finding the maximum number in the array 
      int max_num = -1000;
      for(int j = 0; j < grades.length;j++){
        if (grades[j] > max_num){
           max_num = grades[j];
           System.out.println("The max value is "+ max_num);
            
        
        }
     }

      
      
      
      }
      




}