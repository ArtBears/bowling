import java.util.*;

public class Bowling{
  public static void main(String[] args){
      List<Integer> scores = getScores(args);
      printCardHead();
      int       score = 0,
                index = 0;

      // frames
      for(int frame=1; frame <= 10; frame++){

          // Handle a strike
          if(scores.get(index) == 10){
              score = score
                      + scores.get(index)
                      + scores.get(index + 1)
                      + scores.get(index + 2);

              // Handle wat happens when the you're on the last frame
              if(frame == 10){
                  printRow(frame,
                            scores.get(index),
                            scores.get(index+1),
                            scores.get(index+2),
                            score);

              }else{
                  printRow(frame,
                            scores.get(index),
                            0,
                            0,
                            score);
              }
              index++;
              continue;
          }
          // Handle Spare
          else if((scores.get(index) + scores.get(index+1)) == 10 ){
              score = score
                      + 10
                      + scores.get(index + 2);
              if(frame == 10){
                  printRow(frame,
                          scores.get(index),
                          scores.get(index+1),
                          scores.get(index+2),
                          score);
              }else{
                  printRow(frame,
                          scores.get(index),
                          scores.get(index + 1),
                          0,
                          score);
              }
              index += 2;
              continue;
          }
          // Handle bad players
          else{
              score = score
                      + scores.get(index)
                      + scores.get(index + 1);
              printRow(frame,
                        scores.get(index),
                        scores.get(index+1),
                        0,
                        score);
              index += 2;
              continue;
          }
      }
  }



  private static void printCardHead(){
      System.out.println("FR\tR1\tR2\tR3\tScore");
  }

  private static void printRow(int frame, int roll1, int roll2, int roll3, int
            score){

      String first_roll = (roll1 > 0) ? "" + roll1 : "";
      String second_roll = (roll2 > 0) ? "" + roll2 : "";
      String third_roll = (roll3 > 0) ? "" + roll3 : "";

      System.out.print(   frame         + "\t"
                        + first_roll    + "\t"
                        + second_roll   + "\t"
                        + third_roll    + "\t"
                        + score         + "\n" );
  }

  private static List<Integer> getScores(String[] scores){
      int current_item;
      List<Integer> scoreList = new ArrayList<Integer>();

      for(String item : scores){
          try {
              current_item = Integer.parseInt(item);
          } catch (Exception e){
              System.out.println("Please only input numbers");
              continue;
          }
          scoreList.add(current_item);
      }
      while(scoreList.size() < 21){
          scoreList.add(0);
      }

      return scoreList;
  }
}
