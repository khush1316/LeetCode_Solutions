import java.util.Scanner;

public class leet1752 {
    public boolean check(int[] nums) {
        int i, min = nums[0], t = 0;
        int x = nums.length;
        int[] b = new int[x];
        int j = 0;
        for (i = 0; i < x; i++) {
            if (nums[i] < min) {
                min = nums[i];
                t = i;
            }
            else if(nums[i]==min){
                min=nums[i];
                t=i;
            }
        }
        for (i=t;i<x;i++){
            b[j]=nums[i];
            j++;
        }
        for (i=0;i<t;i++)
        {
            b[j]=nums[i];
            j++;

        }
        for (i=0;i<j;i++){
            System.out.print(b[i]);
        }
        for (i=1;i<j;i++){
            if(b[i-1]==b[i])
            {
                if ()
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        n=sc.nextInt();
        int[] num=new int[n];
        System.out.println("ENter element of the array: ");
        for (int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        boolean t=new leet1752().check(num);
        System.out.println(t);
    }
}

