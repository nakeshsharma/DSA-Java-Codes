//ACTIVITY SELECTION IF SORTED END TIME IS GIVEN

import java.util.*;
public class ActivitySelection{
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        //hhere end time given is already sorted
        int end[]={2,4,6,7,9,9,};
        int maxact=0;
        ArrayList<Integer>ans=new ArrayList<>();
        //1st Activity
        maxact=1;
        ans.add(0);
        int Lastend=end[0];
        for (int i = 1; i < end.length; i++) {
            if (start[i]>=Lastend) {
                //select new activity
                maxact++;
                ans.add(i);
                Lastend=end[i];
            }
            
        }
        System.out.println("Max  Activities = " + maxact);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A"+ ans.get(i) + " "); 
        }
        System.out.println(" ");
    }
}