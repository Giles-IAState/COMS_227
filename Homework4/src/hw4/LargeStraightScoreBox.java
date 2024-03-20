package hw4;

import api.ScoreBox;

/**
 * Score box for a large straight.  A Combination
 * with N dice satisfies this category only if it consists of
 * N distinct consecutive values.  For a dice group that satisfies
 * this category, the score is a fixed value specified in the constructor;
 * otherwise, the score is zero.
 * 
 * @author Cole Giles
 */
//TODO: this class must implement ScoreBox or extend another class that does
public class LargeStraightScoreBox implements ScoreBox
{
  private String name;

  /**
   * Constructs a LargeStraightScoreBox with the given display name
   * and score.
   * @param displayName
   *   name of this score box
   * @param points
   *   points awarded for a dice group that satisfies this score box
   */  
  public LargeStraightScoreBox(String displayName, int points)
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
