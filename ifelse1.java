import java.util.Scanner;

public class ifelse1 {
    public boolean checkXMatrix(int[][] grid) {

       int x= grid.length;
       for (int i=0;i<x;i++){
           for(int j=0;j<x;j++){
               if(i==j || i+j==x-1){
                   if(grid[i][j]==0)
                       return false;
               }
               else if(grid[i][j]!=0)
                   return false;
           }
       }

            return true;
    }

    public static void main(String[] args) {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array:");
        n=sc.nextInt();
        int[][] a=new int[n][n];
        System.out.println("Enter Elements of the array:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        boolean t=new ifelse1().checkXMatrix(a);
        System.out.println(t);
    }
}
