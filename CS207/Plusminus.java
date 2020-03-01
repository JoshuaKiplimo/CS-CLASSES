public class Plusminus{
     public static void main(String[] args){
     
     int [] arr = {1,1,1,0,-1,-1,-1};
     
     double total = arr.length;
     double positive = 0;
     double negative = 0;
     double zero = 0;
     
     for(int i = 0; i <arr.length;i++){
       if (arr[i] > 0){
         positive ++;
         
       }
       else if(arr[i] < 0){
         negative ++;
         
       
       }
       else{
         zero ++;
       }
       
     
     
     }
     System.out.println((positive/total));
     System.out.println(negative/total);
     System.out.println(zero/total);
     
     
     
     
     
     
     
     }



}