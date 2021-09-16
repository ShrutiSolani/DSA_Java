class Solution
{
    static void changeOldColor(int[][] image, int sr, int sc, int newColor, int oldColor){
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length){
            return;
        }
        
        if(image[sr][sc] == newColor){
            return;
        }
        
        if(image[sr][sc] == oldColor){
            image[sr][sc] = newColor;
        }
        else{
            return;
        }
        
        changeOldColor(image, sr-1,sc, newColor, oldColor);
        changeOldColor(image, sr, sc-1, newColor, oldColor);
        changeOldColor(image, sr+1, sc, newColor, oldColor);
        changeOldColor(image, sr, sc+1, newColor, oldColor);
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        // Code here 
        int oldColor = image[sr][sc];
        changeOldColor(image,sr,sc,newColor,oldColor);
        return image;
    }
}
