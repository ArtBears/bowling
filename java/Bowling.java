import java.util.*;

public class Bowling{
  public static void main(String[] args){
      List<Integer> scores = getScores(args);
      for(int in : scores){
          System.out.println(in);
      }
      printCardHead();
      printRow(1,2,3,4,5);
  }
  static void printCardHead(){
      System.out.println("FR\tR1\tR2\tR3\tScore");
  }

  static void printRow(int frame, int roll1, int roll2, int roll3, int score){
      System.out.printf("%d\t" + "%d\t" + "%d\t" + "%d\t" + "%d", frame,
              roll1, roll2, roll3, score);
  }

  static List<Integer> getScores(String[] scores){
      List<Integer> scoreList = new ArrayList<Integer>();
      int current_item = 0;
      for(String item : scores){
          try {
              current_item = Integer.parseInt(item);
          } catch (Exception e){
              System.out.println(e);
              System.out.println("Please only input numbers");
              continue;
          }
          scoreList.add(current_item);
      }
      return scoreList;
  }
}
