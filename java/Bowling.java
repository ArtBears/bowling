import java.util.*;

public class Bowling{
  public static void main(String[] args){
      List<Integer> scores = getScores(args);
      printCardHead();
      int       score = 0,
                index = 0,
                frame_sum = 0;

      // frames
      for(int i=1; i <= 10; i++){

          if(scores.get(index) == 10){
              score = score
                      + scores.get(index)
                      + scores.get(index + 1)
                      + scores.get(index + 2);

              // Handle wat happens when the you're on the last frame
              if(i == 10){
                  printRow(i,
                            scores.get(index),
                            scores.get(index+1),
                            scores.get(index+2),
                            score);

              }else{
                  printRow(i,
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
              if(i == 10){
                  printRow(i,
                          scores.get(index),
                          scores.get(index+1),
                          scores.get(index+2),
                          score);
              }else{
                  printRow(i,
                          scores.get(index),
                          scores.get(index + 1),
                          0,
                          score);
              }
              index += 2;
              continue;
          }
          //handle bad players
          else{
              score = score
                      + scores.get(index )
                      + scores.get(index + 1);
              printRow(i,
                        scores.get(index),
                        scores.get(index+1),
                        0,
                        score);
              index += 2;
              continue;
          }
      }
  }



  static void printCardHead(){
      System.out.println("FR\tR1\tR2\tR3\tScore");
  }

  static void printRow(int frame, int roll1, int roll2, int roll3, int score){
      System.out.printf("%d\t" + "%d\t" + "%d\t" + "%d\t" + "%d%n", frame,
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
