class Solution {
    public int trap(int[] height) {
        int[] premax = new int[height.length];
        int[] sufmax = new int[height.length];

        int maxpre = 0;
        int maxsuf = 0;
        for(int i = 0; i<height.length;i++){
            if(height[i] < maxpre){
                premax[i] = maxpre;
            }else{
                premax[i] = 0;
            }
            // System.out.println(premax[i]+" "+maxpre);
            maxpre  = Math.max(maxpre, height[i]);
        }
        for(int i = height.length-1; i>=0;i--){
            if(height[i] < maxsuf){
                sufmax[i] = maxsuf;
            }else{
                sufmax[i] = 0;
            }
            maxsuf  = Math.max(maxsuf, height[i]);
        }
        // System.out.println(Arrays.toString(premax));
        // System.out.println(Arrays.toString(sufmax));
        int area = 0;
        for(int i = 0; i<height.length;i++){
            if(Math.min(premax[i],sufmax[i]) == 0) continue;
            area += Math.min(premax[i],sufmax[i]) - height[i];
        }
        return area;
    }
}
