import java.util.*;
public class intarray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
}
        for(int j=0;j<arr.length;j++){
            sum=sum+arr[j];
}
        System.out.println(sum/arr.length);
    }
}