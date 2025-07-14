import java.util.*;
public class JobSequence {
    static class Job{
        int deadline;
        int profit;
        int id;//0(A),1(B) etc..
        public Job(int i,int d,int p){
            id=i;
            deadline=d;
            profit=p;
        }

    }
    public static void main(String[] args) {
        int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job>jobs=new ArrayList<>();
        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }
        //THIS IS THE WAY TO SORT THE OBJECTS OF A CLASS HERE A AND B ARE TWO DIFFERENT OBJECT
        // Collections.sort(jobs, (a,b) -> a.profit-b.profit);//Ascending order of profit
        Collections.sort(jobs, (a,b) -> b.profit-a.profit);  //this is Descending order of profit Needed for this question 
        ArrayList<Integer>Seq=new ArrayList<>();  
        int time=0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr=jobs.get(i);
            if (curr.deadline>time) {
                Seq.add(curr.id);
                time++;
                
            }

            
        }
        //print Seq
        System.out.println("Max jobs = " + Seq.size());
        for (int i = 0; i < Seq.size(); i++) {
            System.out.print(Seq.get(i) + " ");
            
        }
        System.out.println(" ");
    }
    
}
