public class MostWater{
    //To count maximum water 
    public int maxArea(int[] height) {
         //set lp and rp 
        int maxArea = 0;
        int lp = 0;
        int rp = height.length-1;
        //start a while loop to get width and ht and to get maxArea
        while (lp < rp) {
            int width = rp - lp;
            int ht = Math.min(height[lp], height[rp]);
            int currArea = ht * width;
            maxArea = Math.max(maxArea, currArea);
            //update situation
            if (height[lp] < height[rp]) {
                lp++;
            }else{
                rp--;
            }
        }
        return maxArea;
    }
}