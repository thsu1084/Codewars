public class SpinWords {

  public String spinWords(String sentence) {
    
       String[] splited = sentence.split(" ");
       
       for(int i=0;i<splited.length;i++){
      // System.out.println(splited[i]);
       
       //System.out.println(splited[i].length());
       
       if(splited[i].length()>=5){
       StringBuffer sb = new StringBuffer(splited[i]);
       String reversedStr = sb.reverse().toString();
       
      // System.out.println(reversedStr);
       splited[i]=reversedStr;
       }
       
       }
       
       String result=String.join(" ",splited);
        return result;
       
  }
}

