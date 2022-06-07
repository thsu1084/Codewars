import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Dec2Fact {
  
  
   static final String list = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
  
  
  
  public static String dec2FactString(long nb) {
       String s="";

    System.out.println("nb"+nb);

      for(long i=1;i<Long.MAX_VALUE;i++){
          
        
            if(nb==0)break;        
            long a=nb%i;
            s+= list.charAt((int)a) ;
         
                nb=nb/i;

      }

      
  
      String result = "";
      
      for(int i=s.length()-1;i>-1;i--)result+=s.charAt(i);
    
      return result;

  }
  public static long factString2Dec(String str) {
    
    
      ArrayList<Integer>arr = new ArrayList<>();

    System.out.println(str);

        for(int i=0;i<str.length();i++){
            arr.add(list.indexOf(str.charAt(i)));
        }

        System.out.println(arr);
      
        long num = arr.size()*0+arr.get(0);



        System.out.println(num);

        ArrayList<Integer>copy = new ArrayList<>(arr);
        Collections.reverse(copy);

        System.out.println(arr.size()-1);

        for(int i=arr.size()-1;i>0;i--){


            long sum = num*i+copy.get(i-1); 
            System.out.println(sum);
            num = sum;
        }


    return  num;
   
    
    
  }
}
