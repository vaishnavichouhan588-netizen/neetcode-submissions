class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int max =0;
        for(int i =0;i<n-1;i++){
            for(int j =i+1;j<n;j++){
                int area = (j-i)* Math.min(heights[i],heights[j]);
                max = Math.max(max,area);
            }
        }
        return max;
    }
}
