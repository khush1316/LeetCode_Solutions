//Check Straight Line

import java.util.Scanner;

public class ifelse4 {
    public boolean checkStraightLine(int[][] coordinates) {

        int x=coordinates.length,i;
        for (i=0;i<x;i++) {

                if(coordinates[i][0]!=coordinates[i+1][0])
                    return false;
               // else if(coordinates[i][1]!=coordinates[i+1][1])
                 //
                else if (coordinates[i][1]!=coordinates[i+1][0])
                    return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        n=sc.nextInt();
        int[][] a=new int[n][2];
        System.out.println("Enter elements:");
        for (i=0;i<n;i++)
        {
            for (j=0;j<2;j++)
                a[i][j]=sc.nextInt();
        }
        boolean t=new ifelse4().checkStraightLine(a);
        System.out.println(t);
    }
}
