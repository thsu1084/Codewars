import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class SumSquaredDivisors {
  
  public static String listSquared(long m, long n) {
   String result="";
        double temp=0;
        int num=0;
        ArrayList<Integer> list=new ArrayList<> ();
        ArrayList<String>  str= new ArrayList<>();
        for(long i=m;i<n;i++){

        temp  =Math.sqrt(i);
        num = (int)temp;
        
        for(int j=1;j<=num;j++){
            if(i%j==0){
             list.add(j);
             list.add((int) (i/j));
            }
        }



        Set<Integer>set = new HashSet<>(list);
      
        ArrayList<Integer> list1= new ArrayList<>(set);

        list1.sort(null);

        ArrayList<Integer> list2 =new ArrayList<>();

        for(int k=0;k<list1.size();k++){
            int value= (int)Math.round(Math.pow(list1.get(k), 2));
            list2.add(value);
        }
     
       // System.out.println(list2);
      
        int sum=0;
        for(int z=0;z<list2.size();z++){
            sum+=list2.get(z);
        }
      

      //  Math.sqrt(sum);
       
       // System.out.println(sum);
          
       
       temp  =Math.sqrt(sum);
       num = (int)temp;
      
      for(int j=1;j<=num;j++){
          if(sum%j==0){
           if(sum/j==j){
          
            result+=("["+i+", "+sum+"], ");
           }
          }
      }


        list.clear();
        list1.clear();
        list2.clear();
        }
        String r=""; 
        for(int k=0;k<result.length()-2;k++){
               r+=result.charAt(k);
        }

        return "["+r+"]";
  }
}
