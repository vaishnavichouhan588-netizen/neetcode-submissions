class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int[] hash= new int[n+1];
        for(int num: nums){
            if(num>0 && num<=n){
            hash[num]++;
        }}
        for(int i =1;i<=n;i++){
            if(hash[i]==0){
                return i;
            }
        }
        return n+1;
    }
}