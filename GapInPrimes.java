import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

class GapInPrimes {
    
     static HashMap<Long,Long>map = new HashMap<>();
   
    public static long[] gap(int g, long m, long n) {
        // your code
        long[] answer= new long[2];
        long index=0;
        

      

       

        for(long i=m;i<n+1;i++){
           if( PrimeNumber(i)){
          
            map.put(index, i);
            index++;
        
           }
        }


     //   System.out.println(map);


        for(long i=0;i<map.size()-1;i++){
            if(map.get(i+1)-map.get(i)==g){
                answer[1]= map.get(i+1);
                answer[0]= map.get(i);
                return answer; 
            }
        }
       
       return null;
    }

    static boolean PrimeNumber(long num){



        for(long i=2;i<=Math.sqrt(num);i++){
            if(num%i==0)return false;
        }

        
        return true;
    }

  
}
