public class getset {
    public static void main(String[] args) {
            Pen p1= new Pen();
        p1.setcolor("red");
        System.out.println(p1.getcolor());  
        p1.settip(5);
        System.out.println(p1.getcolor());
        //other way;
        p1.setcolor("black");
        System.out.println(p1.getcolor());
    }
    
}
 class Pen{
        private String color;
        private int tipsize;
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
        int  gettip(){
            return this.tipsize;
        }

    }
