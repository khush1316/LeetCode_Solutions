//Printing a pattern using single loop


public class UsingoneLoop {
    public static void main(String[] args) {
        int i,n=4,c=0;
        for(i=0; i<n;){
            if(c<i){
                System.out.print("*");
                c++;
                continue;
            }
            if(c==i){
                System.out.println(" ");
                i++;
                c=0;
            }
        }
    }
}
