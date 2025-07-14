public class inheritance {
    public static void main(String[] args) {
    fish shark=new fish();
    shark.eat();    
    }
    
}
//base class
class animal{
    String color;
    void eat(){
        System.out.println("can eat");
    }
    void breathe(){
        System.out.println("can breathe");
    }
    
}
//Derived class
 class  fish extends animal{
    int fins;
    void swim(){
        System.out.println("swim");
    }
 }   

