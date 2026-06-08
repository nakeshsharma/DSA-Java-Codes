public class staticc {
    public static void main(String[] args) {
        student s1=new student();
        s1.schoolname="kmps";
        student s2=new student();
        System.out.println(s2.schoolname);
        student s3=new student();
        s3.schoolname="vps";
        System.out.println(s3.schoolname);
        System.out.println(s2.schoolname);
    }
}
class student{
   static int percentage(int math,int phy){
        return(math+phy)/2;
    }
    String name;
    int rollno;
    static String schoolname;
    void setname(String name){
        this.name=name;
    }
        String getname(){
            return this.name;
        }
}
