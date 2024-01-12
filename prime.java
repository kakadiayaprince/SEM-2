 import java.util.*;
 public class prime {
    public static void main(String[] args) {
        int num=0;
        int flag=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=2;i<=a/2;i++){
           if(num%i==0){
            flag=1;
            break;
           }         
        }
         if(flag==1){
            System.out.println(" not prime number");
           }
           else{
            System.out.println("prime number");
           }
    }   
}
