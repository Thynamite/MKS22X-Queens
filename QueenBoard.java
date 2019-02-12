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
    addCardinal(r,c,1);
    addDiagonally(r,c,1);
    return true;
  }

  private boolean removeQueen(int r, int c) {
    if (board[r][c] != -1){
      return false;
    }
    board[r][c] = 0; //this may have to change
    addCardinal(r,c,-1);
    addDiagonally(r,c,-1);
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
    return solveR(0);
  }

  public boolean solveR(int col){
    if (col >= board.length) {
      return true;
    }
    for (int r = 0; r < board.length; r++) {
      if (addQueen(r,col)){
        if (solveR(col+1)){
          return true;
        }
        removeQueen(r,col);
      }
    }
    return false;
  }

  public int countSolutions(){
    return 0;
  }
  //these won't overlap the placed queen, need to change to check for other queens
  /*
  private void addHorizontally(int r, int c, int factor) {
    for (int x = 0; x < board.length; x++) {
      if (!(x == c)) {
        board[r][x] += factor;
      }
    }
  }

  private void addVertically(int r, int c, int factor) {
    for (int y = 0; y < board.length; y++) {
      if (!(y == r)) {
        board[y][c] += factor;
      }
    }
  }
  */
  private void addCardinal(int r, int c, int factor) {
    for (int i = 0; i < board.length; i++) {
      if (!(i == r)) {
        board[i][c] += factor;
      }
      if (!(i == c)) {
        board[r][i] += factor;
      }
    }
  }
  //numbers are the same in relation to r,c i.e. r-1, c+1 , use i to change
  private void addDiagonally(int r, int c, int factor) {
    for (int i = 1; i < board.length-1; i++) {
      if (r+i < board.length && c+i < board.length) {
        board[r+i][c+i] += factor;
      }
      if (r-i > -1 && c-i > -1) {
        board[r-i][c-i] += factor;
      }
      if (r-i > -1) {
        board[r-i][c+i] += factor;
      }
      if (c-i > -1) {
        board[r+i][c-i] += factor;
      }
    }
  }

  public void test(){
    addQueen(1,3);
    addQueen(2,5);
    removeQueen(2,5);
  }
}
