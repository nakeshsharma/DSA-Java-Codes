public class shallow {
    
    public static void main(String[] args) {
        student s1=new student();
        s1.name= "akku";
        s1.rollno=20;
        s1.password="abcdef";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        student s2=new student(s1);
        s2.password="xyz";
        s1.marks[2]=100;
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
    // Shallow COPY CONSTRUCTOR
    // student(student s1){
    //     marks=new int[3];
    //     this.name=s1.name;
    //     this.rollno=rollno;
    //     this.marks=s1.marks;
    // }
    //deep copy constructor
    student(student s1){
        marks=new int[3];
        this.name=s1.name;
        this.rollno=s1.rollno;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i]=s1.marks[i];
        }


    }
    student(){
        marks=new int[3];

    }
}
