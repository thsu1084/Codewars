import java.util.ArrayList;
import java.util.Arrays;

public class FindTheOddInt {
    public static int  findIt(int[] a) {
       ArrayList<Integer> list1= new ArrayList<Integer>();
       ArrayList<Integer> list2 = new ArrayList<Integer>();
       Arrays.sort(a);
       int index=0;
       list1.add(0);
       for(int i=0;i<a.length-1;i++)
       {
           if((a[i]-a[i+1])!=0)
           {
              list1.add(i+1);         
                
           }
       }
       list1.add(a.length);
      
    for(int i=0;i<list1.size()-1;i++)
    {
         if((list1.get(i)-list1.get(i+1))%2!=0)
         {
           
           index=list1.get(i+1);
        
          
         }
    }   
    return a[index-1];
    }
}
