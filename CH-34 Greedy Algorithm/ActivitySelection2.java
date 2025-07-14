//ACTIVITY SELECTION IF SORTED END TIME IS NOT GIVEN

import java.util.*;
public class ActivitySelection2 {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        //here end time given is already sorted
        int end[]={2,4,6,7,9,9};

        //if end time given is not sorted then Sorting
        int activities[][]=new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0]=i;
            activities[i][1]=start[i];//in all of these three statement index are  stored because they would be used to maintain activity  after sorting 
            activities[i][2]=end[i];
            
        }
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));//it is lambda function

        int maxact=0;
        ArrayList<Integer>ans=new ArrayList<>();
        //1st Activity
        maxact=1;
        ans.add(activities[0][0]);
        int Lastend=activities[0][2];
        for (int i = 1; i < end.length; i++) {
            if (activities[i][1]>=Lastend) {
                //select new activity
                maxact++;
                ans.add(activities[i][0]);
                Lastend=activities[i][2];
            }
            
        }
        System.out.println("Max  Activities = " + maxact);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A"+ ans.get(i) + " "); 
        }
        System.out.println(" ");
    }

    
}
