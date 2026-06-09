class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int f=0;f<n-1;f++){
            int left=f+1,right=n-1;int s;
            while(left<right){
                s=nums[f]+nums[left]+nums[right];
                if(s==0){
                    List<Integer>arr=new ArrayList<>();
                    arr.add(nums[f]);arr.add(nums[left]);arr.add(nums[right]);ans.add(arr);
                    while(left+1<n&&nums[left]==nums[left+1]) left++;
                    while(right-1>=0&&nums[right]==nums[right-1]) right--;
                    left++;right--;
                }else if(s>0){right--;}
                else{left++;}
            }
            while(f+1<n&&nums[f]==nums[f+1]) f++;

        }
        return ans;
        
    }
}