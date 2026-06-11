class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        float s=0;
        int count=0;
        for(int i=0;i<k;i++){
            s=s+arr[i];
        }
        int n=arr.length;
        if(s/k>=threshold) count++;
        for(int i=0;i<n-k;i++){
            s=s-arr[i];
            s=s+arr[i+k];
            if(s/k>=threshold) count++;
        }
        return count;

    }
}