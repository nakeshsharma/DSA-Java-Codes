public class substring {
    public static String substring(String str, int start,int end) {
        String substr ="";
        for (int i = start; i < end; i++) {
            substr += str.charAt(i);  
        }
        return substr;
    }
    public static void main(String[] args) {
        //in substring end limit not included
        String str= "HelloWorld";
        System.out.println(substring(str,0,5));

        //without using function
        System.out.println(str.substring(0, 5));

    }
    
}
