import java.util.*;
public class plimedromestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=0;
        System.out.println("enter string:");
        String s=sc.nextLine();
        int start=0;
        int end=s.length()-1;
         while(start!=end){
            if(s.charAt(start)==s.charAt(end)){
                  x=1;
            }
            start++;
            end--;
         }
         if(x==1){
              System.out.println("palimedrome");
         }
         else{
            System.out.println(" not palimedrome:");
         }
    }
}
