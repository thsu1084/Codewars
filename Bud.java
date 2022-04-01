import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;





class Bud {
    public static String buddy(long start, long limit) {
          
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
    
       
        double num=0; 
        for(int i=(int)start;i<=limit;i++){
        
        num=Math.sqrt((double)i);  
        int temp=(int)Math.round(num);
      
    
        for(int j=1;j<=temp;j++){
          if(i%j==0)
          list1.add(j);
        }
      
        int arr=0;
        for(int k=1;k<list1.size();k++){
           arr=i/list1.get(k);
         
           list2.add(arr);
        }
     
     
        
        
        for(Integer tmp1:list1)
           list3.add(tmp1);
        for(Integer tmp2:list2)
           list3.add(tmp2);
    
    
           
       
    
       Set<Integer>set = new HashSet<>(list3);
      
      ArrayList<Integer> list4= new ArrayList<>(set);
     
    
     int sum=0;
     for(int z=0;z<list4.size();z++)
     sum+=list4.get(z);
       
     
      if(divisor(sum-1)==i&&(i<sum))
      {
        sum=sum-1;
        String str="("+i+" "+sum+")";
        return str;
      }
    
      
        
        
        list1.clear();
        list2.clear();
        list3.clear();
        list4.clear();



        
        
    
       

        
    }
     return "Nothing";
    }
  
  
    public static int divisor(int num) { 
      
     
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
    
       
      
        
        int temp=(int)Math.round( Math.sqrt((double)num));
      
    
        for(int j=1;j<=temp;j++){
          if(num%j==0)
          list1.add(j);
        }
      
        int arr=0;
        for(int k=1;k<list1.size();k++){
           arr=num/list1.get(k);
         
           list2.add(arr);
        }
     
     
        
        
        for(Integer tmp1:list1)
           list3.add(tmp1);
        for(Integer tmp2:list2)
           list3.add(tmp2);
    
    
           
       
    
       Set<Integer>set = new HashSet<>(list3);
      
      ArrayList<Integer> list4= new ArrayList<>(set);
     
    
     int sum=0;
     for(int z=0;z<list4.size();z++)
     sum+=list4.get(z);
       
      
    
        return sum-1; 

      }

  
  
}
