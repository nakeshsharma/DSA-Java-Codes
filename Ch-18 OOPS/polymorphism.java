public class polymorphism {
    //method overloading
   public static void sum(int a,int b){
      int c= a+b;
      System.out.println(c);  
    }
       public static void sum(int a,int b,int d){
      int c= a+b+d;
      System.out.println(c);  
    }
       public static void sum(float a,float b){
      float c= a+b;
      System.out.println(c); 
       }
      public static void main(String[] args) {
        
      
    deer d =new deer();
    d.eat();
      }
    }
    //Method overriding
class animal{
    void eat(){
        System.out.println("eat anything");
    }
}
class deer extends animal{
     void eat(){
        System.out.println("eat grass");
    }
}
