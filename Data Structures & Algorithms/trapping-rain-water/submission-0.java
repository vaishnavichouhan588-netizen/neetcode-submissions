class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int water =0;
        int left =0;
        int right = n-1;
         int lmax=0;
            int rmax =0;
        while(left<right){
        if(height[left]<height[right]){
            if(height[left]>lmax){
                lmax = height[left];
            }else{
                water= water+lmax-height[left];
            } 
            left++;
            }
            else{
                if(height[right]>rmax){
                    rmax = height[right];
                }
                else{
                    water = water+rmax-height[right];
                }
                right--;
            }
    
        }
        return water;
    }
}