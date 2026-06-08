public class binary {
    public static void printbs(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printbs(n-1,0,str+"0");
        if(lastplace==0){
        printbs(n-1,1,str+"1");
    }
    }
    public static void main(String[] args) {
        printbs(3, 0, "");
        
    }
    
}
