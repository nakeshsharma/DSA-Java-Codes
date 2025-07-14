public class rainwater {
public static int trappedwater(int height[])
{
    int n =height.length;
    //CALCULATE LEFT MAX BOUNDARY- ARRAY
    int leftmax[] = new int[height.length];
    leftmax[0] = height[0];
    for (int i = 1; i < leftmax.length; i++) {
        leftmax[i]=Math.max(height[i], leftmax[i-1]);
    }
    //CALCULATE RIGHT MAX BOUNDARY- ARRAY
    int rightmax[] = new int[n];
    rightmax[n-1] = height[n-1];
   for (int i = n-2; i >=0; i--) {
    rightmax[i]= Math.max(height[i],rightmax[i+1]); 
   }
    
    //LOOP
    int trappedwater=0;
    for (int i = 0; i < n; i++) {
            //waterlevel= min(LEFT MAX BOUNDARY, RIGHT MAX BOUNDARY)
        int waterlevel= Math.min(leftmax[i],rightmax[i]);
         //Trapped water= (water level - height[i]) * width
        trappedwater+=waterlevel - height[i];
  
    }
    return trappedwater;
}
    public static void main(String[] args) {
    int height[] = {4,2,0,6,3,2,5};
    System.out.println(trappedwater(height));
}    
}
