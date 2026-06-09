class Solution {
    public boolean isHappy(int n) {
        int s=0;
        while(n>0){
            int r=n%10;s=s+r*r;n=n/10;

        }
        n=s;
        if(n<=9) n=n*n;
        while(n>9) {
            s=0;
            while(n>0){
                int r=n%10;s=s+r*r;n=n/10;
            }
            n=s;
        }
        if(n==1){
            return true;
        }else{
            return false;
        }
    }
}