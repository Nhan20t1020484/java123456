package btlapphien19;
import java.util.Scanner;
public class btlapphien19 {

    public static void main(String[] args) {
    Scanner bt=new Scanner (System.in);
       try{ 	
        System.out.println("Nhap so nguyen n = " );
        int n=bt.nextInt();
        int s=0;
        while (n!=0)
        {
            s=n%10;
            System.out.print(s);
            n/=10;
        }
           System.out.println();
           
       } catch(Exception e)
    {
        System.out.println("Loi nhap!!");
    }
    }
}