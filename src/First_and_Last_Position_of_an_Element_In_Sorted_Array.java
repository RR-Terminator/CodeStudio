import java.util.*;
public class First_and_Last_Position_of_an_Element_In_Sorted_Array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,4};


        System.out.println(Arrays.toString(firstAndLastPosition(arr,3)));

    }


    public static int[] firstAndLastPosition(int[] arr,int k) {

        int [] ans;
        ans = new int[]{FirstOccurence(arr, k), LastOccurence(arr, k)};
        return ans;
    }

    static int FirstOccurence(int [] arr, int target){
        int s = 0;
        int ans = -1;
        int e = arr.length-1;
        while(s<=e){
            int mid = s +(e-s)/2;
            if(arr[mid]>target){
                e =mid-1;
            }
            else if(arr[mid]<target){
                s = mid+1;
            }
            else{
                ans = mid;
                e = mid -1 ;

            }


        }
        return ans;
    }

    static int LastOccurence(int [] arr,int target){
        int s = 0;
        int e = arr.length-1;
        int ans = -1;
        while(s<=e){
            int mid = s +(e-s)/2;
            if(arr[mid]==target){
                s =mid+1;
                ans = mid;

            }
            else if(arr[mid]<target){
                s = mid+1;
            }
            else{
                e =mid -1;
                           }


        }
        return ans;
    }

}


