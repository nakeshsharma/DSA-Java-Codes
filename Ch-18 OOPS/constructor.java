public class constructor {
    public static void main(String[] args) {
        student s1=new student();
        s1.name= "akku";
        s1.rollno=20;
        s1.password="abcdef";
        s1.marks[0]=100;
        s1.marks[1]=100;
        s1.marks[2]=100;
        student s2=new student(s1);//copy
        s2.password="xyz";
        s1.marks[2]=90;
        for (int i = 0; i <= 2; i++) {
            System.out.println(s2.marks[i]);
            
        }   
}
}
class student{
    String name;
    int rollno;
    String password;
    int marks[];
    //COPY CONSTRUCTOR
    student(student s1){
        marks=new int[3];
        this.name=s1.name;
        this.rollno=rollno;
        this.marks=s1.marks;
    }
    student(){
marks=new int[3];
    }
    student(String name){
        marks=new int[3];  //this is parameterised constructor
       this.name=name;
    }
    student(int rollno){
        marks=new int[3];
        this.rollno=rollno;             
    }

}

