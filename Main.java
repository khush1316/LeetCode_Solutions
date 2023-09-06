//Duck Number

import java.util.*;
public class Main {
    public static void main(String[] args) {
        int a,i,n,l=0,f=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number:");
        a=sc.nextInt();

        n=a;

        while(a!=0)
        {
            int r=a%10;
            l++;
            a/=10;
        }
        a=n;
        for (i=1;i<l-1;i++)
        {
            int t=a%10;
            if(t==0)
                f++;
            a/=10;
        }
        if(f>0 && a!=0)
            System.out.println("Duck number");
        else
            System.out.println("Not a duck number");
    }
}
