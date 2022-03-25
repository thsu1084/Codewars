public class Solution{
  
  public static boolean validParentheses(String parens)
  {
        int num1=0;
        int num2=0;
        int num=0;
        int num3=0;
        for(int i=0;i<parens.length();i++){

        char c = parens.charAt(i);
        
        num=c;

        

        if(num==41)num2++;
        else if(num==40)num1++;

        }

     
       num=parens.length();
       if(num1==num2){
      
        StringBuffer str=new StringBuffer(parens);

        for(int j=0;j<num;j++){
            if(str.charAt(j)=='('){
                str.deleteCharAt(j);
                num--;
                for(int k=j;k<num;k++){
                    if(str.charAt(k)==')'){
                        str.deleteCharAt(k);
                       
                        num--;
                        break;
                    }
                }
            }
            
        }
     
       
       num1=0;
       num2=0;
       for(int i=0;i<str.length();i++){

        char c = str.charAt(i);
        
        num3=c;

        

        if(num3==41)num2++;
        else if(num3==40)num1++;

        }
        
         if(num1!=num2)return false;
         else{
           num=str.length();
            for(int j=0;j<num;j++){
                if(str.charAt(j)=='('){
                    str.deleteCharAt(j);
                    num--;
                    for(int k=j;k<num;k++){
                        if(str.charAt(k)==')'){
                            str.deleteCharAt(k);
                            System.out.println(str);
                            num--;
                            break;
                        }
                    }
                }
                
            }
          
            num1=0;
            num2=0;
            for(int i=0;i<str.length();i++){
     
             char c = str.charAt(i);
             
             num=c;
     
             
     
             if(num==41)num2++;
             else if(num==40)num1++;
     
             }
           if(num1!=num2)return false;
           else {
              for(int k=0;k<str.length()-1;k++){
                 if(str.charAt(k)==')'&&str.charAt(k+1)=='(')
                 return false;
                 
              }
              return true;
           }
         } 

       }
       else return false;
        
  }
}
