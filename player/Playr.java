package player;

public class Playr {
    int name;
    int mbl;
    public Playr(int n,int mbl){
        this.name=n;
        this.mbl =mbl;
    }
    public void getdetails(){
        System.out.println(name+" "+mbl);
    }
}
