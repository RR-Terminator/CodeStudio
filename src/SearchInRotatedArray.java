public class SearchInRotatedArray {
    public static void main(String[] args) {
        int [] arr ={2,5,-3,0};
        int [] aa ={1,2,3,4};
      //  System.out.println(BinarySearch(aa,0, aa.length-1, 4));
        System.out.println(search(arr,0));

    }
    public static int search(int arr[], int key) {
        int pivot = findPivot(arr);
        if(key>=arr[pivot]&& key <=arr[arr.length-1]){
            return BinarySearch(arr,pivot,arr.length-1,key);
        }
        return BinarySearch(arr,0,pivot-1,key);
    }

    public static int findPivot(int arr[]) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] >= arr[0]) {
                s = mid + 1;
            } else {
                e = mid;
            }

        }
        return s;
    }


     static int BinarySearch(int [] arr,int start , int end,int target){
            int s = start;
            int e = end;
            while(s<=e){
                int mid = s + (e-s)/2;
                if(arr[mid]==target){
                    return mid;
                }
                else if (arr[mid]<target){
                    s= mid+1;
                }
                else e= mid -1;
            }
            return -1;
        }
    }

