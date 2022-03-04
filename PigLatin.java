import java.util.ArrayList;
public class PigLatin {
    public static String pigIt(String str) {
 
      
         
    String[] words = str.split("\\s");
        
    ArrayList<String> list = new ArrayList<String>();
    for (String wo : words ){
      
           
            //char[] arr = new char[wo.length()+2];

            
            int j=0;
           
            if(65<=wo.charAt(0)&&wo.charAt(0)<=90||97<=wo.charAt(0)&&wo.charAt(0)<=122){
            char[] arr = new char[wo.length()+2];
            if(wo.length()>1){
            for (int i = 1; i < wo.length(); i++) {
                 arr[j++] = wo.charAt(i);
            }
            arr[j++]=wo.charAt(0);
            arr[j++]='a';
            arr[j]='y';
            }
            else{
            arr[0]=wo.charAt(0);
            arr[1]='a';
            arr[2]='y'; 
            }
             String str1 = String.valueOf(arr);
              list.add(str1);
            }
            else{
            char[] arr = new char[wo.length()];
            arr[j++]=wo.charAt(0);  
              String str1 = String.valueOf(arr);
               list.add(str1);
            
            }
        
             
             
            // String str1 = String.valueOf(arr);
            
             //list.add(str1);
          
        }
        String str2="";
     if(list.size()>1){  
     for (int i=0;i<list.size()-1;i++) {
      
       
       str2+= list.get(i)+" ";
      
    }
      str2+=list.get(list.size()-1);
     }
    else{
      str2+=list.get(0);
    }
      
      
      //System.out.println(str2);
     return str2;
       
      
       
    }
}
