public class Scramblies {
    
    public static boolean scramble(String str1, String str2) {
  
        int count=0;
   StringBuffer origin = new StringBuffer(str1);


   for(int i=0;i<str2.length();i++)
   {
      char c=str2.charAt(i);
      
      for(int j=0;j<origin.length();j++)
      {
          if(c==origin.charAt(j))
          {
           // System.out.println(str1.charAt(j));
            origin.deleteCharAt(j);
           // System.out.println(str1);
            count++;
            break;
          }
      }
   }
  
      
   if(str2.length()==count)
    return true;
    else
    return false;
       
    }
}
