public class CharacterCounter {
    
    public CharacterCounter() {
    }

    public static void validateWord(String word){
    int[] arr;
    arr=new int[127] ;
    int legnth = word.length();
    
    for (int i = 0; i < arr.length; i++) {

       
            arr[i] = 0; 
    
        
    
    }
    
    for(int i=0;i<legnth;i++){
     char character = word.charAt(i);
      int ascii=(int)character;
      
       for(int x=97;x<123;x++)
           if(ascii==x)
            ascii=ascii-32;
     // System.out.println(ascii);

      for(int j=0;j<127;j++)
      {  
          if(ascii==j){
             
            arr[j]=arr[j]+1;

          }
            
      }


    }

    for(int i=0;i<127;i++)
    System.out.println(arr[i]);
    int count=0;
    if(word.length()%2==0){
        for(int i=0;i<127;i++)
        {
            if(arr[i]!=0)
            {
                count=arr[i];
                break;
            }
        }
        for(int i=0;i<127;i++)
        if(arr[i]!=count)
           if(arr[i]!=0)
            System.out.println("false");
    }
    else{
        for(int i=0;i<127;i++)
        {
            if(arr[i]!=0)
            {
                count=arr[i];
                break;
            }
        }
        for(int i=0;i<127;i++)
        if(arr[i]!=count)
           if(arr[i]!=0)
            System.out.println("false");
    }

    System.out.println("true");
    }
    
}
