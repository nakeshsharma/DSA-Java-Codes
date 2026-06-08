public class permutationn {
    public static void findpermu(String str,String ans){
    //base case    
    if (str.length()==0) {
        System.out.println(ans);
        return;
            
        }
        for (int i = 0; i < str.length(); i++) {
            char curr=str.charAt(i);
           String newstr= str.substring(0, i) + str.substring(i+1);
            findpermu(newstr, ans + curr);

        }

    }
    public static void main(String[] args) {
        String str="abc";
        findpermu(str, "");
        
    }
    
}
