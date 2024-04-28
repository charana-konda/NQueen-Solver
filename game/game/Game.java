package game;
import Board.board;
public class Game {
   board b;
   public Game(board b){
    this.b=b;

   }
   public void play(){
    if(b.size<4){
        System.out.println("Cant solve");
        return;
    }
     solve(b.brd,0);

   }
   public void solve(char[][] brd, int row){
      if(row==b.size){
        System.out.println("NQueens Solved");
        b.printbrd();
        return;
      }
      for(int i =0;i<b.size;i++){
        if(safe(brd,row,i)){
            brd[row][i]='*';
             solve(brd,row+1);
             brd[row][i]='O';


        }
      }

   }
   public boolean safe(char[][] brd,int row,int i){
    for(int k =row-1,j=i-1;k>=0&& j>=0;j--,k--){
        if(brd[k][j]=='*'){
            return false;
        }
    }
        for(int k =row-1,j=i+1;k>=0&& j<b.size;j++,k--){
            if(brd[k][j]=='*'){
                return false;
            }
        }
       for(int k =row-1;k>=0;k--){
        if(brd[k][i]=='*'){
            return false;
        }
       }
    

    return true;
   }

     
}
