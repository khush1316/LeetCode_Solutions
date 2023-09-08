//UGLY NUMBER

import java.util.Scanner;
public class leet5 {
    public boolean isUgly(int n) {
       int i,f=0;
       if(n<=0)
           return false;
       while(n%2==0) n/=2;
       while (n%3==0) n/=3;
       while (n%5==0) n/=5;
       return n==1;
       }
    public static void main(String[] args) {
        int n;
        boolean a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        n=sc.nextInt();
        a=new leet5().isUgly(n);
        System.out.println(a);
    }
}
