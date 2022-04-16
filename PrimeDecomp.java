import java.lang.reflect.Array;
import java.util.*;
//Primes in Numbers
//소인수 분해 알고리즘 참고 
public class PrimeDecomp {
    public static void main(String[] args) {
        System.out.println(factors(7775460));
    }
    
    public static String factors(int n) {
        List<Integer>var = new ArrayList<>();
        List<Integer>list = new ArrayList<>();
        int[] arr = new int[2];
        int i=0;
        int share=0;
        for(i=2;i<=n;i++){
            if(n%i==0){
            list.add(i);
            n=n/i;
            System.out.println(n);
            if(isPrimeNumber(n)==false){
                System.out.println(n);
                list.add(n);
                break;
            }
           
            i=2;
            }
           
        }




        System.out.println("list: "+list);
        for(int j=0;j<list.size();j++){
            if(isPrimeNumber(list.get(j))==true){
            arr=Decomp(list.get(j));
            for(int q=0;q<arr[1];q++)
            list.add(arr[0]);
            }
        }
        System.out.println("list: "+list);

        List<Integer>result= new ArrayList<>();
        for(int l=0;l<list.size();l++){
            if(isPrimeNumber(list.get(l)))continue;
            result.add(list.get(l));

        }
        System.out.println(result);
        
        String answer="";
        HashMap<Integer,Integer>map= new HashMap<>();

        for(int num : result){

            if(map.get(num)==null)
             map.put(num,1);
             else map.put(num,map.get(num)+1);
          }

          Object[] mapkey = map.keySet().toArray();
          Arrays.sort(mapkey);
  
          List<Integer>temp = new ArrayList<>(map.keySet());
          temp.sort(null);

          for(int c=0;c<temp.size();c++)
         {    if(map.get(temp.get(c))==1)   
              answer=answer+"("+temp.get(c)+")";
              else  answer=answer+"("+temp.get(c)+"**"+map.get(temp.get(c))+")";
          }
        return answer;
    }


    public static boolean isPrimeNumber(int n){
        
        
        int index=(int) Math.sqrt(n);
        if(n<2)return true;
        if(n==2)return false;
        for(long i=2;i<=index;i++){
            if(n%i==0)return true;
        }
        return false;
    }

    public static int[] Decomp(int n){
        int[] arr=new int[2];
      
      for(int i=2;i<n;i=i+2){
          for(int j=2;j<n;j++){
          if(Math.pow(i, j)==n){
                arr[0]=i;
                arr[1]=j;
                
                return arr;
            }
          }
         arr= new int[2];
      }

          return arr;
    }

 
}
