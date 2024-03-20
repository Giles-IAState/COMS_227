package hw4;

import api.ScoreBox;

/**
 * Score box for a given number N of matching dice, where N is specified
 * in the constructor.  A Combination satisfies this category only if it has 
 * (at least) N dice that are the same.  For a Combination that satisfies 
 * this category, the score is the sum of the N dice that have the same value.
 * If there are multiple groups of N with the same value, the group with highest value 
 * is used for the score.  For example, if N is 3 and the combination
 * is (2, 2, 2, 5, 5, 5, 5, 6), the score is 15.
 */
//TODO: this class must implement ScoreBox or extend another class that does
public class NOfAKindScoreBox implements ScoreBox
{
  private String name;
  /**
   * Constructs a NOfAKindScoreBox with the given display name
   * and score.
   * @param displayName
   *   name of this score box
   * @param howMany
   *   how many dice must match to satisfy this score box
   */  
  public NOfAKindScoreBox(String displayName, int howMany)
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
