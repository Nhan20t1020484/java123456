package btlapphien14;
import java.util.Scanner;
public class btlapphien14 {
   
    public static void main(String[] args) {
      Scanner bt=new Scanner (System.in);
       try{ 
        System.out.println("Nhap n =");
             int n=bt.nextInt();
             double s=0;
             while (n!=0)
             {
                 s+=n%10;
                 n/=10;
             }
      System.out.println("Tong cac chu so la " +s)  ;
} catch(Exception e)
    {
        System.out.println("Loi nhap!!");
    }
    
    }
}