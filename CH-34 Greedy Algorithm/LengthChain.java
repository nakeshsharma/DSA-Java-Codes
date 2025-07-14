import java.util.*;
public class LengthChain {
    public static void main(String[] args) {
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));
        int chainlen=1;
        int chainEnd=pairs[0][1]; //LAST SELECTED PAIR END OR cHAIN END
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0]>chainEnd) {
                chainlen++; 
                chainEnd=pairs[i][1];
                
            }
            
        }
        System.out.println("Max length of chain " + chainlen );
    }
    
}
