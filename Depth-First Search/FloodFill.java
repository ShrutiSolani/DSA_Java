class Solution {
    public static void fillColor(int[][] image, int sr, int sc, int newColor, int oldColor){
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length){
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
        
        
        fillColor(image, sr-1, sc, newColor, oldColor);
        fillColor(image, sr, sc-1, newColor, oldColor);
        fillColor(image, sr+1, sc, newColor, oldColor);
        fillColor(image, sr, sc+1, newColor, oldColor);
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldcolor = image[sr][sc];
        fillColor(image, sr, sc, newColor, oldcolor);
        
        return image;
    }
}
