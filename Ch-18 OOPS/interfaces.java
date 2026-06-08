public class interfaces {
    public static void main(String[] args) {
        queen q= new queen();
        q.moves();
    }
}
interface chessplayer{
void moves();
}
class queen implements chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal");
    }

}
class rook implements chessplayer{
    public void moves(){
        System.out.println("up,down");
    }

}
class king implements chessplayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }

}
