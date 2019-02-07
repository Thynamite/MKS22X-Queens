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

  
}
