import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class FactDecomp {
    


    public static void main(String[] args) {
      System.out.println(decomp(22));
    }


    public static String decomp(int n) {
       HashMap<Integer,String>map= new HashMap<>();
       List<String>list= new ArrayList<>();
       String result="";
       String r_result="";
       for(int i=0;i<n-1;i++){
       
        map.put(i+2,Integer.toString(i+2));
       }
       

     //   System.out.println(map);
        for(Integer index:map.keySet()){
          
           result+=toDecomp(map.get(index));
        }
     //   System.out.println(result);
        String[] str=result.split(" ");

        HashMap<String,Integer>map1= new HashMap<>();

        for(int k=0;k<str.length;k++)
        list.add(str[k]);

      //  System.out.println(list);

        for(String num : list){

            if(map1.get(num)==null)
             map1.put(num,1);
             else map1.put(num,map1.get(num)+1);
          }
        
     //   System.out.println(map1);
        
        
        List<Integer>num_arr= new ArrayList<>();
        for(String tmp:map1.keySet())
        {
            if(tmp.isBlank())continue;
            num_arr.add(Integer.parseInt(tmp));
            
        }

        num_arr.sort(null);
    //    System.out.println(num_arr);

         int m=0;
     for( m=0;m<num_arr.size()-1;m++){
        if(map1.get(String.valueOf(num_arr.get(m)))==1)r_result+=num_arr.get(m)+" * ";
        else  r_result+=num_arr.get(m)+"^"+map1.get(String.valueOf(num_arr.get(m)))+" * ";
     }

     if(map1.get(String.valueOf(num_arr.get(m)))==1)r_result+=num_arr.get(m);
     else  r_result+=num_arr.get(m)+"^"+map1.get(String.valueOf(num_arr.get(m)));

        return r_result.trim();
    }

    static String toDecomp(String tmp){
        String str="";
        int num = Integer.valueOf(tmp);
        int length =(int)Math.sqrt(num);
           
       
        for(int i=2;i<=length;i++){
            if(num%i==0){
             if(num/i==i)
            {
               
               return str+=String.valueOf(i)+" "+toDecomp(String.valueOf(i))+" ";
            }
            else
            {
             
              return str+=toDecomp(String.valueOf(i))+" "+toDecomp(String.valueOf(num/i))+" ";
               
            }
            }
        }
         
        return str+=String.valueOf(num)+" ";
       
    }

} 
