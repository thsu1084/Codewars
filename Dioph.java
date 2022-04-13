import java.util.*;
public class Dioph {

   
    public static String solEquaStr(long n) {
    StringBuffer sb = new StringBuffer();
    List<List>list = new ArrayList<>(measure(n));

    




    if(list.isEmpty()){
      List<Long>arr = new ArrayList<>();
      arr.add((long) 1);
      arr.add(n);
      list.add(arr);
    }
    String result="";
    long x=0;
    long y=0;

    int i=0;
    for( i=0;i<list.size();i++){
      Long num1=(Long) list.get(i).get(0);
      long num2=(long)list.get(i).get(1);
     // System.out.println(num1);
     // System.out.println(num2);
      if((num1+num2)%2==0&&(num1+num2)/2>=0)
        {
           x=(num1+num2)/2;
           System.out.println("x "+x);
          if((num2-x)%2==0&&(num2-x)/2>=0){
            y=((num2-x)/2);
            
            System.out.println("y "+y);
           
            sb.append("[");
            sb.append(String.valueOf(x)); 
            sb.append(", ");
            sb.append(String.valueOf(y));
            sb.append("]");
            //if(i!=list.size()-1)
            sb.append(", ");
          }
        }
       
    
       
    }

    /*
     int   num1=(int)list.get(i).get(0);
     int   num2=(int)list.get(i).get(1);
     // System.out.println(num1);
     // System.out.println(num2);
      if((num1+num2)%2==0&&(num1+num2)/2>=0)
        {
           x=(num1+num2)/2;
           System.out.println(x);
          if((num2-x)%2==0&&(num2-x)/2>=0){
            y=(int)((num2-x)/2);
            
            System.out.println(y);
            result+="["+x+","+y+"]";
          }
        }
       
     */
  //  if(result.length()-1!=-1)
  //  result= result.substring(0,result.length()-1);
    
    result=sb.toString();
      
    if(result.length()-1!=-1)
    {
     result= result.substring(0,result.length()-1);
     result= result.substring(0,result.length()-1); 
    }   
      
    result="["+result+"]";
    System.out.println(result);
  //  char[] test = result.toCharArray();
    
    return result;
  }


  static List measure(long num){
   
  int sqrt = (int) Math.sqrt(num); 
  List<Long> arr = new ArrayList<>(); 
  List<List>index= new ArrayList<>();


  for(long i=1;i<=sqrt;i++){
    if(num%i==0){
      arr.add(i);
      arr.add((num/i));
      //System.out.println(i);
    }
    if(arr.isEmpty())continue;
    index.add(arr);
    //System.out.println(index);
    arr = new ArrayList<>();
  }

   //System.out.println(index);

  return index;
  }
}



