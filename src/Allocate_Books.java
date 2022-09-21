import java.util.*;
public class Allocate_Books {
    public static void main(String[] args) {

        int [] arr = {10,20,30,40};

        System.out.println(Allocation(arr,2));

    }

    static int Allocation(int [] arr, int n){
        int s = 0 ;
        int sum = 0;
        int ans = -1;
        for (int i = 0; i < arr.length-1; i++) {
            sum+=arr[i];
        }
        int e = sum;
        while (s<=e){
            int mid = s + (e-s)/2;
            if (isPossible(arr,n,mid)){
                ans = mid;
                e = mid-1;
            }
            else {
                s = mid+1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] arr, int n, int mid) {
        int StudentCount = 1;
        int PageSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (PageSum + arr[i] > mid) {

                StudentCount++;
                PageSum = arr[i];

            }
            else {
                PageSum += arr[i];
            }


        }
        return StudentCount <= n;

    }
}