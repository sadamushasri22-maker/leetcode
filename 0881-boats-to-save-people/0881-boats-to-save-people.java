class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int c=0,left=0,right=people.length-1, s;
        while(left<right){
            s=people[left]+people[right];
            if(s<=limit){
                left++;
                right--;
            }else if(s>limit){
                 right--;
            }
            c++;
        }
        if(left==right) c++;
        return c;
        
    }
}