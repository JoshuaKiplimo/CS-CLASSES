public class minmax{
     public static void main(String[]args){
           int [] arr = {1,3,5,7,9};
           int max = arr[0];
           int min = arr[0]; 
           int sum = 0;          
           for(int i = 0; i < 5; i++){
              sum = sum + arr[i];
             
              if(arr[i] > max){
                max = arr[i];
              }
              if (arr[i] <min){
                min = arr[i];
              }
              
              
           
           
              
              
              
              
              
           
           
           }
          System.out.println("Maximum sum "+ (sum - min)+ " minimum sum "+ (sum - max));
          System.out.println(min);
          System.out.println(max);
          System.out.println(sum);
     
     
     
     }


}