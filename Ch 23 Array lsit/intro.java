import java.util.ArrayList;
public class intro{
public static void main(String[] args) {
    ArrayList<Integer>list= new ArrayList<>();
    ArrayList<String>list2= new ArrayList<>();
    ArrayList<Boolean>list3= new ArrayList<>();
    //operations
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    System.out.println(list);

    //get 
   int element= list.get(2);
   System.out.println(element);

   //delete
   list.remove(3);
   System.out.println(list);

//set element
list.set(2, 10);
System.out.println(list);

//contains element

System.out.println(list.contains(10));

///
list.add(1, 9); 
System.out.println(list);

//size
System.out.println(list.size());
//print arraylist
for (int i = 0; i < list.size(); i++) {
    System.out.print(list.get(i) + " ");
    
}
System.out.println(" ");
//reverse
for(int i= list.size()-1; i>=0;i--){
    System.out.print(list.get(i) + " ");
}
System.out.println();
    
}

    

}