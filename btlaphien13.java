package btlapphien13;
import java.util.Scanner;
public class btlapphien13 {
    public static void main(String[] args) {
      Scanner bt=new Scanner (System.in);
       try{ 
        System.out.println("Nhap n  = " );
        int n=bt.nextInt();
        double s=0;
        for(int i=1;i<=n;i++)
        {
             s+=i;
        }
           System.out.println("Tong la " +s);
                   
           
           
       }
       catch(Exception e)
    {
        System.out.println("Loi nhap!!");
    }
    }

}