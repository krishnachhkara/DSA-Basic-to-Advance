class Solution {
    public void rotate(int[] arr, int k) {
        // //brute force
        // int n = arr.length;
        // k = k%n;
        // for(int j = 0 ; j<k;j++){
        //     int temp = arr[n-1];
        //     for(int i = n-2; i>=0; i-- ){
        //         arr[i+1] = arr[i];
        //     }
        //     arr[0] = temp;
        // }
        // for(int i =0;i<n;i++){
        //     System.out.print(arr[i]);
        // }

        //better version
        // int n = arr.length;
        // int[] ans = new int[n];
        // for(int i =0 ; i<n;i++){
        //     int newIndex = (i+k)%n;
        //     ans[newIndex] = arr[i];
        // }

        // for(int i = 0;i<n;i++){
        //     arr[i] = ans[i];
        // }
        // for(int i =0;i<n;i++){
        //     System.out.print(arr[i]);
        // }

        //optimal approach
        int n = arr.length;
        k = k%n;

        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        for(int i =0;i<n;i++){
            System.out.print(arr[i]);
        }

        
    }
    static int[] reverse(int [] arr,int start,int end){
            while(start<end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            return arr;
        }
}