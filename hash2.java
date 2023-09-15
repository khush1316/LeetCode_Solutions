//Remove Duplicate Elements from the arrayList


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class hash2 {
    public int[] removeDuplicates(int[] nums) {

        int x=nums.length;
        HashSet<Integer> t=new HashSet<Integer>();
        for (int i:nums){
            t.add(i);
        }
        int l=t.size();
        int arr[] = new int[t.size()];

        int i=0;

        // iterating over the hashset
        for(int ele:t){
            arr[i++] = ele;
        }

        for (int n : arr)
            System.out.println(n);


        return arr;
    }

    public static void main(String[] args) {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array:");
        n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter elements of the Array:");
        for (i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }


        int[] t=new hash2().removeDuplicates(a);
        System.out.println(t);
    }
}
