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
          slow += "" + board[r][c] + " ";
          //slow += "_ ";
        }
      }
      slow += "\n";
    }
    return slow;
  }

  public boolean solve(){
    for (int x = 0; x < board.length; x++) {

    }

    addQueen(1,3);
    //addHorizontally(1,3);
    //addVertically(1,3);
    addDiagonally(1,3);
    return false;
  }

  public int countSolutions(){
    return 0;
  }
  //these won't overlap the placed queen, need to change to check for other queens
  private void addHorizontally(int r, int c) {
    for (int x = 0; x < board.length; x++) {
      if (!(x == c)) {
        board[r][x] += 1;
      }
    }
  }

  private void addVertically(int r, int c) {
    for (int y = 0; y < board.length; y++) {
      if (!(y == r)) {
        board[y][c] += 1;
      }
    }
  }
  //numbers are the same in relation to r,c i.e. r-1, c+1 , use i to change
  private void addDiagonally(int r, int c ) {
    for (int i = 1; i < board.length-r && i <board.length-c; i++) {
      board[r+i][c+i] += 1;
      if (r-i > -1 && c-i > -1) {
        board[r-i][c-i] += 1;
      }
      if (r-i > -1) {
        board[r-i][c+i] += 1;
      }
      if (c-i > -1) {
        board[r+i][c-i] += 1;
      }

    }

  }


}
