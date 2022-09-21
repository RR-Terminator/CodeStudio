public class Square_Root {

    public static void main(String[] args) {
        System.out.println(sqrtN(7777777772l));

    }
    public static int sqrtN(long N) {
        /*
         * Write your code here
         */
        return BinarySearch(N);
    }


    public static int BinarySearch(long n){
        long s =0 ;
        long e = n;
        long ans = -1;

        while (s<=e){
            long mid = s + (e-s)/2;
            long square = mid*mid;
            if(square<n){
                ans=mid;
                s = mid+1;
            } else if (square==n) {
                return (int) mid;
            }

            else {
                e = mid-1;
            }
        }
        return (int) ans;

    }

}
