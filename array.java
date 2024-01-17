 import java.util.*;
 public class array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
     int k=1;
       for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
       }
       for(int j=a.length-1;j>=0;j--){
        
        System.out.println(a[4-k]);
       k++;
    } 
    }
}
