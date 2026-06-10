class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>hm1= new HashMap<>();
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            hm1.put(nums1[i],hm1.getOrDefault(nums1[i],0)+1);
        }
        for(int ele:nums2){
            if(hm1.containsKey(ele)&&hm1.get(ele)>=1){
                ans.add(ele);
                hm1.put(ele,hm1.get(ele)-1);
            }
        }
        int arr[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i]=ans.get(i);
        }
        return arr;
        
    }
}