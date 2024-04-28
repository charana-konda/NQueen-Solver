package app;
import Board.board;
import game.Game;
//import player.Playr;
public class App {
    public static void main(String args[]){
        board b = new board(3);
        Game g = new Game(b);
        g.play();
        //b.printbrd();
        
    }
}
