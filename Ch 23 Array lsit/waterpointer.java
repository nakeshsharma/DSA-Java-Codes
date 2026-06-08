import java.util.ArrayList;
//using 2 pointer approach

public class waterpointer { 
    public static int Maxwater(ArrayList<Integer> water){
        int maxwater=0;
        int lp=0;
        int rp=water.size()-1;
        while (lp<rp) {
            //calculate water area
            int ht=Math.min(water.get(lp), water.get(rp));
            int width=rp-lp;
            int currwater=ht*width; 
            maxwater=Math.max(maxwater,currwater);

            //update pointer
             if(water.get(lp)< water.get(rp))
             lp++;
             else{
                rp--;
             }
            
        }
        return maxwater;

    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
      System.out.println(  Maxwater(height));
    }
}
