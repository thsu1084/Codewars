import java.util.Arrays;
import java.util.*;

public class ToSmallest {
    
    public static Long[] smallest(Long n) {
      
       
        List <Long> list = new ArrayList<>();
        HashMap<List,Long> map = new HashMap<>();
        List<Long>pair= new ArrayList<>();
        Long  minValue = Long.MAX_VALUE;
/*
     for(Long num : list){

     if(map.get(num)==null)
      map.put(num,(long) 1);
      else map.put(num,map.get(num)+1);
   }
*/
        String form=String.valueOf(Long.valueOf(n));
        List<List> listindex =indexList(form.length()); 
        //System.out.println(listindex);
        for(List temp:listindex)
       { 
         if (temp.get(0) == temp.get(1)) continue;
         Long swapV = swap(String.valueOf(Long.valueOf(n)),(long)temp.get(0), (long)temp.get(1));
     
        
         minValue = Long.min(minValue, swapV);
       
        if((long)minValue==(long)swapV){
         pair= new ArrayList<>();
         pair.add((long)temp.get(0));
         pair.add((long)temp.get(1));
         //System.out.println(pair);
         //System.out.println(minValue);
         map.put(pair, minValue);
         }
       
        }

       
        Long long1=minValue;
        Long long2 = pair.get(0);
        Long long3 = pair.get(1);

        //System.out.println("num:"+(long)(pair.get(0)-1));
        //System.out.println(pair);
        if((long)swap(String.valueOf(Long.valueOf(n)),(long)pair.get(0), (long)pair.get(1))==(long)swap(String.valueOf(Long.valueOf(n)),(long)pair.get(1), (long)pair.get(0)))
        {
         
      //  System.out.println("same");
         if((long)pair.get(0)>(long)pair.get(1)){
             long2=pair.get(1);
             long3=pair.get(0);
         }
         //System.out.println(long2);
         //System.out.println(long3);
        }
        
        //System.out.println(map);
      
        for(List temp:map.keySet()){
            
      
             if((long)minValue==map.get(temp))
             {
                 
                if((Long)temp.get(0)<=long2){
                    if((Long)temp.get(1)<=long3)
                    {
                        long2=(Long)temp.get(0);
                        long3=(Long)temp.get(1);
                    }
                }
                 
             }

       }

     
        Long[] arr={long1,long2,long3}; 
        return arr;
    }



    public static Long swap(String num,long a,long b){
        
        System.out.println(num);
        char[] n= num.toCharArray();
        HashMap<Integer,Character> map = new HashMap<>(num.length());
        char temp;
      
        
        if(a-b==1||a-b==-1){
          
          temp=n[Long.valueOf(b).intValue()];
          n[Long.valueOf(b).intValue()]=n[Long.valueOf(a).intValue()];
          n[Long.valueOf(a).intValue()]=temp;
        
        }
        else if(a>b){
        
        map.put((int) b,n[(int) a]);

       

        for(int i=Long.valueOf(b).intValue();i<a;i++)
        map.put((i+1),n[i]);
        
       // System.out.println(map);

        for(int j=(int) (a+1);j<n.length;j++)
          map.put( j,n[j]);
        
       // System.out.println(map);
        
        for(int k=0;k<b;k++)
        map.put(k, n[k]);
       // System.out.println(map);
        int k=0;
        for(Integer tmp: map.keySet())
             n[k++]=map.get(tmp);
        }
        else if(a<b) {

           
            map.put((int) b,n[(int) a]);
           // System.out.println(map);
            for(int i=(int) (a+1);i<b;i++)
            map.put(i-1, n[i]);
          //  System.out.println(map);

            for(int j=0;j<a;j++)
            map.put(j, n[ j]);

            for(int k=(int) (b+1);k<n.length;k++)
            map.put(k, n[k]);

            map.put((int) (b-1), n[(int) b]);
          //  System.out.println(map);
            int k=0;
            for(Integer tmp: map.keySet())
             n[k++]=map.get(tmp);
        }


         return Long.valueOf(String.valueOf(n));
        }
     
        public static List indexList (long num){
         List<ArrayList>list = new ArrayList<>();
         List<Long>index;
         //= new ArrayList<>();
         for(long i=0;i<num;i++){
     
          // index= new ArrayList<>();
           for(long j=0;j<num;j++){
             index = new ArrayList<>();
             index.add(i);
            index.add(j);
          
            list.add( (ArrayList) index);  
           }
         
         }
         return list;
        }
}
