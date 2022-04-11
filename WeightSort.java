import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
//weight for weight
public class WeightSort {
  
  public static String orderWeight(String strng) {
    
  long sum=0; 
  int i=0;
  ArrayList<Long> list = new ArrayList<> ();
  ArrayList<String> list1 = new ArrayList<> ();
  
            
            if(strng.equals(""))return "";
            String[] stChange = strng.split(" ");
            System.out.println(stChange[0]);
      
           
            
         
            for(String str: stChange){
           
            long to = Long.parseLong(str);
            
            
            while(to!=0){
            sum=sum+to%10;
            to=to/10;
            }
           
            
            
            list.add(sum);
            sum=0;
            
            
            }
            
            Collections.sort(list);
            //작은 수가 앞으로 오게 정렬 
            
            
            
            Arrays.sort(stChange);
            //아스키 코드 순으로 정렬 
        
             for(Long num: list){
             for(int j=0; j<stChange.length;j++){
           
            Long to = Long.parseLong(stChange[j]);
            
            
            while(to!=0){
            sum=sum+to%10;
            to=to/10;
            }
           
            
            
            if(num==sum)
            {
             list1.add(stChange[j]);
             stChange[j]="0";
           
            
            }
            sum=0;
            
            
            }
            }
         
           
            
            StringBuilder sb = new StringBuilder("");
            
          
            for(i=0;i<list1.size()-1;i++)
            sb.append(list1.get(i)+" ");
            sb.append(list1.get(i));
            
    
            String result = sb.toString();
           
          
           return result;
  }
}
