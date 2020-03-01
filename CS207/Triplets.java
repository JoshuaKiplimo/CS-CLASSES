public class Triplets{
      public static void main(String[]args){
         int [] initial = {12,24,56,76,32,9,5};//initial array
         int [] triplet_a = {initial[0],initial[1],initial[3]};
         int [] triplet_b = {initial[4],initial[5],initial[6]};
         int n = initial.length;
         
         int Alice = 0;
         int Bob = 0;
         
         for(int i = 0; i<=2;i++){
            if (triplet_a[i] > triplet_b[i]){
                Alice++;
                 }
                 
            else if(triplet_a[i] < triplet_b[i]){
                Bob++;
                }
            }
      System.out.println("Alice: " + Alice + ", Bob: " + Bob);
   }
   }             
                
                
                
                
    