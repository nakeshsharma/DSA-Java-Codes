public class abstractt {
public static void main(String[] args) {
    Horse h=new Horse();
    h.eat();
    h.walk();
    System.out.println(h.color);
    Chicken c =new Chicken();
    c.eat();;
    c.walk();
    // Animal a=new Animal(); not possible as it is abstract class
    mustang myhorse=new mustang();

}
}
abstract class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor called");
        color="black";

    }
void eat(){
    System.out.println("animal eat");
}
abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");

    }
    void changecolor(){
        color="brown";
    }
void walk(){
    System.out.println("walks foir legs");
}
}
class Chicken extends Animal{
     Chicken(){
        System.out.println("Chicken constructor called");
    }
     void changecolor(){
        color="peach";
    }
    void walk(){
        System.out.println("walks two legs");
    }
}
class mustang extends Horse{
    mustang(){
        System.out.println("mustang cons called");
    }
}
