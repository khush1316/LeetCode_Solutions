import java.util.Scanner;

public class leet2507 {
    public int smallestValue(int n) {

        int t=n;

        while(true) {
            int s=0,i=2;
            while (n > 1) {
                if (n % i == 0) {
                    n = n / i;
                    s = s + i;

                }
                else
                    i++;
            }
            n=s;
            if(t==s)
                break;
            else
                t=s;
        }
        return t;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        n=sc.nextInt();
        int a=new leet2507().smallestValue(n);
        System.out.println(a);
    }
}
