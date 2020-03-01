public class birthdaycakes{
      public static void main(String [] args){
       
       int [] arr = {4,3,2,1,3};
       int total_candles = 0;
       int max = arr [0];
       for (int i =1; i < arr.length-1; i++){
          if(arr[i]>max){
            max = arr[i];
            
          }
      
       
       }
       for (int i = 1; i<arr.length-1; i++){
         if (arr[i] == max){
          total_candles ++;
         }
       
       }
       System.out.println(total_candles);
       
       
      
      }







}