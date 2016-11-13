public class Bowling{
  public static void main(String[] args){
      System.out.println("Hello World");
      printCardHead();
      printRow(1,2,3,4,5);
  }
  static void printCardHead(){
      System.out.println("FR\tR1\tR2\tR3\tScore");
  }
//  static void printRowStrike(int frame, int roll1, int score){
//      System.out.printf("%d\t" + "%d\t" + "\t" + "\t" + "%d", frame,
//              roll1, score);
//  }
//  static void printRowSpare(int frame, int roll1, int roll2, int score){
//      System.out.printf("%d\t" + "%d\t" + "%d\t" + "%d\t" + "%d", frame,
//              roll1, roll2, score);
//  }
  static void printRow(int frame, int roll1, int roll2, int roll3, int score){
      System.out.printf("%d\t" + "%d\t" + "%d\t" + "%d\t" + "%d", frame,
              roll1, roll2, roll3, score);
  }
}
