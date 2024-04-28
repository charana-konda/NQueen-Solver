package Board;
/**
 * board
 */
public class board {

   public int size;
    public char[][] brd;
    public board(int s){
        this.size=s;
        this.brd=new char[s][s];
        for(int i =0;i<s;i++){
            for(int j =0;j<s;j++){
                brd[i][j]='O';
            }
        }
    }
  public void printbrd(){
    for(int i =0;i<size;i++){
        for(int j =0;j<size;j++){
            System.out.print(brd[i][j]+" ");
        }
        System.out.println();
    }
  }
}