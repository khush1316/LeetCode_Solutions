import java.util.ArrayList;
import java.util.Scanner;

public class leet2042 {
    public boolean areNumbersAscending(String s) {


        int a=new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))==true) {
                a=Character.getNumericValue(s.charAt(i));
            }

        }
        int t=0;
        for (int i=0;i<a.length;i++) {
            if (a[i] != 0) {
                a[t] = a[i];
                t++;
            }
        }

        for (int i=0;i<t;i++) {
            if (a[i] < a[i + 1])
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        s = sc.nextLine();
        boolean t=new leet2042().areNumbersAscending(s);
        System.out.println(t);
    }
}
