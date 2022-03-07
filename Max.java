import java.util.ArrayList;


public class Max {
  public static int sequence(int[] arr) {
    
    
    
    ArrayList arrList1 = new ArrayList ();
    ArrayList<Integer> arrList2 = new ArrayList<Integer> ();
    int sum=0;
    int max=0;
 //   int[] arr =new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
    
    if(arr.length==0)return 0;
    
    for(int i=0;i<arr.length;i++){
    
     for(int j=0;j<i+1;j++){
        max=max+arr[j];
        }
       
       arrList1.add(max);
       max=0;
    }
    //System.out.println(arrList1);
  
 int a=0;
 int b=2;
 while(true){
 for(int m=0;m<arr.length-2;m++){
 for(int n=a;n<m+b;n++){
 if(m+b>arr.length)break;
 sum=sum+arr[n];
 }
 a++;
 arrList2.add(sum);
 
 sum=0;
 }
 
 if(b>arr.length-1)break;
 a=0;
 b++;
 }
 
 max=arrList2.get(0);
 
 for(int i=0;i<arrList2.size();i++){
 if(arrList2.get(i)>max)max=arrList2.get(i);
 }
 
    
    
    return max;
  }
}
