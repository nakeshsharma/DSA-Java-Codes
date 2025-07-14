import java.util.*;
public class FloodFill {
    public int[][]floodfill(int[][]image,int sr,int sc,int color){
        boolean vis[][]=new boolean[image.length][image[0].length];
        helper(image, sr,sc, color,vis,image[sr][sc]);
        return image;
    }  
    public void helper(int[][]image,int sr,int sc,int color,boolean vis[][],int originalcol){
        if (sr<0 || sc<0 ||sr>=image.length || sc>=image[0].length||vis[sr][sc] || image[sr][sc]!=originalcol)
         {
            return;    
        }
        //left
        helper(image, sr,sc-1, color,vis,originalcol);

        //right
        helper(image, sr,sc+1, color,vis,originalcol);

        //up
        helper(image, sr-1,sc, color,vis,originalcol);

        //down
        helper(image, sr+1,sc, color,vis,originalcol);
    }
    
    public static void main(String[] args) {
        
    }
}
