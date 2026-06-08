import java.util.*;
public class Disjoint {
    static int n=7;
    static int par[]=new int[n];
    static int rank[]=new int[n];
    public static void init(){
        for (int i = 0; i < n; i++) {
            par[i]=i;
            rank[i]=0;
        }
    }
    public static int Find(int x){
        if (x==par[x]) {
            return x;

        }
        return par[x]= Find(par[x]);
    }
    public static void union(int a,int b){
        int parA=Find(a);
        int parB=Find(b);
        if (rank[parA]==rank[parB]) {
            par[parB]=parA;
            rank[parA]++;
        }
        else if(rank[parA]<rank[parB]){
            par[parA]=parB;
        }
        else{
            par[parB]=parA;
        }
    }
    public static void main(String[] args) {
        init();
        System.out.println(Find(3));
        union(1, 3);
        System.out.println(Find(3));
        union(2, 1);
        union(3, 6);
        union(1, 4);
        System.out.println(Find(3));
        System.out.println(Find(4));
        union(1, 5);
    }
}
