import java.util.Scanner;
public class leet2 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int a,b,i,j;
        a=nums1.length;
        b=nums2.length;
        int c=a+b;
        int[] x=new int[c];
        for(i=0;i<c;i++)
        {
            if(i<a)
                x[i]=nums1[i];
            else
                x[i]=nums2[i-a];
        }
      for(i=0;i<c;i++)
       {
           for(j=i+1;j<c;j++)
           {
               if(x[i]>x[j]) {
                   int t = x[i];
                   x[i] = x[j];
                   x[j] = t;
               }
           }
       }
       for(i=0;i<c;i++)
           System.out.println(x[i]);
       double s=0.0d;
       int z=(c/2)-1;
        int y=(c/2);
        if(c%2==0)
            s=(double) (x[z]+x[y])/2;
        else
            s=x[y];
       return s;
    }

    public static void main(String[] args) {

        int i, j, n, m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of 1st array:");
        n = sc.nextInt();

        System.out.print("Enter size of second arry:");
        m = sc.nextInt();
        int[] num1 = new int[n];
        int[] num2 = new int[m];
        System.out.println("Enter 1st array numbers :");
        for (i = 0; i < n; i++)
            num1[i] = sc.nextInt();
        System.out.println("ENter 2nd array numbers :");
        for (i = 0; i < m; i++)
            num2[i]=sc.nextInt();

        double a=new leet2().findMedianSortedArrays(num1,num2);
        System.out.println(a);
    }
}
