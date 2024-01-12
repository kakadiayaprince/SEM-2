import java.util.*;
public class palimedrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max;
        int rev=0;
        System.out.println("enter number:");
        int a=sc.nextInt();
        max=a;
        while(a!=0){
          int id=a%10;
          a=a/10;
          rev=rev*10+id;
        }
        if(rev==max){
            System.out.println("it is a palimedrome number:");
        }
        else{
            System.out.println("in is not palimedrome number:");
        }
    }
}
