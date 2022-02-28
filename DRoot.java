public class DRoot {
  public static int digital_root(int n) {
    int sum=0;
   int num=n;
    while(n>9){
    
     while(num>0){
       sum=sum+num%10;
       num=num/10;
     }
     n=sum; 
     num=sum;
     sum=0;
    }
    
    return n;
  }
}
