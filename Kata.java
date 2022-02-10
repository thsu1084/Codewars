import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Kata {
    public static String getMiddle(int num) {
      
        int share = 0;
        int remainder = 0; 
        int count = 0;
        ArrayList list1 = new ArrayList() ; 
        boolean flag = true;
       
          while(flag){
          remainder=num%10;
          share=num/10;
          
          if(remainder != 0){
            list1.add(Integer.toString((int)Math.pow(10,count)*remainder));
          }
          if(share == 0){
            flag = false;  
           }
          count++;
          num=share;
        }
        Collections.reverse(list1);
        return String.join("+", list1);
       
      }
    
}

