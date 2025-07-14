import java.util.*;
public class strings{
    public static void printletters(String Str){
        for (int i = 0; i < Str.length(); i++) {
            System.out.print(Str.charAt(i) + " ");
            
        }
        System.out.println();

    } 
    public static void main(String[] args) {
        char arr[]={'a', 'b','c','d'};
        String str1 = "abcd";
        String str2= new String("xyx");
        //STRINGS ARE IMMUTABLE IN JAVA i.e we cannot make changes to our old strings
         //input
        //  Scanner sc = new Scanner(System.in);
        //  String name;
        //  name= sc.nextLine();
        //  System.out.println(name);

         //length
        //  String fullname= "akku Sharma";
        //  System.out.println(fullname.length());

         //Concatenation
        //  String firstname= "akku";
        //  String lastname= "sharma";
        //  String pooraname= firstname + " " + lastname;
        //  System.out.println(fullname);

         //CharAt mathod
        //  System.out.println(fullname.charAt(5));
        //  printletters(fullname);


         //comapre;
         String a1="akku"; 
         String a2= "akku";
         String a3= new String("akku");
        //  if (a1==a2) {
        //     System.out.println("strings are equal");
            
        //  }
        //  else{
        //     System.out.println("not equal");
        //  }
        //  if (a1==a3) {
        //     System.out.println("equal");
            
        //  }
        //  else{
        //     System.out.println("not equal");  // here it show not equal because of new keyword
        //  }
         if (a1.equals(a3)) {
                System.out.println("equal");
            
         }
         else{
            System.out.println("not equal");
         }
         if (a1.equals(a2)) {
                System.out.println("equal");
            
         }
         else{
            System.out.println("not equal");
         }

         
    }
}