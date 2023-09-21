//Check if String is Pangram


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ifelse3 {
    public boolean checkIfPangram(String sentence) {
        int p;
        char j;
        char[] s=sentence.toCharArray();
        HashSet<Character> c=new HashSet<>();
        for (char i:s){
            c.add(i);

        }

        p=c.size();
        if(p==26)
        return true;
        else
            return false;
    }
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Sentence:");
        s=sc.nextLine();
        boolean a=new ifelse3().checkIfPangram(s);
        System.out.println(a);

    }
}
