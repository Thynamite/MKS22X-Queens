public class Driver{

  public static void main(String[] args) {
    QueenBoard help = new QueenBoard(3);
    QueenBoard me = new QueenBoard(9);
    QueenBoard please = new QueenBoard(10);
    QueenBoard rus = new QueenBoard(14);
    help.solve();
    me.solve();
    please.solve();
    rus.solve();
    System.out.println(help);
    System.out.println(me);
    System.out.println(please);
    System.out.println(rus);
    QueenBoard helps = new QueenBoard(3);
    QueenBoard mes = new QueenBoard(9);
    QueenBoard pleases = new QueenBoard(10);
    QueenBoard russ = new QueenBoard(14);
    System.out.println(helps.countSolutions());
    System.out.println(mes.countSolutions());
    System.out.println(pleases.countSolutions());
    System.out.println(russ.countSolutions());
  }
}
