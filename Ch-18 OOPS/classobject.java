public class classobject{
    public static void main(String[] args) {
        // // created a Pen object called P1;;;
        Pen p1= new Pen();
        p1.setcolor("red");
        System.out.println(p1.color);  
        p1.settip(5);
        System.out.println(p1.tipsize);
        //other way;
        p1.color= "black";
        System.out.println(p1.color);
        BankAccount myacc= new BankAccount();
        myacc.username="Nakesh";
        // myacc.password="abcdcd"; not passible as password is private
        myacc.setpassword("akku");
     }
}
    class Pen{
        String color;
        int tipsize;
        //these function are Setters
        void setcolor(String newcolor){
            color= newcolor;
        }
        void settip(int newtip){
            tipsize=newtip;
        }
        //These are Getters;
        String getcolor(){
            return this.color;
        }

    }
    class student{
        String name;
        int age;
        float percentage;
        void calculatepercent(int phy, int chem, int math){
            percentage= (phy+math+chem)/3;
        }

    }
    //ACCESS MODIFIERS;;
    class BankAccount{
        public String username;
        private String password;
        public void setpassword(String pwd){
        password=pwd;
        }

 
 }
