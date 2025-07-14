// in else if - if first condition is satisfied then it does not check other condition but in "if else" it checks every condition if first one is satisfied so "else if"  saves time!!!!!


import java.util.*;

public class  elseif{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
int age = sc.nextInt();
if(age>18){
    System.out.println("You can  vote");
}
else if(age>=13 && age<18){
    System.out.println("Babu wait for sometime");
}
else{
    System.out.println("you cannot vote");
}
}
}