import java.util.*;
public class student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float d=sc.nextFloat();
        float e=sc.nextFloat();
        double f=(a+b+c+d+e)/5;
        if(f>=60){
            System.out.println("frist divition:");
        }
        else if(f>50){
            System.out.println("second divition:");
        }
        else if(f>40){
            System.out.println("third divition:");
        }
        else {
            System.out.println("study ma dhayan dyo! bhai fail thay gayo ne "+(f)+" percentage j aavaya");
        }



    }
    
}
