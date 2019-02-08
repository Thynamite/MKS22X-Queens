public class QueenBoard{

  private int[][] board;

  public QueenBoard(int size){

    board = new int[size][size];

    for (int r = 0; r < board.length;r++){
      for (int c = 0; c < board[r].length;c++){
        board[r][c] = 0;
      }
    }

  }

  private boolean addQueen(int r, int c) {
    if (board[r][c] > 0) {
      return false;
    }
    board[r][c] = -1;
    return true;
  }

  private boolean removeQueen(int r, int c) {
    if (board[r][c] != -1){
      return false;
    }
    board[r][c] = 0; //this may have to change
    return true;
  }

  public String toString(){
    String slow = "";
    for (int r = 0; r < board.length;r++) {
      for (int c = 0; c < board[r].length;c++){
        if (board[r][c] == -1) {
          slow += "Q ";
        }
        else {
          slow += "_ ";
        }
      }
      slow += "\n";
    }
    return slow;
  }

  public boolean solve(){

  }

  public int countSolutions(){

  }

  private void addHorizontally(int[][] border) {

  }
}
