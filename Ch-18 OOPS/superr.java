public class superr {
    public static void main(String[] args) {
        horse h=new horse();
        System.out.println(h.color);
    }
    
}
class Animal{
    String color;
    Animal(){
        System.out.println("hello Animal const");
    }
}
class horse extends Animal{
    horse(){
        super();
        super.color="brown";
        System.out.println("hello horse cont here");
    }
}
