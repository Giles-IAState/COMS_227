package hw4;

import api.ScoreBox;

/**
 * Score box for a short straight.  A Combination
 * with N dice satisfies this category only if it includes
 * N - 1 distinct consecutive values.  For a dice group that satisfies
 * this category, the score is a fixed value specified in the constructor;
 * otherwise, the score is zero.
 */
//TODO: this class must implement ScoreBox or extend another class that does
public class ShortStraightScoreBox implements ScoreBox
{

  private String name;
  /**
   * Constructs a SmallStraightScoreBox with the given display name
   * and score.
   * @param displayName
   *   name of this score box
   * @param points
   *   points awarded for a dice group that satisfies this score box
   */  
  public ShortStraightScoreBox(String displayName, int points)
  {
    name = displayName;
  }

  public boolean isFilled() {return true;}

  public int getScore() {return 0;}

  public Combination getDice(){return null;}

  public String getDisplayName(){return name;}

  public void fill(Combination dice){}

  public boolean isSatisfiedBy(int[] arr) {return true;}

  public int getPotentialScore(int[] arr) {return 0;}

}
